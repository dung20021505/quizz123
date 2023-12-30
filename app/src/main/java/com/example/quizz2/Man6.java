package com.example.quizz2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Man6 extends AppCompatActivity {

    TextView questionshow, textView13, textView14, textView16, textView17, textView18;
    ArrayList<String> arrayQues;
    ArrayList<String> arrayOptA;
    ArrayList<String> arrayOptB;
    ArrayList<String> arrayOptC;
    ArrayList<String> arrayOptD;
    ArrayList<String> arrayRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String[] questions = {
                "What is the capital of France?",
                "Which planet is known as the Red Planet?",
                "What is the largest mammal?",
                "Who wrote 'Romeo and Juliet'?",
                "What is the powerhouse of the cell?"
        };

        String[][] options = {
                {"Paris", "Berlin", "London", "Madrid"},
                {"Venus", "Mars", "Jupiter", "Saturn"},
                {"Elephant", "Blue Whale", "Giraffe", "Gorilla"},
                {"William Shakespeare", "Jane Austen", "Charles Dickens", "Mark Twain"},
                {"Nucleus", "Mitochondria", "Chloroplast", "Ribosome"}
        };

        String [] result = {
                "Paris",
                "Venus",
                "Elephant",
                "William Shakespeare",
                "Nucleus"
        };

        arrayQues = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            arrayQues.add(questions[i]);
        }

        arrayOptA = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            arrayOptA.add(options[i][0]);
        }

        arrayOptB = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            arrayOptB.add(options[i][1]);
        }

        arrayOptC = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            arrayOptC.add(options[i][2]);
        }

        arrayOptD = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            arrayOptD.add(options[i][3]);
        }

        arrayRes = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            arrayRes.add(result[i]);
        }

        questionshow = findViewById(R.id.QuestionShow);
        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);
        textView16 = findViewById(R.id.textView16);
        textView17 = findViewById(R.id.textView17);
        textView18 = findViewById(R.id.textView18);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man6);


        int numQuestion = getIntent().getIntExtra("Question", 0);


            questionshow.setText(arrayQues.get(numQuestion));
            textView13.setText(arrayOptA.get(numQuestion));
            textView14.setText(arrayOptB.get(numQuestion));
            textView16.setText(arrayOptC.get(numQuestion));
            textView17.setText(arrayOptD.get(numQuestion));


    }
}