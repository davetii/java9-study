package com.greatwideweb.joke.server;

public class Joke {

    private final String setup;
    private final String punchline;

    public Joke(String newSetup, String newPunchline) {
        this.setup = newSetup;
        this.punchline = newPunchline;
    }

    public String getSetup() {
        return this.setup;
    }

    public String getPunchline() {
        return this.punchline;
    }
}
