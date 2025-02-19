package biblioteca;
public class Bibliotecario extends Persona{
    //Atributos
    private int numEmpleado;

    //constructores
    public Bibliotecario(){

    }
    public Bibliotecario(int idPersona, String nombre, String telefono, int numEmpleado){
        super(idPersona, nombre,telefono);
        this.numEmpleado = numEmpleado;
    }

     //Metodos personalizado
    public void registrarPrestamo(Usuario usuario, Ejemplar ejemplar){

    }

    public void registrarDevolucion(Prestamo prestamo){

    }
    public Libro buscarLibro(String libro){
        return null;
    }
    public void agregarLibro(Libro libro){

    }
    public void generarReporteLibro(){

    }

    //getter y setter
    public int getNumEmpleado(){
        return this.numEmpleado;
    }
    public void setGetEmpleado(int numEmpleado){
        this.numEmpleado = numEmpleado;
    }

}