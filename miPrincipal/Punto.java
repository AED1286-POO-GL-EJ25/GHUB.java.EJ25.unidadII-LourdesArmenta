package miPrincipal;
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

        double distancia = Math.sqrt(Math.pow((x2-x1),2) -Math.pow((y2-y1),2));
        return  distancia;

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