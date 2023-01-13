package com.example.javaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME="com.example.javaquizapp.mainactivity.name";
    Button button1;
    EditText name1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button);
        name1 = findViewById(R.id.name);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nametext= name1.getText().toString();
                Intent intent= new Intent(MainActivity.this,QuizPage.class);
                intent.putExtra(EXTRA_NAME,nametext);
                startActivity(intent);
            }
        });
    }
}