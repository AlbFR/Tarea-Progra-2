//Ready!
package tarea.progra.pkg2;
import java.util.ArrayList;

public class DetalleOrden{
    private int cantidad;
    private Articulo articulo;
    public DetalleOrden (int quantity, Articulo item) {
        cantidad = quantity;
        articulo = item;
    }
    public float calcPrecio () {
        return cantidad * articulo.getPrecio();
    }
    public float calcPrecioSinIVA () {
        return cantidad * (articulo.getPrecio() * 0.81f);
    }
    public float calcIVA () {
        return cantidad * articulo.getPrecio() * 0.19f;
    }
    public float calcPeso() {
        return cantidad * articulo.getPeso();
    }
    public String toString () {
        String r = "Cantidad: ";
        r += cantidad;
        r += "Artículo: ";
        r += articulo;
        r += "\n";
        return r;
    }
}
