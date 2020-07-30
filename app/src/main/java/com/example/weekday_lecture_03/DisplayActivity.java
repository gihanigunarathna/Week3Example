package com.example.weekday_lecture_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);


        Intent i=getIntent();

        String s=i.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView result=findViewById(R.id.tvResult);

        result.setText(s);
    }
}