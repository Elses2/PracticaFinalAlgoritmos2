/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.de.tareas.bueno;

/**
 *
 * @author elses
 */
import java.util.*;
public class ProgramaDeTareasBueno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
    int indice=0;
    int or; /// es si elige si o no a la hs de sobrescribir 
    int tamano=10;
    int opcion;
    Task array[]={new Task(),new Task(),new Task(),new Task(),new Task(),new 
    Task(),new Task(),new Task(),new Task(),new Task()};
    int bucle=2;

    while(bucle==2){
      presentacion();
      opcion=entrada.nextInt();
      entrada.skip("\n");
      switch(opcion){
        case 1:
          if(indice<tamano){
            System.out.println("Ingrese el titulo de la tarea");
            array[indice].setName(entrada.nextLine());
            System.out.println("Ingrese la tarea que desea recordar");
            array[indice].setTask(entrada.nextLine());
            indice=indice+1;


            
          }
        else{
          System.out.println("Llego al limite maximo de tareas ¿Desea sobrescribir las tareas?");
          System.out.println("Ingrese 1 para si");
          System.out.println("Ingrese 2 para no");
          or=entrada.nextInt();
          entrada.skip("\n");
          if(or==1){
            for(int i=0; i<tamano; i++){
              array[i].setName("");
              array[i].setTask("");
              
            }
            
          }

        }
          break;
        case 2:
            for(int j=0; j<array.length;j++){
                
                if(array[j].getName()!=""){
                System.out.println("Posicion: "+ (j+1));
                System.out.println("Titulo:"+ array[j].getName() );
                System.out.println("Tarea: "+array[j].getTask());
                }
            }
            String a= entrada.nextLine();
          break;
        case 3:
          System.out.println("Gracias por elegir Task");
          bucle=5;
          break;
        default:
          
      }
      



      
    }
        
        
        // TODO code application logic here
    }
      public static void presentacion(){
    System.out.println("###################################");
    System.out.println("Bienvenidos al organizador Task");
    System.out.println("###################################");
    System.out.println("INGRESE:");
    System.out.println("1 para ingresar una tarea ");
    System.out.println("2 para ver la lista de tarea");
    System.out.println("3 para cerrar el programa");
  }
    
}
