package miPrincipal;
public class Persona{
    //Atributos
    private String nombre;
    private int edad;
    private String dni;
    
    //Métodos
    //Constructores
    
    //Vacio
    public Persona(){
        
    }
    //Lleno
    public Persona(String nombre, int edad, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    //Personalizados
    public void saludar(){
        System.out.println("Hola, soy una Persona");
    }

}