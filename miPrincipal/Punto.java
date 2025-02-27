package miPrincipal;
import java.util.Scanner;
public class Punto{
    //Atributos
    private int x;
    private int y;

    //Constructores
    public Punto(){
        this.x =0;
        this.y =0;

    }

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Metodos personalizados
    public double calcularDistancia(Punto p){
        double distancia;
        distancia = Math.sqrt(Math.pow((p.getX()-this.x),2) + 
                    Math.pow((p.getY()-this.y),2));
        return distancia;
        
    }
    public void leer(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Proporciona el valor de x:");
        this.x = entrada.nextInt();
        System.out.print("Proporciona el valor de y:");
        this.y = entrada.nextInt();    
        
    }
    public void despliega(){
        System.out.println("Valor de x:"+getX());
        System.out.println("Valor de y:"+getY());
           
    }

    //getter y setter
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x= x;
    }

    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }

}