
package principal;


public class Ejercicio25 {
       private String listaContactos;

    public Ejercicio25() {
        this.listaContactos = ""; 
    }

    public void agregarContacto(String nombre, String telefono) {
        listaContactos += nombre + " - " + telefono + "\n";
    }

    public String obtenerContactos() {
        return listaContactos.isEmpty() ? "No se han registrado contactos." : listaContactos;
    }
}
