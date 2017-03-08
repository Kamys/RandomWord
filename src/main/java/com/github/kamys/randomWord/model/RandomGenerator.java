package com.github.kamys.randomWord.model;

import org.apache.log4j.Logger;

import java.util.Random;

/**
 * Use for get random word from text.
 */
public class RandomGenerator {
    private static final Logger LOGGER = Logger.getLogger(RandomGenerator.class);
    private final String text;

    public RandomGenerator(String text) {
        this.text = text;
        LOGGER.trace("Create txt = "+text);
    }

    public String generate() {
        LOGGER.trace("generate: " + text);
        String[] split = text.split(" ");
        final int length = split.length;
        final int randomIndex = new Random().nextInt(length);
        LOGGER.debug("generate: length = " + length + " randomIndex = " + randomIndex);
        String result = split[randomIndex];
        LOGGER.info("generate: result = " + result);
        return result;
    }
}
