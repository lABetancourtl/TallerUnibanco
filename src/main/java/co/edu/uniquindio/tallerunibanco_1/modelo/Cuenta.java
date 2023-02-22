package co.edu.uniquindio.tallerunibanco_1.modelo;

public class Cuenta {
    private String numeroCuenta;
    private float saldoCuenta;
    private Cliente clienteAsociado;

    //constructors

    public Cuenta(String numeroCuenta, float saldoCuenta, Cliente clienteAsociado) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.clienteAsociado = clienteAsociado;
    }


    //getters y setters


    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(float saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }
}
