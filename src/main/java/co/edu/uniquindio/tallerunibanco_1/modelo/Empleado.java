package co.edu.uniquindio.tallerunibanco_1.modelo;

public class Empleado extends Persona{

    private Transaccion transaccionRealizada;

    // constructor


    public Empleado(String nombre, String apellido, String cedula, String direccion, String email,
                    Transaccion transaccionRealizada) {
        super(nombre, apellido, cedula, direccion, email);
        this.transaccionRealizada = transaccionRealizada;
    }

    //getters y setters

    public Transaccion getTransaccionRealizada() {
        return transaccionRealizada;
    }

    public void setTransaccionRealizada(Transaccion transaccionRealizada) {
        this.transaccionRealizada = transaccionRealizada;
    }
}
