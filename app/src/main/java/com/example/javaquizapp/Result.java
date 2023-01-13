package com.example.javaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Result extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        list=findViewById(R.id.listview);
        Intent intent= getIntent();
        String name= intent.getStringExtra(QuizPage.EXTRA_NAME1);
        ArrayList<String> arrlist=intent.getStringArrayListExtra(QuizPage.EXTRA_GIVEN);
        String[] arr= arrlist.toArray(new String[arrlist.size()]);

        ArrayAdapter ad= new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        list.setAdapter(ad);
    }
}