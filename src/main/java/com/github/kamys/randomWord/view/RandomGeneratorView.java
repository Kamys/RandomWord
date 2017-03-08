package com.github.kamys.randomWord.view;

import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Use for to display random word from text.
 */
public class RandomGeneratorView extends SwingView {
    private static final Logger LOGGER = Logger.getLogger(RandomGeneratorView.class);
    private String randomWord;
    private ActionListener listener;

    public ActionListener getListener() {
        return listener;
    }

    public void setListener(ActionListener listener) {
        this.listener = listener;
    }

    public String getRandomWord() {
        return randomWord;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    @Override
    void settingDataInFrame(JFrame frame) {
        LOGGER.trace("settingDataInFrame: randomWord = " + randomWord);
        JButton button = new JButton("Go!");
        button.addActionListener(listener);
        frame.add(button, BorderLayout.SOUTH);

        frame.add(new JLabel(randomWord, SwingConstants.CENTER), BorderLayout.CENTER);
    }
}
