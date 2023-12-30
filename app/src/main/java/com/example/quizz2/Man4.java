package com.example.quizz2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Man4 extends AppCompatActivity {

    String totalpoint;

    String TotalPoint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_man4);

            totalpoint = getIntent().getStringExtra("PỌINT"); // Lấy giá trị dưới dạng int, mặc định là 0 nếu không có giá trị
            TextView scoreTextView = findViewById(R.id.textView10);
            scoreTextView.setText( totalpoint);
        }

    }
