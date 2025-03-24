/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_class;


public class Cliente_Modelo {
        private String Nombre;
     private  String Apellido;
      private  String Sexo;
      
      public Cliente_Modelo(String nombre, String apellido, String sexo){
           this.Nombre=nombre;
           this.Apellido=apellido;
           this.Sexo=sexo;
      }
      public  void setNombre_Cliente(String datonombre){
          this.Nombre=datonombre;
      }
      public String getnombre(){
          
          return this.Nombre;
      }
      public  void imprimirdatos_Cliente(){
          System.out.println("nombre cliente: "+Nombre);
          System.out.println("apellido cliente: "+Apellido);
          System.out.println("sexo cliente: "+Sexo);
      }
}
  