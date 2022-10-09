//Ready!
package tarea.progra.pkg2;
import java.util.Date;
import java.text.SimpleDateFormat;

abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;
   
    public DocTributario(String n, String r, Direccion d){
        numero = n;
        rut = r;
        fecha = new Date();
        direccion = d;
    }    
    public String getNumero() {
        return numero;
    }
    public String getRut() {
       return rut;
    }
    public Date getFecha() {
       return fecha;
    }
    public String toString() {
        String r = "Numero: ";
        r += numero;
        r += "Rut: ";
        r += rut;
        r += "Fecha: ";
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        r += f.format(fecha);
        r += "Direccion: ";
        r += direccion.getDireccion();
        r += "\n";
        return r;
    }
}

class Boleta extends DocTributario{
    public Boleta(String a, String b, Direccion d){
        super(a, b, d);
    }
}

class Factura extends DocTributario{
    public Factura(String a, String b, Direccion d){
        super(a, b, d);
    }
}
