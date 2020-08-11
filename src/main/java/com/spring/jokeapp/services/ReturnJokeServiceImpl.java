package com.spring.jokeapp.services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class ReturnJokeServiceImpl implements ReturnJokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ReturnJokeServiceImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String returnJoke() {
       return chuckNorrisQuotes.getRandomQuote();
    }
}
