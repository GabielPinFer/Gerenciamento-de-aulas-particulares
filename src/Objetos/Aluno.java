/*
Desenvolvedor: Gabriel Pinheiro Ferrari
Modificação: 30/06/2025
*/

package Objetos;

public class Aluno extends Pessoa{
    private String escola;
    private String responsavel;
    private int aulasdadas;
    private int cod;
    private String desenvolvimento;
    
    //construtor
    public Aluno(){
        escola = "";
        responsavel = "";
        desenvolvimento = "";
        aulasdadas = 0;
        cod = 0;
    }
    
    //Sobrecarga
    public Aluno(String escola, String responsavel, String desenvolvimento, int aulasdadas, int cod){
        this.escola = escola;
        this.responsavel = responsavel;
        this.desenvolvimento = desenvolvimento;
        this.aulasdadas = aulasdadas;
        this.cod = cod;
    }

/******************************************************************************/
//Getters
    public String getEscola() {
        return escola;
    }

    public String getResponsavel() {
        return responsavel;
    }
    
    public int getAulasdadas() {
        return aulasdadas;
    }
    
    public String getDesenvolvimento() {
        return desenvolvimento;
    }
    
    public int getCod(){
        return cod;
    }
    
/******************************************************************************/
//Setters
    
    public void setEscola(String escola) {
        this.escola = escola;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void setAulasdadas(int aulasdadas) {
        this.aulasdadas = aulasdadas;
    }

    public void setDesenvolvimento(String desenvolvimento) {
        this.desenvolvimento = desenvolvimento;
    }
    
    public void setCod(int cod){
        this.cod = cod;
    }
    
}
