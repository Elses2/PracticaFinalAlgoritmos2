
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Tarea{
    private String nombre; 
    private String descripcion;
    private int dificultad;
    private int estado; 
    private LocalDate limite;
    private int clave; 
    public static int contador=1000;///le asigno 1000 para que la clave tenga como minimo 3 digitos 
    public Tarea(String nombre, String descripcion, int dificultad,LocalDate limite) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
        this.estado = 1;
        this.limite= limite;
        contador++;
        this.clave= contador;
    }
    ///getters
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public int getDificultad(){
        return this.dificultad;
    }
    public int getEstado(){
        return this.estado;
    }
    public LocalDate getLimite(){
        return this.limite;
    }
    public int getClave(){
        return this.clave;
    }
    ///setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void setDificultad(int dificultad){
        this.dificultad=dificultad;
    }
    public void setEstado(int estado){
        this.estado=estado;
    }
     public void setLimite(LocalDate limite){
        this.limite=limite;
    }
    ///Funcion mostrar 
    
    public void mostrar(){

        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaMostrar=formateador.format(this.limite);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Titulo:"+this.nombre);
        System.out.println("Clave:"+this.clave);
        System.out.println("Descripcion"+this.descripcion);
        System.out.println("Dificultad"+this.dificultad);
        System.out.println("Estado"+this.estado);
        System.out.println("Fecha limite: "+fechaMostrar);
        System.out.println("---------------------------------------------------------------------------------------");

    }
    

}