//Ready!
package tarea.progra.pkg2;
public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    public Articulo (float weight, String name, String data, float price) {
        peso = weight;
        nombre = name;
        descripcion = data;
        precio = price;
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
    public String toString () {
        String r = "name: ";
        r += getNombre();
        r += ", precio: ";
        r += getPrecio();
        r += ", peso: ";
        r += getPeso();
        r += ", desc: ";
        r += getDescripcion();
        r += "\n";
        return r;
    }
}
