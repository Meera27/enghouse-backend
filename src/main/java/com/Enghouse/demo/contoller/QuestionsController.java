package com.Enghouse.demo.contoller;

import com.Enghouse.demo.model.Questions;
import com.Enghouse.demo.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class QuestionsController {

    @Autowired
    private QuestionsService questionsService;

    @GetMapping("/all")
    public List<Questions> showAllQuestions(){
        return questionsService.getQuestions();
    }

    @PostMapping("/add")
    public String addAnswer(@RequestBody Questions questions){
        questionsService.saveAnswer(questions);
        return "Success!";
    }

}
