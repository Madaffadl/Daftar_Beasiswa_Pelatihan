package com.example.defapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class def2app extends AppCompatActivity {

    public Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_def2app);

        sp = (Spinner) findViewById(R.id.spinner);

        // untuk membuat list tema pelatihan
        List<String> item = new ArrayList<>();
        item.add("Networking Academy");
        item.add("Front-end Developer");
        item.add("Back-end Developer");
        item.add("Artificial Intelegence");
        item.add("IT Essentials");
        item.add("Android Developer");
        item.add("Cyber Security");
        item.add("UI/UX Design");

        // Untuk membuat adapter listnya
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(def2app.this, android.R.layout.simple_spinner_dropdown_item,item);

        // untuk menentukan model adapternya
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        sp.setAdapter(adapter);

    }

    public void page2(View view) {
        Intent intent = new Intent(def2app.this,def3app.class);
        startActivity(intent);
    }
}