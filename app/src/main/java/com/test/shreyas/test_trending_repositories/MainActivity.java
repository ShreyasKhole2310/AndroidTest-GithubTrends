package com.test.shreyas.test_trending_repositories;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.test.shreyas.test_trending_repositories.Retrofit_class.JsonResponse;
import com.test.shreyas.test_trending_repositories.Retrofit_class.RequestInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_Repositories;
    private Repository_rv_Adapter rv_adapter;
    private List<Repository_List> rv_list;
    private ProgressBar progressBar;
//    https://api.github.com/search/repositories?q=topic:android&sort=stars&order=desc
    private static final String repo_URL = "https://api.github.com/search/?q=topic:android&sort=stars&order=desc";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    public void initViews(){
        progressBar = findViewById(R.id.progress);
        rv_Repositories = findViewById(R.id.rv_Repositories);
        rv_list = new ArrayList<>();
        rv_adapter = new Repository_rv_Adapter(rv_list, MainActivity.this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rv_Repositories.setLayoutManager(layoutManager);
        loadJSON();

    }

    private void loadJSON(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(repo_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestInterface request = retrofit.create(RequestInterface.class);
        Call<JsonResponse> call = request.getJSON("topic:android","stars", "desc");
        call.enqueue(new Callback<JsonResponse>() {
            @Override
            public void onResponse(Call<JsonResponse> call, Response<JsonResponse> response) {

                JsonResponse jsonResponse = response.body();
                rv_list = new ArrayList<>(Arrays.asList(jsonResponse.getAndroid()));
                rv_adapter = new Repository_rv_Adapter(rv_list,MainActivity.this);
                rv_Repositories.setAdapter(rv_adapter);
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<JsonResponse> call, Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
    }
}
