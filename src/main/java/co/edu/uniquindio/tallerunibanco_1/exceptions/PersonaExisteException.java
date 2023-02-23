package co.edu.uniquindio.tallerunibanco_1.exceptions;

public class PersonaExisteException extends Exception{
    public PersonaExisteException() {
        super("La persona ya esta en el bus");
    }
}
