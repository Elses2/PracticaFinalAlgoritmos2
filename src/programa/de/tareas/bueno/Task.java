/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.de.tareas.bueno;

/**
 *
 * @author elses
 */
public class Task {
  private String name;
  private String task;

  public Task(){
    this.name="";
    this.task="";

  }

  public void imprimir(){
    System.out.println("Tarea: "+this.name);
    System.out.println(this.task);

  }
  
  public void setName(String name){
  
      this.name= name; 
  }
  public void setTask(String task){
  
      this.task= task; 
  }
  public String getName(){
  
      return this.name ;
  }
  public String getTask(){
  
      return this.task;
  }
}
