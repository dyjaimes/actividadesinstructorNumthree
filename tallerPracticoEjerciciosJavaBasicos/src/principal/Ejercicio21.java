
package principal;

public class Ejercicio21 {
    
    private String listaTareas; 

    public Ejercicio21() {
        this.listaTareas = ""; 
    }

    public void agregarTarea(String descripcion, String fechaVencimiento) {
        listaTareas += descripcion + " (Vence el: " + fechaVencimiento + ")\n";
    }

    public String mostrarTareas() {
        return listaTareas.isEmpty() ? "No hay tareas registradas." : listaTareas;
    }
    
    
}
