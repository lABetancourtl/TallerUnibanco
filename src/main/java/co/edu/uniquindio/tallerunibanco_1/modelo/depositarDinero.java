package co.edu.uniquindio.tallerunibanco_1.modelo;

import java.util.Calendar;
import java.util.Date;

public class depositarDinero extends Transaccion{

    //constructor


    public depositarDinero(Cuenta cuenta, float valorTransaccion, Calendar fechaTransaccion, Date horaTransaccion,
                           String tipoTransaccion, String estadoTransaccion) {
        super(cuenta, valorTransaccion, fechaTransaccion, horaTransaccion, tipoTransaccion, estadoTransaccion);
    }
}
