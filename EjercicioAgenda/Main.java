import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;


public class Main{
    public static void main(String[]args){
        LocalDate dia=LocalDate.now();
        TablaHash tabla=new TablaHash();
        Scanner input= new Scanner(System.in);
        input.close();
        Tarea nueva=new Tarea("Estudiar", "A ponerse al dia",5,dia);
        tabla.agregarElemento(nueva);
        tabla.mostrar();
        nueva.mostrar();
        tabla.buscar(1001).mostrar();
        
    }

}