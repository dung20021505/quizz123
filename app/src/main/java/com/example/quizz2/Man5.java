package com.example.quizz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


public class Man5 extends AppCompatActivity {
    ArrayList<String> arrayQues;


    ListView ls;

    String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest mammal?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the powerhouse of the cell?"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man5);

        ls = findViewById(R.id.listview);

        arrayQues = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            arrayQues.add(questions[i]);
        }


        ArrayAdapter adapter = new ArrayAdapter(
                getApplicationContext(), android.R.layout.simple_list_item_1, arrayQues
        );

        ls.setAdapter(adapter);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), Man6.class);
                intent.putExtra("Question", i);
                startActivity(intent);
            }
        });
    }

}