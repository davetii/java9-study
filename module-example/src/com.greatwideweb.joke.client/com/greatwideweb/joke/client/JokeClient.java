package com.greatwideweb.joke.client;

import com.greatwideweb.joke.server.JokeServer;

public class JokeClient {

    public static void main(String[] args) {
        System.out.println("Hello World");
        JokeServer server = new JokeServer();
        server.getJokes().stream().forEach( s -> {
            System.out.println("setup: " + s.getSetup());
            System.out.println("punchline: " + s.getPunchline());
            System.out.println("\n");
        });
    }
}