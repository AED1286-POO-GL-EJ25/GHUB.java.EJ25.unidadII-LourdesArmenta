package miPrincipal;
import java.util.Scanner;
public class Punto{
    //Atributos
    private int x;
    private int y;

    //Constructores
    public Punto(){

    }

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Metodos personalizados
    public double calcularDistancia(Punto p){
        int x1 = this.getX();
        int x2 = p.getX();

        int y1 = this.getY();
        int y2 = p.getY();

        //Encontrar el error
        double distancia = Math.sqrt(Math.pow((x2-x1),2) - Math.pow((y2-y1),2));
        return  distancia;

    }
    public void leer(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Proporciona el valor de x:");
        this.x = entrada.nextInt();
        System.out.print("Proporciona el valor de y:");
        this.y = entrada.nextInt();    
        
    }
    public void despliega(){
        System.out.println("Valor de x:"+this.x);
        System.out.println("Valor de y:"+this.y);
           
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