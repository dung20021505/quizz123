package com.example.quizz2;

import java.io.Serializable;

public class Question implements Serializable { {

    public static String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest mammal?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the powerhouse of the cell?"
    };

    public static String[][] options = {
            {"Paris", "Berlin", "London", "Madrid"},
            {"Venus", "Mars", "Jupiter", "Saturn"},
            {"Elephant", "Blue Whale", "Giraffe", "Gorilla"},
            {"William Shakespeare", "Jane Austen", "Charles Dickens", "Mark Twain"},
            {"Nucleus", "Mitochondria", "Chloroplast", "Ribosome"}
    };

    public static String[] result = {
            "Paris",
            "Venus",
            "Elephant",
            "William Shakespeare",
            "Nucleus"
    };

    // Các phương thức khác nếu cần
}
