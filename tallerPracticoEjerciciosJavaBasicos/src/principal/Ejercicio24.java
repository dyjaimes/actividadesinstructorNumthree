
package principal;


public class Ejercicio24 {
        private String listaProductos; 
    private double totalCompra; 

    public Ejercicio24() {
        this.listaProductos = ""; 
        this.totalCompra = 0;
    }

    public void agregarProducto(String producto, double precio) {
        listaProductos +=  producto + " - $" + precio + "\n";
        totalCompra += precio;
    }

    public String obtenerResumenCompra() {
        return listaProductos.isEmpty() ? "No se agregaron productos al carrito." : listaProductos;
    }

    public double obtenerTotalCompra() {
        return totalCompra;
    }
}
