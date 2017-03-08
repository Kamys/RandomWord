package com.github.kamys.randomWord;


import com.github.kamys.randomWord.controller.TextSelectorController;
import com.github.kamys.randomWord.model.TextSelector;
import com.github.kamys.randomWord.view.TextSelectorView;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("Started.");
        TextSelectorController controller = new TextSelectorController(new TextSelectorView(), new TextSelector());
        controller.update();
    }
}
