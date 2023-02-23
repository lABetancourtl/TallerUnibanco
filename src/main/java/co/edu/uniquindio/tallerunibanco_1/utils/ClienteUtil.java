package co.edu.uniquindio.tallerunibanco_1.utils;

import co.edu.uniquindio.tallerunibanco_1.modelo.Cliente;

import java.util.function.Predicate;

public class ClienteUtil {

    public static Predicate<Cliente> buscarPorNombre(String nombre){
        return listaClientes -> listaClientes.getNombre().contains(nombre);
    }

    public static Predicate<Cliente> buscarPorApellido(String apellido){
        return listaClientes -> listaClientes.getApellido().contains(apellido);
    }
    public static Predicate<Cliente> buscarPorNumeroIdentificacion(String cedula){
        return persona -> persona.getCedula().equals(cedula);
    }

    public static Predicate<Cliente> buscarPorTodo(String nombre, String apellido, String cedula, String direccion, String email) {
        Predicate<Cliente> predicado = listaClientes -> true;
        if( nombre != null && !nombre.isEmpty() ){
            predicado = predicado.and(buscarPorNombre(nombre));
        }
        if( apellido != null && !apellido.isEmpty() ){
            predicado = predicado.and(buscarPorApellido(apellido));
        }
        if( cedula != null && !cedula.isEmpty() ){
            predicado = predicado.and(buscarPorNumeroIdentificacion(cedula));
        }
        if( direccion != null && !direccion.isEmpty() ){
            predicado = predicado.and(buscarPorApellido(direccion));
        }
        if( email != null && !email.isEmpty() ){
            predicado = predicado.and(buscarPorApellido(email));
        }
        return predicado;
    }
}
