package co.edu.uniquindio.tallerunibanco_1.modelo;

import co.edu.uniquindio.tallerunibanco_1.exceptions.PersonaExisteException;
import co.edu.uniquindio.tallerunibanco_1.exceptions.PersonaNoExisteException;
import co.edu.uniquindio.tallerunibanco_1.exceptions.ValorRequeridoException;
import co.edu.uniquindio.tallerunibanco_1.utils.ClienteUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Banco {
    private String nombre;
    private String nit;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Transaccion> transacciones;
    private ArrayList<Empleado> empleados;

    //private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private List<Cliente> listaClientes;

    //Constructor


    public Banco() {
        listaClientes = new ArrayList<>();
    }

    public void adicionarPersona(Cliente cliente) throws PersonaExisteException {
        if( buscarPersonaByNumeroIdentificacion(cliente.getCedula() ).isPresent() ){
            throw new PersonaExisteException();
        }
        listaClientes.add(cliente);
    }

    public void removerPersona(String cedula) throws PersonaNoExisteException, ValorRequeridoException {
        if(Objects.requireNonNull(cedula,"El número de identificación es requerido").isEmpty()){
            throw new ValorRequeridoException("número de identificación");
        }
        Optional<Cliente> cliente = buscarPersonaByNumeroIdentificacion(cedula);
        if( cliente.isEmpty() ){
            throw new PersonaNoExisteException();
        }
        listaClientes.remove(cliente.get());
    }

    public List<Cliente> buscar(String nombre, String apellido, String cedula, String direccion, String email){
        return listaClientes.stream()
                .filter(ClienteUtil.buscarPorTodo(nombre, apellido, cedula, direccion, email))
                .collect(Collectors.toUnmodifiableList());
    }

    public Optional<Cliente> buscarPersonaByNumeroIdentificacion(String cedula) {
        return listaClientes.stream()
                .filter(ClienteUtil.buscarPorNumeroIdentificacion(cedula))
                .findFirst();
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

    public ArrayList<Cliente> getListaClientes() {
        return (ArrayList<Cliente>) listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    private void inicializarDatos() {

    }
}
