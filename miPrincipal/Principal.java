package miPrincipal;
import paquete1.*;

public class Principal {
   

    public static void main(String[] args) {
        //creando un objeto de tipo Menu
        Menu menu = new Menu();
        menu.iniciar();


    }
    /*
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

        Animal animal = new Animal();

        animal.saludar();
        animal.saludar("Me da mucho gusto conocerte");

        Animal animal2 = new Animal("Juana",15);
        animal2.saludar();
        animal2.saludar("Excelente dia: ");

        animal2.setNombre("Juan");
        animal2.saludar();
        animal2.saludar("Excelente dia: ");


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

        Forma forma = new Forma();

        System.out.println("Circulo = "+forma.calcularArea(2.5));
        System.out.println("Triangulo = "+forma.calcularArea(3,2));
        System.out.println("Cuadrado = "+forma.calcularArea(2.5f));

        //Crear un objeto
        /*
         * Sintaxis para definir una referencia
         *  NombreClase varReferencia
         * 
         * //formato para crear un objeto
         *   varReferencia = new NombreClase(argumento del constructor)
         **/
        /*

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

        //Uso de la Relacion de Composicion

        Motor motor1 = new Motor("V10",500);

        Automovil auto1= new Automovil("Lexus","LFA",motor1);

        System.out.println("Automovil 1 Marca: "+auto1.getMarca()+" Modelo: "+auto1.getModelo()+
                            " Motor tipo:"+auto1.getMotor().getTipo()+" Potencia: "+
                            auto1.getMotor().getPotencia()+" HP");

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

    */

    
}