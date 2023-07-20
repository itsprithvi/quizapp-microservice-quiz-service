package com.prithvi.quizservice.service;

import com.prithvi.quizservice.model.*;
import com.prithvi.quizservice.dao.QuizDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class QuizService {

    @Autowired
    QuizDAO quizDao;

//    @Autowired
//    QuestionDAO questionDAO;

    public ResponseEntity<String> createQuiz(String category, Integer numQuestions, String title) {

//        List<Integer> questions = // call the generate url -> RestTemplate http://localhost:8081/question/generate
//
//        Quiz quiz = new Quiz();
//        quiz.setTitle(title);
//        quiz.setQuestions(questions);
//        quizDao.save(quiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
//        Optional<Quiz> quiz = quizDao.findById(id);
//        List<Question>  questionFromDB = quiz.get().getQuestions();
//
//        List<QuestionWrapper> questionForUser = new ArrayList<>();
//
//        for(Question q : questionFromDB) {
//            QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestion_title(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
//            questionForUser.add(qw);
//        }

        return new ResponseEntity<>(questionForUser, HttpStatus.OK);
    }


    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizDao.findById(id).get();
//        List<Question> questions = quiz.getQuestions();
//        int right = 0;
//        int i = 0;
//        for(Response response : responses) {
//            if(response.getResponse().equals(questions.get(i).getRight_answer())) {
//                right++;
//            }
//            i++;
//        }

        return new ResponseEntity<>(right, HttpStatus.OK);
    }


}
