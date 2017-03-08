package com.github.kamys.randomWord.controller;

import com.github.kamys.randomWord.model.RandomGenerator;
import com.github.kamys.randomWord.model.TextSelector;
import com.github.kamys.randomWord.view.RandomGeneratorView;
import com.github.kamys.randomWord.view.TextSelectorView;
import org.apache.log4j.Logger;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 * Use for collaboration {@link TextSelector} and {@link TextSelectorView}.
 */
public class TextSelectorController extends Controller<TextSelector, TextSelectorView> {
    private static final Logger LOGGER = Logger.getLogger(TextSelectorController.class);
    public TextSelectorController(TextSelectorView view, TextSelector model) {
        super(view, model);
    }

    public TextSelectorController() {
    }

    protected void settingValue() {
        getView().setListeners(new TextSelectListener());
    }

    private void showRandomWord(File selectedFile) {
        getView().hide();
        try {
            String text = getModel().select(selectedFile);
            new RandomGeneratorController(
                    new RandomGeneratorView(),
                    new RandomGenerator(text)
            ).update();
        } catch (IOException e) {
            LOGGER.error(e);
            getView().showError(e.getMessage());
        }
    }

    private class TextSelectListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new FileNameExtensionFilter("Txt file", "txt"));
            chooser.showOpenDialog(null);
            File selectedFile = chooser.getSelectedFile();
            if (selectedFile != null) {
                showRandomWord(selectedFile);
            }else {
                getView().showError("File not needs equal null.");
            }
        }
    }
}
