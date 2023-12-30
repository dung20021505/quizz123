package com.example.quizz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Man3 extends AppCompatActivity {

    // Khai báo các thành phần giao diện
    private TextView questionTextView;
    private RadioButton option1RadioButton, option2RadioButton, option3RadioButton, option4RadioButton;
    private Button nextButton;

    String savedTopicName;

    String savedLevel;

    // Khai báo các biến dùng để quản lý trạng thái của trò chơi
    private int currentQuestionIndex = 0;

    // Mảng options đã được giải thích ở trên
    int point = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man3);
        savedTopicName = getIntent().getStringExtra("CATEGORY");
        if (savedTopicName != "history"){
            navigateToMan5();
        }
        savedLevel = getIntent().getStringExtra("HARD_MODE");

        // Ánh xạ các thành phần giao diện với biến tương ứng
        questionTextView = findViewById(R.id.Question);
        option1RadioButton = findViewById(R.id.answerA);
        option2RadioButton = findViewById(R.id.answerB);
        option3RadioButton = findViewById(R.id.answerC);
        option4RadioButton = findViewById(R.id.answerD);
        nextButton = findViewById(R.id.button9);

        // Hiển thị câu hỏi đầu tiên khi ứng dụng bắt đầu
        displayQuestion();

        // Đặt sự kiện lắng nghe cho nút "Next"
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gọi hàm kiểm tra câu trả lời

                checkAnswer();
            }
        });
    }

    // Hàm hiển thị câu hỏi và các phương án lựa chọn tương ứng
    private void displayQuestion() {
        if (currentQuestionIndex < questions.length) {
            questionTextView.setText(questions[currentQuestionIndex]);
            option1RadioButton.setText(options[currentQuestionIndex][0]);
            option2RadioButton.setText(options[currentQuestionIndex][1]);
            option3RadioButton.setText(options[currentQuestionIndex][2]);
            option4RadioButton.setText(options[currentQuestionIndex][3]);
        } else {
            navigateToMan4(point);
        }
    }

    // Hàm kiểm tra câu trả lời
    private void checkAnswer() {
        String selectradio = "";
        if (option1RadioButton.isChecked()) {
            selectradio = option1RadioButton.getText().toString();
        }
        if (option2RadioButton.isChecked()) {
            selectradio = option2RadioButton.getText().toString();
        }
        if (option3RadioButton.isChecked()) {
            selectradio = option3RadioButton.getText().toString();
        }
        if (option4RadioButton.isChecked()) {
            selectradio = option4RadioButton.getText().toString();
        }
        // Lấy RadioButton được chọn
        if (selectradio != "") {
            // Lấy phương án mà người dùng đã chọn
            String selectedOption = selectradio;
            // Lấy phương án đúng, giả sử luôn ở vị trí đầu tiên
            String correctOption = result[currentQuestionIndex];

            if (selectedOption.equals(correctOption)) {
                // Nếu đúng, thông báo và chuyển sang câu hỏi tiếp theo
                point += 1;
//               else if (savedLevel.equals("hard")) point += 2;
                currentQuestionIndex++;
                displayQuestion();

            } else {
                navigateToMan4(point);
            }
        } else {
            // Nếu người dùng chưa chọn, yêu cầu chọn một đáp án
            Toast.makeText(this, "Please select an answer.", Toast.LENGTH_SHORT).show();
        }
    }
    private void navigateToMan4(int point) {
        Intent intent = new Intent(this, Man4.class);
        intent.putExtra("POINT", point);
        startActivity(intent);
    }


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
    private void navigateToMan5() {
        // Chuyển đến màn hình Man5
        Intent intent = new Intent(this, Man5.class);
        startActivity(intent);
    }
}
