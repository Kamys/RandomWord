package com.github.kamys.randomWord.controller;

import com.github.kamys.randomWord.model.RandomGenerator;
import com.github.kamys.randomWord.view.RandomGeneratorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Use for collaboration {@link RandomGenerator} and {@link RandomGeneratorView}.
 */
public class RandomGeneratorController extends Controller<RandomGenerator,RandomGeneratorView> {

    public RandomGeneratorController(RandomGeneratorView view, RandomGenerator model) {
        super(view, model);
    }

    public RandomGeneratorController() {
    }

    @Override
    protected void settingValue() {
        RandomGeneratorView view = getView();
        view.setRandomWord(getModel().generate());
        view.setListener(new RandomGeneratorListener());
    }

    private class RandomGeneratorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            RandomGeneratorView view = getView();
            view.setRandomWord(getModel().generate());
            view.show();
        }
    }
}
