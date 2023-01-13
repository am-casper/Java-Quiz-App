package com.example.javaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizPage extends AppCompatActivity {
    public static final String EXTRA_GIVEN="com.example.javaquizapp.quizpage.given";
    public static final String EXTRA_NAME1="com.example.javaquizapp.quizpage.name";
    String[] ques={"1. Java is a Low Level Language?","2. Java is an Object Oriented?","3. Java has inheritance?","4. Java is a Fruit?","5. Java is used to make apps?"};
    Boolean[] ans={false,true, true,false,true};
    ArrayList<String> given= new ArrayList<String>(0);
    TextView text;
    TextView question;
    Button yes,no;
    int i=0,score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);
        text = findViewById(R.id.textView3);
        question = findViewById(R.id.question);
        Intent intent= getIntent();
        String name= intent.getStringExtra(MainActivity.EXTRA_NAME);
        Intent intent2= new Intent(QuizPage.this,Result.class);
        intent2.putExtra(EXTRA_NAME1,name);
        text.setText("Your name: "+name);
        yes= findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question.setText(ques[i]);
        given.add("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tYour Name: "+name);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i<ques.length){

                    if(ans[i]==true){
                        score++;
                    }

                        given.add("\t"+ques[i]);

                        given.add("\t\t\tYou Answered:True");
                        given.add("\t\t\tCorrect Answer is:"+ ans[i]);
                        given.add("");
                        i++;
                    if(i<ques.length){
                        question.setText(ques[i]);}
                    else {
                        Intent intent2= new Intent(QuizPage.this,Result.class);
                        intent2.putExtra(EXTRA_GIVEN,given);
                        Toast.makeText(QuizPage.this, "Your Score is "+score, Toast.LENGTH_SHORT).show();
//
                        startActivity(intent2);
                }}

            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i<ques.length){

                    if(ans[i]==false){
                        score++;
                    }

                    given.add("\t"+ques[i]);

                    given.add("\t\t\tYou Answered:False");
                    given.add("\t\t\tCorrect Answer is:"+ ans[i]);
                    given.add("");
                    i++;
                    if(i<ques.length){
                        question.setText(ques[i]);}
                    else {
                        Intent intent2= new Intent(QuizPage.this,Result.class);
                        intent2.putExtra(EXTRA_GIVEN,given);
                        Toast.makeText(QuizPage.this, "Your Score is "+score, Toast.LENGTH_SHORT).show();
//
                        startActivity(intent2);
                    }}

            }

        });


        }}

