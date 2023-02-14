package mx.com.gm.ventas;

public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int conadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.conadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];

    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;

        } else {
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }

    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            //Producto producto = this.productos[i];
            // total += producto.getPrecio(); // total = total + producto.getPrecio();
            total += this.productos[i].getPrecio();

        }
        return total;

    }

    public void mostrarOrden() {
        System.out.println("Id orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $" + totalOrden);
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);

        }

    }

}
