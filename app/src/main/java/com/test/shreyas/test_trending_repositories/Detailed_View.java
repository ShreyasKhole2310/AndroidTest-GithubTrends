package com.test.shreyas.test_trending_repositories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.widget.Toast;


public class Detailed_View extends AppCompatActivity {

    private AppCompatTextView repo_fullname, repo_created_at, repo_updated_at;
    private AppCompatTextView repo_forks, repo_issues, repo_name,repo_score;
    private AppCompatTextView repo_desc,html_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed__view);

        repo_fullname = findViewById(R.id.repo_fullname);
        repo_created_at = findViewById(R.id.repo_created_at);
        repo_updated_at = findViewById(R.id.repo_updated_at);
        repo_forks = findViewById(R.id.repo_forks);
        repo_issues = findViewById(R.id.repo_open_issues);
        repo_name = findViewById(R.id.repo_name);
        repo_score = findViewById(R.id.repo_score);
        repo_desc = findViewById(R.id.repo_desc);
        html_url = findViewById(R.id.html_url);
        setData();

    }

    public void setData() {
        try {
            Repository_List repo = (Repository_List) getIntent().getExtras().getSerializable("MyClass");
            assert repo != null;
            repo_fullname.setText(String.format("Full Name:%s", repo.getFull_name()));
            repo_created_at.setText(String.format("Pushed At: %s", repo.getPushed_at()));
            repo_updated_at.setText(String.format("Updated at: %s", repo.getUpdated_at()));
            repo_score.setText(String.format("Score: %s",repo.getScore()));
            repo_name.setText(String.format("Name: %s", repo.getName()));
            repo_issues.setText(String.format("No of Issues: %s", repo.getOpen_issues()));
            repo_forks.setText(String.format("Forks: %s",repo.getForks()));
            repo_desc.setText(String.format("Description: %s", repo.getDescription()));
            html_url.setText(String.format("HTML Link: %s", repo.getHtml_url()));
        } catch (Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
