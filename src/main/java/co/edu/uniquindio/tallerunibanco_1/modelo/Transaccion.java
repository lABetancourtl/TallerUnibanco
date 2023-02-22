package co.edu.uniquindio.tallerunibanco_1.modelo;
import java.util.Calendar;
import java.util.Date;

public class Transaccion {
    private Cuenta cuenta;
    private float valorTransaccion;
    private Calendar fechaTransaccion;
    private Date horaTransaccion;
    private String tipoTransaccion;
    private String estadoTransaccion;

    // constructor


    public Transaccion(Cuenta cuenta, float valorTransaccion, Calendar fechaTransaccion,
                       Date horaTransaccion, String tipoTransaccion, String estadoTransaccion) {
        this.cuenta = cuenta;
        this.valorTransaccion = valorTransaccion;
        this.fechaTransaccion = fechaTransaccion;
        this.horaTransaccion = horaTransaccion;
        this.tipoTransaccion = tipoTransaccion;
        this.estadoTransaccion = estadoTransaccion;
    }

    // getters y setters


    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public float getValorTransaccion() {
        return valorTransaccion;
    }

    public void setValorTransaccion(float valorTransaccion) {
        this.valorTransaccion = valorTransaccion;
    }

    public Calendar getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Calendar fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public Date getHoraTransaccion() {
        return horaTransaccion;
    }

    public void setHoraTransaccion(Date horaTransaccion) {
        this.horaTransaccion = horaTransaccion;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public String getEstadoTransaccion() {
        return estadoTransaccion;
    }

    public void setEstadoTransaccion(String estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }
}
