package com.greatwideweb.joke.client;

import com.greatwideweb.joke.server.JokeServer;

import java.lang.System.Logger;
import java.util.logging.Level;
//import java.util.logging.Logger;

public class JokeClient {


    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(JokeClient.class.getName());
    public static void main(String[] args) {
        LOGGER.info("Hello World from logger");
        JokeServer server = new JokeServer();
        server.getJokes().stream().forEach( s -> {
            LOGGER.info("setup: " + s.getSetup());
            LOGGER.info("punchline: " + s.getPunchline());
            LOGGER.info("\n");
        });
    }
}