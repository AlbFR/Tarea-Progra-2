//Ready!
package tarea.progra.pkg2;
public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;
        
    public String getNombre() {
        return nombre;
    }
    public String getRut() {
        return rut;
    }
    public Direccion getDireccion() {
        return direccion;
    }
        
    public Cliente(String a, String b, Direccion c){
        nombre = a;
        rut = b;
        direccion = c;
    }
    public String toString () {
        String r = "Nombre: ";
        r += nombre;
        r += "Rut: ";
        r += rut;
        r += "direccion: ";
        r += direccion.getDireccion();
        r += "\n";
        return r;
    }
}