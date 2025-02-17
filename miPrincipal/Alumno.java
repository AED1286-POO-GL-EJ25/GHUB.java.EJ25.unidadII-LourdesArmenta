package miPrincipal;
public class Alumno extends Persona{
    //Atributos
    private String curso;
    private int notas[];
    
    //Métodos
    //Constructores
    //Vacios
    public Alumno(){
        
    }
    //lleno
    public Alumno(String nombre, int edad, String dni, String curso){
        super(nombre, edad, dni); //invoca al constructor de la clase base (Persona)
        this.curso = curso;
        this.notas = new int[5]; //inicializando un arreglo de nombre notas con 5 elementos y como int es cero

    }
    //Personalizados
    public void estudiar(){
        System.out.println("Soy una alumno y estoy estudiando");
    }




}