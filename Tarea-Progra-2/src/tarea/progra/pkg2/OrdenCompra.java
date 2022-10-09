//Ready!
package tarea.progra.pkg2;
import java.util.Date;
import java.util.ArrayList;

class OrdenCompra {
    private Date fecha;
    private String estado;
    private Cliente cliente;
    private DocTributario doc;
    private ArrayList pagos;
    private ArrayList<DetalleOrden> shoppingCart;

    public OrdenCompra (Cliente cl, Pago p, DetalleOrden deto, DocTributario dt) {
        cliente = cl;
        fecha = new Date();
        doc = dt;
        shoppingCart = new ArrayList<DetalleOrden>();
        shoppingCart.add(deto);
        pagos = new ArrayList<Pago>();
        pagos.add(p);
    }
    public void newRequest (DetalleOrden request){
        shoppingCart.add(request);
    }
    public void agregarPago (Pago p) {
        pagos.add(p);
    }
    public String toString () {
        String r = "DocTributario: ";
        r += doc.toString();
        r += "Estado: ";
        r += estado;
        r += "Cliente: ";
        r += cliente.toString();
        for (int i=0;i<pagos.size();++i) {
            r += pagos.get(i).toString();
        }
        for (int i=0;i<shoppingCart.size();++i) {
            r += shoppingCart.get(i).toString();
        }
        return r;
    }
}
