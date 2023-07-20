package com.prithvi.quizservice.dao;


import com.prithvi.quizservice.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDAO extends JpaRepository<Quiz, Integer> {
}
