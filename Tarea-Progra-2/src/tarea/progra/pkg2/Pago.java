import java.util.Date;

package tarea.progra.pkg2;

abstract class Pago {
    private float monto;
    private Date fecha;
}

class Efectivo extends Pago{
    public calcDevolucion(){}
}

class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
}

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
}