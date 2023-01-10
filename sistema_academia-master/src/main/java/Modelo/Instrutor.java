
package Modelo;


public class Instrutor {
    
    //Atributos
    public String nomeinstrutor;
    public String horarios;
    public String area; 
    public String senhaacesso;
    
    
    //Construtor 

    public Instrutor(String nomeinstrutor, String horarios, String area, String senhaacesso) {
        this.nomeinstrutor = nomeinstrutor;
        this.horarios = horarios;
        this.area = area;
        this.senhaacesso = senhaacesso;
    }
    
    
    //Get/Set

    public String getNomeinstrutor() {
        return nomeinstrutor;
    }

    public void setNomeinstrutor(String nomeinstrutor) {
        this.nomeinstrutor = nomeinstrutor;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setSenhaacesso(String senhaacesso) {
        this.senhaacesso = senhaacesso;
    }
    
    
    
}
