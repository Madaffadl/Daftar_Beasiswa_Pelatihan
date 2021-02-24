package com.example.defapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class def1app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_def1app);
    }

    public void page1(View view) {
        Intent intent = new Intent(def1app.this,def2app.class);
        startActivity(intent);
    }
}