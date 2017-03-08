package com.github.kamys.randomWord.view;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Use for to display {@link com.github.kamys.randomWord.model.TextSelector}.
 */
public class TextSelectorView extends SwingView {

    private final String text = "Please select text!";
    private File selectedFile;

    public File getSelectedFile() {
        return selectedFile;
    }

    public void setSelectedFile(File selectedFile) {
        this.selectedFile = selectedFile;
    }

    void settingDataInFrame(final JFrame frame) {
        JButton button = new JButton("Select text");
        button.addActionListener(new TextSelectListener());
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        frame.add(label, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);
    }

    private class TextSelectListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new FileNameExtensionFilter("Txt file","txt"));
            chooser.showOpenDialog(null);
            selectedFile = chooser.getSelectedFile();
        }
    }
}
