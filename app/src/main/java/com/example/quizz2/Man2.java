package com.example.quizz2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Switch;
import android.widget.ImageButton;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;



public class Man2 extends AppCompatActivity {
    private int totalScore = 0;
    private SharedPreferences sharedPreferences;
    private Switch difficultySwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man2);
        difficultySwitch = findViewById(R.id.switch1);

        // Lắng nghe sự kiện khi thay đổi trạng thái của Switch
        difficultySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked == false){
                    navigateToMan5WithDifficulty("easy");
                }
                else {
                    navigateToMan5WithDifficulty("hard");
                }
            }
        });

        // Load the total score from SharedPreferences
        sharedPreferences = getPreferences(MODE_PRIVATE);
        totalScore = sharedPreferences.getInt("totalScore", 0);
        updateTotalScoreTextView();

        //Danh sách câu hỏi
        // Lắng nghe sự kiện khi nhấn vào Button2
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToMan5();
            }
        });

        // Xử lý image button
        // Lắng nghe sự kiện khi nhấn vào ImageButton "LỊCH SỬ"
        ImageButton historyButton = findViewById(R.id.history);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToQuestionActivity("History");
            }
        });
        // Lắng nghe sự kiện khi nhấn vào ImageButton "ĐỊA LÝ"
        ImageButton geographyButton = findViewById(R.id.geography);
        geographyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToQuestionActivity("Geography");
            }
        });
        // Lắng nghe sự kiện khi nhấn vào ImageButton "KHOA HỌC"
        ImageButton scienceButton = findViewById(R.id.science);
        scienceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToQuestionActivity("Science");
            }
        });
        // Lắng nghe sự kiện khi nhấn vào ImageButton "THỂ THAO"
        ImageButton sportButton = findViewById(R.id.sport);
        sportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToQuestionActivity("Sport");
            }
        });


    }

    private void updateTotalScoreTextView() {
        TextView totalScoreTextView = findViewById(R.id.totalScore);
        totalScoreTextView.setText("Total Score: " + totalScore);
    }
    private void navigateToQuestionActivity(String category) {
        // Chuyển đến màn hình Man3 và truyền chủ đề (category) qua Intent
        Intent intent = new Intent(this, Man3.class);
        intent.putExtra("CATEGORY", category);
        startActivity(intent);
    }
    private void navigateToMan5() {
        // Chuyển đến màn hình Man5
        Intent intent = new Intent(this, Man5.class);
        startActivity(intent);
    }

    private void navigateToMan5WithDifficulty(String isHardMode) {
        // Chuyển đến màn hình Man3 và truyền giá trị của Switch qua Intent
        Intent intent = new Intent(this, Man3.class);
        intent.putExtra("HARD_MODE", isHardMode);
    }


}