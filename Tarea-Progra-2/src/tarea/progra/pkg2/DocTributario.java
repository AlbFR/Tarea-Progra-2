import java.util.Date;
package tarea.progra.pkg2;

abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
   
    public String getNumero() {
        return numero;
    }
    public String getRut() {
        return rut;
    }
    public Date getFecha() {
        return fecha;
    }
}

class Boleta extends DocTributario{
    public Boleta(){
        super();
    }
}

class Factura extends DocTributario{
    public Factura(){
        super();
    }
}