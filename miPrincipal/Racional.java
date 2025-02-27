package miPrincipal;
public class Racional{
    private int r[];

    //Constructores
    public Racional(){
        r = new int [2];
        r[0] = 0;
        r[1] = 0;
    }

    public Racional(int a, int b){
        r = new int [2];
        r[0] = a;
        r[1] = b;
    }

    //Métodos personalizados
    public Racional sumar(Racional b){
        Racional x = new Racional();
        x.setNumerador(this.getDenominador() * b.getNumerador() + b.getDenominador()* this.getNumerador());
        x.setDenominador(this.getDenominador() * b.getDenominador());
        return x;
    }

    public Racional multiplicar(Racional b){
        Racional x = new Racional();
        x.setNumerador(this.getNumerador() * b.getNumerador());
        x.setDenominador(this.getDenominador() * b.getDenominador());
        return x;
    }

    public boolean igual(Racional b){

        return this.getDenominador()*b.getNumerador() == b.getDenominador()*this.getNumerador();
    }

    
    public String desplegar() {
        return r[0] + "/" +r[1];

    }

    //Getter y setter

    public int getNumerador(){
        return this.r[0];
    }
    public void setNumerador(int a)
    {
        this.r[0]=a;
    }

    public int getDenominador(){
        return this.r[1];
    }
    public void setDenominador(int a)
    {
        this.r[1]=a;
    }







}