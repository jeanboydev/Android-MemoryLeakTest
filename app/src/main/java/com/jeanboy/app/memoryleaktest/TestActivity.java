package com.jeanboy.app.memoryleaktest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TestActivity extends AppCompatActivity {

    private static Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        context = this;

    }
}
