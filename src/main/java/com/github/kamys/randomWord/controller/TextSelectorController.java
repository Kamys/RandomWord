package com.github.kamys.randomWord.controller;

import com.github.kamys.randomWord.model.TextSelector;
import com.github.kamys.randomWord.view.TextSelectorView;
import com.github.kamys.randomWord.view.View;

/**
 * Use for collaboration TextSelector and TextSelectorView.
 */
public class TextSelectorController extends Controller<TextSelector,TextSelectorView> {

    public TextSelectorController(TextSelectorView view, TextSelector model) {
        super(view, model);
    }

    public TextSelectorController() {
    }

    protected void settingValue(TextSelectorView view, TextSelector model) {

    }
}
