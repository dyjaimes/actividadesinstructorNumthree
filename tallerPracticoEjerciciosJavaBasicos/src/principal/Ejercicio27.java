
package principal;


public class Ejercicio27 {
    private String resumenVentas; 
    private double totalVentas;   

    public Ejercicio27() {
        this.resumenVentas = "";
        this.totalVentas = 0;    
    }

    public void registrarProducto(String nombre, double precio, int cantidad) {
        double subtotal = precio * cantidad;
        totalVentas += subtotal;
        resumenVentas +=  nombre + " - Cantidad: " + cantidad + " - Subtotal: $" + subtotal + "\n";
    }

    public String obtenerResumenVentas() {
        return resumenVentas.isEmpty() ? "No se han registrado ventas." : resumenVentas;
    }

    public double obtenerTotalVentas() {
        return totalVentas;
}}

