package com.spring.jokeapp.controllers;

import com.spring.jokeapp.services.ReturnJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private ReturnJokeService returnJokeService;

    @Autowired
    public JokeController(ReturnJokeService returnJokeService){
        this.returnJokeService = returnJokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", returnJokeService.returnJoke());
        return "chucknorris";
    }
}
