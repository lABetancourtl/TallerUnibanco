package co.edu.uniquindio.tallerunibanco_1.modelo;

import co.edu.uniquindio.tallerunibanco_1.exceptions.ValorRequeridoException;

import java.util.Objects;

public class Cliente  extends Persona{


    public Cliente(String nombre, String apellido, String cedula, String direccion, String email) {
        super(nombre, apellido, cedula, direccion, email);
    }

    public static Cliente of(String nombre, String apellido, String cedula, String direccion, String email) throws ValorRequeridoException {
        if(Objects.requireNonNull(cedula,"El número de identificación es requerido").isEmpty()){
            throw new ValorRequeridoException("número de identificación");
        }
        if(Objects.requireNonNull(nombre,"El nombre es requerido").isEmpty()){
            throw new ValorRequeridoException("nombre");
        }
        if(Objects.requireNonNull(apellido,"El apellido es requerido").isEmpty()){
            throw new ValorRequeridoException("apellido");
        }
        if(Objects.requireNonNull(direccion,"La direccion es requerido").isEmpty()){
            throw new ValorRequeridoException("direccion");
        }
        if(Objects.requireNonNull(email,"El email es requerido").isEmpty()){
            throw new ValorRequeridoException("email");
        }
        return new Cliente( nombre,  apellido,  cedula,  direccion,  email);
    }
    

}
