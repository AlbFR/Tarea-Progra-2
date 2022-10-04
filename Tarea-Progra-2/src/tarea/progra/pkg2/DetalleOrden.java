//Ready!
package tarea.progra.pkg2;
import java.util.ArrayList;

public class DetalleOrden{
    private int cantidad;
    private Articulo articulos;
    public DetalleOrden (int quantity, Articulo item) {
        cantidad = quantity;
        articulos = item;
    }
    public float calcPrecio () {
        return cantidad * articulos.getPrecio();
    }
    public float calcPrecioSinIVA () {
        return cantidad * (articulos.getPrecio() * 0.81f);
    }
    public float calcIVA () {
        return cantidad * articulos.getPrecio() * 0.19f;
    }
    public float calcPeso() {
        return cantidad * articulos.getPeso();
    }
}
