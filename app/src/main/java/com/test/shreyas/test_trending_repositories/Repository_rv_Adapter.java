package com.test.shreyas.test_trending_repositories;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class Repository_rv_Adapter extends
        RecyclerView.Adapter<Repository_rv_Adapter.MyViewHolder> {

    public Repository_rv_Adapter(List<Repository_List> list, Context cnt) {
        this.repo_list = list;
        this.cnt = cnt;
    }

    private List<Repository_List> repo_list;
    private Context cnt;

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(cnt).inflate(R.layout.layout_repo_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final Repository_List repo = repo_list.get(position);

        holder.repo_name.setText(String.format("Repository Name: %s", repo.getName()));
        holder.repo_lang.setText(String.format("Language: %s", repo.getRepo_lang()));
        holder.rl_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detail_activity = new Intent(cnt.getApplicationContext(), Detailed_View.class);
                detail_activity.putExtra("MyClass", repo);
                cnt.startActivity(detail_activity);
            }
        });
    }

    @Override
    public int getItemCount() {
        return repo_list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView repo_name,repo_lang;
        public RelativeLayout rl_layout;
        public MyViewHolder(View itemView) {
            super(itemView);

            repo_name = itemView.findViewById(R.id.name);
            repo_lang = itemView.findViewById(R.id.repo_lang);
            rl_layout = itemView.findViewById(R.id.rl_layout);
        }
    }
}
