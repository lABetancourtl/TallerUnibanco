package co.edu.uniquindio.tallerunibanco_1.controllers;

import co.edu.uniquindio.tallerunibanco_1.modelo.Banco;

public enum AppController {
    INSTANCE;
    private final Banco banco;

    AppController() {
        banco = new Banco();
    }

    public Banco getBanco() {
        return banco;
    }
}
