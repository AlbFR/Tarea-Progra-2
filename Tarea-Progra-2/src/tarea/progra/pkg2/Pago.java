package tarea.progra.pkg2;
import java.util.Calendar;

abstract class Pago {
    private float monto;
    private Calendar fecha;
    
    public Pago(int cash){
        monto = cash;
    }
    public float getMonto() {
        return monto;
    }
}

class Efectivo extends Pago{
    private OrdenCompra ordenCompra;
    public Efectivo(int a){
        super(a);
    }
    public int calcDevolucion(OrdenCompra cost){
        return cost.calcPrecio() - super.getMonto();
    }
}

class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
}

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
}