/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.ArrayList;
import java.util.List;
import modelo_class.*;
import java.util.Scanner;
/**
 *
 * @author dauri
 */
public class Principal {
         public static List<Cliente_Modelo> listaCliente=new ArrayList();
    
    public static void main(String[] args) {
        
        
        
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Crear clientes");
            System.out.println("2. Ver clientes");
            System.out.println("3. Modificar nombre de un cliente");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    crearArray_dinamico();
                    break;
                case 2:
                    verDatos_arrayDinamico();
                    break;
                case 3:
                    modificarNombre();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
        
        scanner.close();/*
            Principal.crearArray_dinamico();
            Principal.verDatos_arrayDinamico();
            Principal.modificarNombre();*/
            
    }
public static void crearArray_dinamico(){

               listaCliente.add(new Cliente_Modelo("Juan", "Jaimes", "M"));
        listaCliente.add(new Cliente_Modelo("Pedro", "Rodriguez", "F"));
        listaCliente.add(new Cliente_Modelo("Maria", "Marquez", "F"));
        listaCliente.add(new Cliente_Modelo("Luisa", "Rincon", "M"));
}

public static void verDatos_arrayDinamico(){
for(int i=0; i<Principal.listaCliente.size();i++){
    Cliente_Modelo aux=Principal.listaCliente.get(i);
    System.out.println(" ");
    if(aux !=null){
        aux.imprimirdatos_Cliente();
    }
}
}
public static void modificarNombre() {
    for (int i = 0; i < listaCliente.size(); i++) {
        Cliente_Modelo cliente = listaCliente.get(i);
        if (cliente != null) {
            cliente.setNombre_Cliente("Juan" + (i + 1)); // Asigna un nombre único a cada cliente
        }
    }
    System.out.println("\n Nombres de clientes modificados correctamente.");
    
    // Verificar la modificación mostrando los datos actualizados
    verDatos_arrayDinamico();
}
}
