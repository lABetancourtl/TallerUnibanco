package co.edu.uniquindio.tallerunibanco_1.exceptions;

public class ValorRequeridoException extends Exception{
    public ValorRequeridoException(String cliente) {
        super(String.format("El %s es requerido",cliente));
    }
}
