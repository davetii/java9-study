package com.greatwideweb.joke.server;

import java.util.ArrayList;
import java.util.List;

public class JokeServer {

    public List<Joke> allJokes;

    public JokeServer() {
        allJokes = new ArrayList<>();
        allJokes.add(new Joke("Helvetica and Times New Roman walk into a bar", "Get out of here shouted the brartender, we dont server your type")); 
        allJokes.add(new Joke("Did you hear about the actor who fell through the floorboards", "He was just going through a stage")); 
        allJokes.add(new Joke("What did the janitor say when he jumped out of the closest", "Supplies")); 
        allJokes.add(new Joke("Did you hear about the claustrophobic astronaut", "He just needed a little space")); 
        allJokes.add(new Joke("Why didnt the skeleton go to the dance", "Because he had nobody to go with")); 
    }

    public List<Joke> getJokes() {
        return allJokes;
    }
}


