package co.edu.uniquindio.tallerunibanco_1.modelo;

import java.util.Calendar;
import java.util.Date;

public class solicitarSaldo extends Transaccion{

    //constructor


    public solicitarSaldo(Cuenta cuenta, float valorTransaccion, Calendar fechaTransaccion, Date horaTransaccion,
                          String tipoTransaccion, String estadoTransaccion) {
        super(cuenta, valorTransaccion, fechaTransaccion, horaTransaccion, tipoTransaccion, estadoTransaccion);
    }
}
