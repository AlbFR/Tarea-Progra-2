import java.util.ArrayList;
package tarea.progra.pkg2;

public class DetalleOrden{
    private int cantidad;
    private ArrayList<Articulo> articulos;
    public DetalleOrden () {
        articulos = new ArrayList<Articulo>();
    }
    public float calcPrecio () {}
    public float calcPrecioSinIVA () {}
    public float calcIVA () {}
    public float calcPeso() {}
}
