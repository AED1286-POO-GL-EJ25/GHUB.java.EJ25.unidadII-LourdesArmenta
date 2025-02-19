package miPrincipal;

public class Principal {
   

    public static void main(String[] args) {

        //Crear objetos tipo Persona
        Persona p1 = new Persona(); //invoca al constructor vacio

        p1.setNombre("Luis");
        p1.setEdad(14);
        p1.setDni("123");

        Persona p2 = new Persona("Lilian",15,"Cocina");
        p2.setNombre("Liliana");
        p2.setEdad(16);
        p2.setDni("1111");
        
        System.out.println("Nombre de p2 = "+p2.getNombre());
        System.out.println("Edad de p2 = "+p2.getEdad());
        System.out.println("Dni de p2 = "+p2.getDni());


        //invocar a los métodos

        p1.saludar();

        p2.saludar();

       
    }
}