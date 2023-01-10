
package Modelo;


public class Planos {
    
    
    //Atributos
    public String tipo;
    public double valor;
    
    //Construtor

    public Planos(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    //Get/Set

    public String getTipo() {
        return tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
