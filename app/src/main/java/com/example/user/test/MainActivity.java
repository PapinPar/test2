package com.example.user.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test", "test");
        Log.d("test", "test2");
        Log.d("test", "new branch");
        Log.d("test", "new branch 2 commit");
        Log.d("test", "change in master");
        String s = "change from git";
        String s = "change from git 2";
    }
}
