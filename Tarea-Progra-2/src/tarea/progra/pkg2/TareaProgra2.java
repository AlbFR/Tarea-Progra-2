package tarea.progra.pkg2;
import java.util.ArrayList;

public class TareaProgra2 {
    public static void main(String[] args) {

        // Articulos
        Articulo a1 = new Articulo(3.00f, "jabon", "", 3.00f);
        Articulo a2 = new Articulo(4.00f, "pan", "", 1900.0f);
        Articulo a3 = new Articulo(3.00f, "yogurt", "", 1000.0f);
        Articulo a4 = new Articulo(1.00f, "queque", "", 2000.0f);
        Articulo a5 = new Articulo(0.5f, "Papas del Assuan", "", 1750.0f);

        // Carros
        ArrayList carro1 = new ArrayList<Articulo>();
        carro1.add(a1);
        carro1.add(a2);

        ArrayList carro2 = new ArrayList<Articulo>();
        carro1.add(a3);
        carro1.add(a2);
        carro1.add(a4);

        // Direcciones
        Direccion d1 = new Direccion("Libertad 671");
        Direccion d2 = new Direccion("Pedro de Valdivia 69");
        Direccion d3 = new Direccion("Maipú 369");

        // Clientes
        Cliente c1 = new Cliente("Alberto", "21092133-8", d1);
        Cliente c2 = new Cliente("Tomás", "20890122-K0", d2);

        // Pagos
        Pago p1 = new Transferencia(5000, "BCI", "20127821");
        Pago p2 = new Tarjeta(5000, "credito", "221982198");
        Pago p3 = new Efectivo(8000);
        Pago p4 = new Efectivo(8000);

        // Detlles de Orden
        DetalleOrden deto1 = new DetalleOrden(2, a1);
        DetalleOrden deto2 = new DetalleOrden(3, a5);
        DetalleOrden deto3 = new DetalleOrden(1, a2);
        DetalleOrden deto4 = new DetalleOrden(1, a4);

        // DocTributarios
        DocTributario b1 = new Boleta("292393298", "21892189-9", d3);
        DocTributario b2 = new Boleta("128921982", "82182112-3", d3);
        DocTributario b3 = new Factura("838712892", "21821882-2", d3);


        OrdenCompra oc1 = new OrdenCompra(c2, p1, deto1, b2);
        OrdenCompra oc2 = new OrdenCompra(c1, p2, deto2, b1);
        OrdenCompra oc3 = new OrdenCompra(c1, p3, deto4, b3);
        System.out.println(oc1.toString());
        System.out.println(oc2.toString());
        System.out.println(oc3.toString());
    }
}
