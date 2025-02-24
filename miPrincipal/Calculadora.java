package miPrincipal;
public class Calculadora{

    public int sumar(int a, int b){
        return a+b;
    }

    public double sumar(double a,double b){
        System.out.println("Este es el metodo segundo");
        return a+b;
    }

    public double sumar(int a, double b){
        System.out.println("Este es el metodo tercero");
        return a+b;
    }

    public float sumar(float a, float b, float c){
        return a+b+c;
    }

}