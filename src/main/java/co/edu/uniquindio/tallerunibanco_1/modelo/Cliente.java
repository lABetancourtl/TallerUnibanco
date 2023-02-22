package co.edu.uniquindio.tallerunibanco_1.modelo;

public class Cliente  extends Persona{

    private Cuenta cuentaAsociada;

    public Cliente(String nombre, String apellido, String cedula, String direccion, String email, Cuenta cuentaAsociada) {
        super(nombre, apellido, cedula, direccion, email);
        this.cuentaAsociada = cuentaAsociada;
    }

    public Cuenta getCuentaAsociada() {
        return cuentaAsociada;
    }

    public void setCuentaAsociada(Cuenta cuentaAsociada) {
        this.cuentaAsociada = cuentaAsociada;
    }
}
