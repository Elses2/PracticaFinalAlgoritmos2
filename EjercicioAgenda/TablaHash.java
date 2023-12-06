import java.util.ArrayList;
public class TablaHash {
    ///Este tamaño se calcula teniendo en cuenta que se ingresaran como maximo 8 elementos, usando el factor de carga n/m
    private int tam=10;
    ArrayList<ArrayList<Tarea>> tabla = new ArrayList<>(tam);
    public TablaHash() {
        // Inicializar las listas dentro del ArrayList
        for (int i = 0; i < tam; i++) {
            tabla.add(new ArrayList<>(1));
        }
    }
    ///variable complemento de agregar elemento, donde se pasa por parametro la clave y se devuelve el indice donde se almacenara 
    private int modulo (int x){
        int indice=x%tam; 
        return indice;
    }
    ///Otra funcion de dispersion: mitad al cuadrado toma la clave la eleva al cuadrado y devuelve  ciertos digitos de ese resultado como indice 
    ///la hago publica porque no se usa solo es de practica 
    public int mitadCuadrado(int clave){
        int resultado=clave^2;
        resultado=resultado%10;
        return resultado;
    }
    ///Otra funcion de dispersion multiplicacion multiplica por un decimal a ese resultado toma la parte decimal y lo multiplica por m 
    public int multiplicacion(int clave){
        float decimal=0.6180334;
        float resultado=clave*decimal;
        int parteEntera=0;
        parteEntera=(int)(Math.round(resultado));
        resultado-=parteEntera;
        resultado*=this.tam;///tam es m 
        
        return resultado;
    }
    ///Se pasa por parametro un elemento tarea y se almacena en la tabla
    public void agregarElemento(Tarea x){
        int indice= modulo(x.getClave());
        ArrayList<Tarea> lugar=tabla.get(indice);
        lugar.add(x);
        

    }
    ///busca y devuelve el elemento atraves de su clave 
    public Tarea buscar(int clave){
        int indice=modulo(clave);
        Tarea objeto;
        for(int i=0;i<tabla.get(indice).size();i++){
            objeto=tabla.get(indice).get(i);
            if(objeto.getClave()==clave){
                return objeto;
            }
        }
        System.out.println("Lo sentimos pero no se encontro tu busqueda");
                return null;
        
    }
    ///Eliminar: busca y elimina un elemento de la lista a traves de su clave 
    public void eliminar(int clave){        
        int indice=modulo(clave);
        Tarea objeto;
        boolean seEncontro=false;
        for(int i=0;i<tabla.get(indice).size();i++){
            objeto=tabla.get(indice).get(i);
            if(objeto.getClave()==clave){
                tabla.get(indice).remove(objeto);
                seEncontro=true;
            }
        }
        if(seEncontro){
            System.out.println("Se ha eliminado el elemento correctamente ");
        }else{
            System.out.println("El elemento no se encontro en los registros ");
        }
    }
    ///Mustra todo lo que esta en la tabla hash, solo sus posiciones en la tabla y su titulo
    public void mostrar(){
        int contadorJ=0;
        for(int i=0; i<tam;i++){
            for(int j=0;j< tabla.get(i).size();j++){
                System.out.println((contadorJ+1)+": "+tabla.get(i).get(j).getNombre());
                contadorJ++;
            }
        }
    }
}
