package miPrincipal;
public class Animal{
    //Atribuitos
    private String nombre;
    private int edad;
    //constructores

    public Animal(){

    }
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }
    //Metodos personalizado
    public void saludar(){
        System.out.println("Hola soy un animal y me llamo: "+nombre);
    }

    public void saludar(String texto){
        System.out.println(texto +" soy un animal y me llamo: "+nombre);
    }

    //getter y setter
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }


}