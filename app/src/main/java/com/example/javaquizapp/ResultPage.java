package com.example.javaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultPage extends AppCompatActivity {
    TextView nametext ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);
        nametext = findViewById(R.id.textView5);
        Intent intent1=getIntent();
        String namet=intent1.getStringExtra(QuizPage.EXTRA_NAME1);

        nametext.setText("Your name:"+ namet);
    }
}