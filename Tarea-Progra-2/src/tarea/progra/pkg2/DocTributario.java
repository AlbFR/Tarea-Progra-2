//Ready!
package tarea.progra.pkg2;
import java.util.Calendar;

abstract class DocTributario {
    private String numero;
    private String rut;
    private Calendar fecha;
   
    public DocTributario(String n, String r, Calendar f){
        numero = n;
        rut = r;
        fecha = f;
    }    
    public String getNumero() {
            return numero;
        }
        public String getRut() {
            return rut;
        }
        public Calendar getFecha() {
            return fecha;
        }
    }

class Boleta extends DocTributario{
    public Boleta(String a, String b, Calendar c){
        super(a,b,c);
    }
}

class Factura extends DocTributario{
    public Factura(String a, String b, Calendar c){
        super(a, b, c);
    }
}