package com.github.kamys.randomWord.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Use for to display {@link com.github.kamys.randomWord.model.TextSelector}.
 */
public class TextSelectorView extends SwingView {

    private ActionListener listeners;

    public ActionListener getListeners() {
        return listeners;
    }

    public void setListeners(ActionListener listeners) {
        this.listeners = listeners;
    }

    void settingDataInFrame(final JFrame frame) {
        final String textForButton = "Select textForLabel";
        final String textForLabel = "Please select textForLabel!";

        JButton button = new JButton(textForButton);
        button.addActionListener(listeners);
        frame.add(button, BorderLayout.SOUTH);

        JLabel label = new JLabel(textForLabel, SwingConstants.CENTER);
        frame.add(label, BorderLayout.CENTER);
    }
}
