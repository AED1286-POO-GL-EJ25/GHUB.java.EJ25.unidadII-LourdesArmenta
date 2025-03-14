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
        System.out.println("Hola, soy una Persona de nombre "+ this.nombre +" un gusto");
    }

    //Propiedades
    //Leer el atributo nombre
    public String getNombre(){
        return this.nombre;
    }
    //Asignar un valor al atributo nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Leer el atributo edad
    public int getEdad(){
        return this.edad;
    }
    //Asignar un valor al atributo edad
    public void setEdad(int edad){
        this.edad = edad;
    }

    //Leer el atributo dni
    public String getDni(){
        return this.dni;
    }
    //Asignar el atributo dni
    public void setDni(String dni){
        this.dni = dni;
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+" Edad:"+this.edad+" DNI:"+this.dni;

    }

}