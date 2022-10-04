//Ready!
package tarea.progra.pkg2;
public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    public Articulo (float clp, String name, String data, float cash) {
        peso = clp;
        nombre = name;
        descripcion = data;
        precio = cash;
    }

    public float getPeso() {
        return peso;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public float getPrecio() {
        return precio;
    }
    
}
