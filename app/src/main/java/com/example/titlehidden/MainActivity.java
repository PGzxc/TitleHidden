package com.example.titlehidden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();
    }

    private void setListener() {
        findViewById(R.id.btn_appcompat_title).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(AppcompatTitleActivity.class);
            }
        });
        findViewById(R.id.btn_activity_title).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(TitleActivity.class);
            }
        });
        findViewById(R.id.btn_title_hidden_comm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(TitleHiddenCommentActivity.class);
            }
        });
        findViewById(R.id.btn_actionbar_hidden1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ActionBarHiddenActivity1.class);
            }
        });
        findViewById(R.id.btn_full_screen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(FullScreenActivity.class);
            }
        });
        findViewById(R.id.btn_navigation_hidden).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(NavigationBarHiddenActivity.class);
            }
        });

    }

    public void startActivity(Class cls) {
        Intent intent = new Intent(MainActivity.this, cls);
        startActivity(intent);
    }
}
