package paquete1;

public class Computadora {
    //Atributos
    private String marca;
    private String modelo;
    private Monitor monitor;

    //constructor
    public Computadora(String marca, String modelo, Monitor monitor) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitor = monitor;
    }

    //getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Monitor getMonitor() {
        return monitor;
    }
    
    

}
