/*
Desenvolvedor: Gabriel Pinheiro Ferrari
Modificação: 02/07/2025
*/

package Objetos;

public class Professor extends Pessoa{
        private String senha;
        private String formacao;
        private String user;
        
        //construtor
        public Professor(){
            senha = "";
            formacao = "";
        }
        
        //sobrecarga
        public Professor(String senha, String formacao){
            this.senha = senha;
            this.formacao = formacao;
        }

/******************************************************************************/
//Getters
    public String getSenha() {
        return senha;
    }

    public String getFormacao() {
        return formacao;
    }
    
    public String getUser(){
        return user;
    }

/******************************************************************************/
//setters
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public void setUser(String user){
        this.user = user;
    }
        
        
        
}
