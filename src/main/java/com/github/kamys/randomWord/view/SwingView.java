package com.github.kamys.randomWord.view;

import javax.swing.*;

/**
 * Use for to display model using Swing.
 */
public abstract class SwingView implements View {
    private String title = "Text selector.";
    private JFrame frame = new JFrame();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Show model in JFrame.
     */
    public void show() {
        frame.setTitle(title);
        settingDataInFrame(frame);
        showFrame();
    }

    /**
     * Use for sitting JFrame before show.
     */
    private void showFrame() {
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Use for setting data in JFrame.
     * @param frame JFrame which need set data.
     */
    abstract void settingDataInFrame(JFrame frame);
}

