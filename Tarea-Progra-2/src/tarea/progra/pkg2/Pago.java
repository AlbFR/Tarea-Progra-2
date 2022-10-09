// *Test change*
package tarea.progra.pkg2;
import java.util.Date;
import java.text.SimpleDateFormat;

abstract class Pago {
    private float monto;
    private Date fecha;
    
    public Pago (int cash){
        monto = cash;
        fecha = new Date();
    }
    public float getMonto () {
        return monto;
    }
    public Date getFecha () {
        return fecha;
    }
    public String toString () {
        String r = "Monto: ";
        r += monto;
        r += "Fecha: ";
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        r += f.format(fecha);
        return r;
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
    public Transferencia (int a, String bank, String cuenta) {
        super(a);
        banco = bank;
        numCuenta = cuenta;
    }
    public String getBanco() {return banco;}
    public String getCuenta() {return numCuenta;}
    public String toString () {
        String r = "Monto: ";
        r += getMonto();
        r += "Fecha: ";
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        r += f.format(getFecha());
        r += "Banco: ";
        r += getBanco();
        r += "Numero de Cuenta: ";
        r += getCuenta();
        return r;
    }
}

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta (int a, String type, String transaccion) {
        super(a);
        tipo = type;
        numTransaccion = transaccion;
    }
    public String getTipo () {return tipo;}
    public String getNumTransaccion () {return numTransaccion;}
    public String toString() {
        String r = "Monto: ";
        r += getMonto();
        r += "Fecha: ";
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        r += f.format(getFecha());
        r += "Tipo: ";
        r += tipo;
        r += "Numero de Transaccion: ";
        r += numTransaccion;
        return r;
    }
}
