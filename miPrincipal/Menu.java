package miPrincipal;

public class Menu {
    //constructor vacio
    public Menu(){

    }
    //metodo personaliza y public que no retorna nada que se llame iniciar
    public void iniciar(){
        mostrarMenu();

    }
    //metodo personalizado privado que no retorne nada que se llame mostrarMenu
    private void mostrarMenu(){
        System.out.println("\n--- Menú de Clase ---");
        System.out.println("1. Persona ");
        System.out.println("2. Animal ");
        System.out.println("3. Calculadora");
        System.out.println("4. Forma");
        System.out.println("5. Punto");
        System.out.println("6. Automovil");
        System.out.println("7. Computadora");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");

    }
    
}
