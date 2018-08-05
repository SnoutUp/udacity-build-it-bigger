package com.udacity.garuolis.jokelib;

import java.util.Random;

public class JokeTeller {
    static Random random = new Random();

    public static String TellMeSomeJoke() {
        String[] jokes = new String[5];
        jokes[0] = "Did you hear about the crook who stole a calendar? He got twelve months.";
        jokes[1] = "Q. What’s the difference between ignorance and apathy? A. I don’t know and I don’t care.";
        jokes[2] = "I woke up this morning and forgot which side the sun rises from, then it dawned on me.";
        jokes[3] = "I own the world’s worst thesaurus. Not only is it awful, it’s awful.";
        jokes[4] = "I hate Russian dolls, they’re so full of themselves.";
        return jokes[random.nextInt(jokes.length)];
    }
}

