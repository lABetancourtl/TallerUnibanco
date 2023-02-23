package co.edu.uniquindio.tallerunibanco_1.exceptions;

public class PersonaNoExisteException extends Exception {
    public PersonaNoExisteException() {
        super("La persona no existe");
    }
}
