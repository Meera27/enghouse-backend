package com.Enghouse.demo.service;

import com.Enghouse.demo.model.Questions;
import com.Enghouse.demo.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsServiceImpl implements QuestionsService{

    @Autowired
    private QuestionsRepository questionsrepository;


    @Override
    public List<Questions> getQuestions() {
        return questionsrepository.findAll();
    }

    @Override
    public Questions saveAnswer(Questions questions){
        return questionsrepository.save(questions);
    }
}
