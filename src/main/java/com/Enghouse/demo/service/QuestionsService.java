package com.Enghouse.demo.service;

import com.Enghouse.demo.model.Questions;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionsService {

    public List<Questions> getQuestions();
    public Questions saveAnswer(Questions question);

}
