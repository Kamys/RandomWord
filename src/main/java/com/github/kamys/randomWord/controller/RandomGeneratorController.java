package com.github.kamys.randomWord.controller;

import com.github.kamys.randomWord.model.RandomGenerator;
import com.github.kamys.randomWord.view.RandomGeneratorView;

/**
 * Created by Kamys on 09.03.2017.
 * TODO: Add doc.
 */
public class RandomGeneratorController extends Controller<RandomGenerator,RandomGeneratorView> {

    public RandomGeneratorController(RandomGeneratorView view, RandomGenerator model) {
        super(view, model);
    }

    public RandomGeneratorController() {
    }

    @Override
    protected void settingValue() {
        getView().setRandomWord(getModel().generate());
    }
}
