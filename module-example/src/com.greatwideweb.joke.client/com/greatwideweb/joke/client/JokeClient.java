package com.greatwideweb.joke.client;

import com.greatwideweb.joke.server.JokeServer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JokeClient {


    private static final Logger log = Logger.getLogger(JokeClient.class.getName());
    public static void main(String[] args) {
        log.info("Hello World from logger");
        JokeServer server = new JokeServer();
        server.getJokes().stream().forEach( s -> {
            log.info("setup: " + s.getSetup());
            log.info("punchline: " + s.getPunchline());
            log.info("\n");
        });
    }
}