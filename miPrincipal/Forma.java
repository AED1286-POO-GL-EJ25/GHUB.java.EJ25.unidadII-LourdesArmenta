package miPrincipal;
public class Forma{
    //Calcula el area de un circulo
    public double calcularArea(double radio){
        double area;
        area = Math.PI * Math.pow(radio, 2);
        return area;
        

    }
    //Triangulo
    public double calcularArea(double base, double altura){
        double area = base*altura/2;
        return area;

    }
    //Cuadrado
    public double calcularArea(float lado){
        double area = lado*lado;
        return area;
    }




}