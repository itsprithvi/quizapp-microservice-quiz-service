package com.prithvi.quizservice.model;


import lombok.Data;

@Data
public class QuizDto {
    String category;
    Integer numQuestions;
    String title;
}
