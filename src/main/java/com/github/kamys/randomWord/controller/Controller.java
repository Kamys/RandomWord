package com.github.kamys.randomWord.controller;

import com.github.kamys.randomWord.view.View;

/**
 * Use for collaboration Model and View.
 */
public abstract class Controller<M, V extends View> {
    private V view;
    private M model;

    public Controller(V view, M model) {
        this.view = view;
        this.model = model;
    }

    public Controller() {
    }

    public V getView() {
        return view;
    }

    public void setView(V view) {
        this.view = view;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    public void update() {
        settingValue(view, model);
        view.show();
    }

    protected abstract void settingValue(V view, M model);
}
