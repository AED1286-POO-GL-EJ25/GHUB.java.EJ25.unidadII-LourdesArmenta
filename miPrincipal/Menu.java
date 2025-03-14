package miPrincipal;

import java.util.Scanner;

import paquete1.Automovil;
import paquete1.Computadora;
import paquete1.Motor;
import paquete1.Monitor;

public class Menu {
    //constructor vacio
    public Menu(){

    }
    //metodo personaliza y public que no retorna nada que se llame iniciar
    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
           mostrarMenu();
           opcion = scanner.nextInt(); 
           scanner.nextLine(); // Consumir la nueva línea
           switch (opcion) {
            case 1:
                //seleccione la opcion persona
                break;
            case 2:
                //seleccione la opcion Animal
                Animal animal = new Animal();

                animal.saludar();
                animal.saludar("Me da mucho gusto conocerte");
        
                Animal animal2 = new Animal("Juana",15);
                animal2.saludar();
                animal2.saludar("Excelente dia: ");
        
                animal2.setNombre("Juan");
                animal2.saludar();
                animal2.saludar("Excelente dia: ");
                break;
            case 3:
                //seleccione la opcion calculadora
                Calculadora calculadora = new Calculadora();
                System.out.println("La suma = "+calculadora.sumar(5, 10));
                int x,y;
                x = 5;
                y = 10;
                System.out.println("La suma = "+calculadora.sumar(x, y));

                int resultado = calculadora.sumar(x, y);
                System.out.println("La suma = "+resultado);

                System.out.println("La suma = "+calculadora.sumar(5.5, 10.3));

                System.out.println("La suma = "+calculadora.sumar(5.0, 10.0));

                System.out.println("La suma = "+calculadora.sumar(5, 10.0));

                System.out.println("La suma = "+calculadora.sumar(5.0, 10));

                System.out.println("La suma = "+calculadora.sumar(5, 10,3));

                System.out.println("La suma = "+calculadora.sumar(5.0f, 10.0f,3.0f));

                break;
            case 4:
            
                Forma forma = new Forma();

                System.out.println("Circulo = "+forma.calcularArea(2.5));
                System.out.println("Triangulo = "+forma.calcularArea(3,2));
                System.out.println("Cuadrado = "+forma.calcularArea(2.5f));
                break;
            case 5:
                //Crear un objeto
                //
                //Sintaxis para definir una referencia
                // NombreClase varReferencia
                // 
                // formato para crear un objeto
                //  varReferencia = new NombreClase(argumento del constructor)
            
                //

                Punto punto1 ; //defino la referencia al objeto
                punto1 = new Punto(); //creamos el objeto

                System.out.println("Valor de x del punto1="+punto1.getX());
                System.out.println("Valor de y del punto1="+punto1.getY());

                punto1.setX(10);
                punto1.setY(5);

                System.out.println("Valor de x del punto1="+punto1.getX());
                System.out.println("Valor de y del punto1="+punto1.getY());


                Punto punto2;
                punto2 = new Punto(5,2); //invocando al constructor lleno

                System.out.print("valor de x de punto2 ="+punto2.getX());
                System.out.println("   Valor de y de punto2 ="+punto2.getY());

                punto1.despliega();
                punto2.despliega();

                punto1.leer();
                punto2.leer();

                punto1.despliega();
                punto2.despliega();

                System.out.println(punto1.calcularDistancia(punto2));
            
                break;
            case 6:
                
                //Uso de la Relacion de Composicion

                Motor motor1 = new Motor("V10",500);

                Automovil auto1= new Automovil("Lexus","LFA",motor1);

                System.out.println("Automovil 1 Marca: "+auto1.getMarca()+" Modelo: "+auto1.getModelo()+
                                    " Motor tipo:"+auto1.getMotor().getTipo()+" Potencia: "+
                                    auto1.getMotor().getPotencia()+" HP");
                break;
            case 7:
                //Uso de la relacion de agregacion
                //forma1
                Monitor monitor1 = new Monitor("IBM",16);

                Computadora compu1 = new Computadora("Lanix","LX1",monitor1);

                System.out.println("Computadora marca: "+compu1.getMarca()+" Modelo: "+compu1.getModelo()+"\n"+
                                "Monitor marca: "+compu1.getMonitor().getMarca()+
                                " Tamaño: "+compu1.getMonitor().getTamanio()+" pulgadas");
                //forma2 
                Computadora compu2 = new Computadora("HP","mx500",new Monitor("HP",15));

                System.out.println("Computadora marca: "+compu2.getMarca()+" Modelo: "+compu2.getMarca()+"\n"+
                                "Monitor marca "+compu2.getMonitor().getMarca()+
                                " Tamaño: "+compu2.getMonitor().getTamanio()+" pulgadas");
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
           
            default:
                System.out.println("Opcion invalida, intente de nuevo...");
           }

        }while (opcion !=0);


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
