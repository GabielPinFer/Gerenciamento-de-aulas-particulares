/*
Desenvolvedor: Gabriel Pinheiro Ferrari
Modificação: 30/06/2025
*/
package Objetos;


public abstract class Pessoa {
    private String cpf;
    private int idade;
    private String nome;
    private String celular;
    
    //construtor
    public Pessoa(){
        cpf = "";
        nome = "";
        celular = "";
        idade = 0;
    }
    
    //Sobrecarga
    public Pessoa(String cpf, String nome, String celular, int idade){
        this.cpf = cpf;
        this.nome = nome;
        this.celular = celular;
        this.idade = idade;
    }

/******************************************************************************/
//Getters
    
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCelular() {
        return celular;
    }
    
    public int getIdade(){
        return idade;
    }

/******************************************************************************/
//Setters
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    
}
