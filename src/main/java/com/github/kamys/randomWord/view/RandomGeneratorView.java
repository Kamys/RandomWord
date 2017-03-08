package com.github.kamys.randomWord.view;

import org.apache.log4j.Logger;

import javax.swing.*;

/**
 * Created by Kamys on 09.03.2017.
 * TODO: Add doc.
 */
public class RandomGeneratorView extends SwingView {
    private static final Logger LOGGER = Logger.getLogger(RandomGeneratorView.class);
    private String randomWord;

    public String getRandomWord() {
        return randomWord;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    @Override
    void settingDataInFrame(JFrame frame) {
        LOGGER.trace("settingDataInFrame: randomWord = "+randomWord);
        frame.add(new JLabel(randomWord,SwingConstants.CENTER));
    }
}
