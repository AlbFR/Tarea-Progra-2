//Ready!
package tarea.progra.pkg2;
import java.util.Calendar;
import java.util.ArrayList;

class OrdenCompra {
    private Calendar fecha;
    private String estado;
    private Cliente cliente;
    private float pago;
    private ArrayList<DetalleOrden> shoppingCart;

    public OrdenCompra () {
        fecha = Calendar.getInstance();
        pago = 0f;
        shoppingCart = new ArrayList<DetalleOrden>();
    }
    public void newRequest(DetalleOrden request){
        shoppingCart.add(request);
        pago = request.calcPrecio();
    }
    public void Client(Cliente you){
        cliente = you;
    }
}
