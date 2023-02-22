package co.edu.uniquindio.tallerunibanco_1.modelo;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private String nit;
    private ArrayList<Cliente> clientes;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Transaccion> transacciones;
    private ArrayList<Empleado> empleados;

    //Constructor


    public Banco(String nombre, String nit, ArrayList<Cliente> clientes, ArrayList<Cuenta> cuentas,
                 ArrayList<Transaccion> transacciones, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.nit = nit;
        this.clientes = clientes;
        this.cuentas = cuentas;
        this.transacciones = transacciones;
        this.empleados = empleados;
    }

    //getters and setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
