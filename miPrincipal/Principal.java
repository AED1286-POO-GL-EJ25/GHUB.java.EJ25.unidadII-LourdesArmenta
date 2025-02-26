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
         */

        Punto punto1 ; //defino la referencia al objeto
        punto1 = new Punto(); //creamos el objeto

        Punto punto2;
        punto2 = new Punto(5,2);

        punto1.setX(2);
        punto1.setY(5);

        System.out.println(punto1.calcularDistancia(punto2));

        punto1.leer();
        punto2.leer();

        punto1.despliega();
        punto2.despliega();








       









       
    }
}