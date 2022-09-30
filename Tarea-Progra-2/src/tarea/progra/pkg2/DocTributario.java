import java.util.Date;
package tarea.progra.pkg2;

abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
}


class Boleta extends DocTributario{
}

class Factura extends DocTributario{
}