package com.example.weekday_lecture_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE="com.example.weekday_lecture_03.cons1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void sendMessage(View v)
    {
        Intent i=new Intent(this,DisplayActivity.class);

        EditText et=findViewById(R.id.etMessage);
        String s=et.getText().toString();

        i.putExtra(EXTRA_MESSAGE,s);

        startActivity(i);

    }

}