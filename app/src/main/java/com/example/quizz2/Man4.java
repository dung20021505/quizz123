package com.example.quizz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Man4 extends AppCompatActivity {

    String totalpoint;

    String TotalPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man4);

        totalpoint = getIntent().getStringExtra("Point"); // Lấy giá trị dưới dạng int, mặc định là 0 nếu không có giá trị
        TextView scoreTextView = findViewById(R.id.textView10);
        scoreTextView.setText(totalpoint);
        Button button2 = findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Man3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
