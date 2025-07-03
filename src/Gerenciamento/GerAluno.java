/*
Desenvolvedor: Gabriel Pinheiro Ferrari
alteração: 30/06/2025
*/
package Gerenciamento;

import Objetos.Aluno;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class GerAluno {
    
    private static GerAluno alunoUnic;
    private final List<Aluno> bdaluno;
    
    //construtor
    private GerAluno(){
        bdaluno = new LinkedList<>();
    }
    
    //singleton
    public static GerAluno geraGerAluno(){
        if(alunoUnic == null){
            alunoUnic = new GerAluno();
        }
        return alunoUnic;
    }
    
    public List<Aluno> getBdAluno(){
        return bdaluno;
    }
    
    public void cadastrar(Aluno al){
        al.setCod(geraCodigo());
        al.setAulasdadas(0);
        bdaluno.add(al);   
    }
    
    public Aluno buscar(int cod){
        
        for(Aluno al : bdaluno){
            if(al.getCod() == cod){
                return al;
            }
        }
        return null;
    }
    
    public Aluno excluir(int cod){
        
        for(Aluno al : bdaluno){
            if(al.getCod() == cod){
                bdaluno.remove(cod);
                return null;
            }
        }
        
        return null;
    }
    
    public Aluno alterar(int cod, int dado){
        if(dado == 1) return alterarEscola(cod);
        if(dado == 2) return alterarAulas(cod);
        if(dado == 3) return alterarDesempenho(cod);
        return null;
    }
    
    private Aluno alterarEscola(int cod){
        Aluno al;
        for(int i = 0; i < bdaluno.size(); i++){
            
            if(cod == bdaluno.get(i).getCod()){
                al = bdaluno.get(i);
                String nvescola = infAlteracao("Informe nova Escola");
                al.setEscola(nvescola);
                bdaluno.set(i, al);
                return bdaluno.get(i);
            }
        }
        
        return null;
    }
    
    private Aluno alterarDesempenho(int cod){
        Aluno al;
        for(int i = 0; i < bdaluno.size(); i++){
            
            if(cod == bdaluno.get(i).getCod()){
                al = bdaluno.get(i);
                String nvDes = infAlteracao("Informe o desempenho atual do aluno:");
                al.setDesenvolvimento(nvDes);
                bdaluno.set(i, al);
                return bdaluno.get(i);
            }
        }
        
        return null;
    }
    
    private Aluno alterarAulas(int cod){
        Aluno al;
        for(int i = 0; i < bdaluno.size(); i++){
            
            if(cod == bdaluno.get(i).getCod()){
                al = bdaluno.get(i);
                String nvAula = infAlteracao("Informe a quantidade de aulas dadas ao aluno: ");
                int aulas = Integer.parseInt(nvAula);
                al.setAulasdadas(aulas);
                bdaluno.set(i, al);
                return bdaluno.get(i);
            }
        }
        
        return null;
    }
    
    public String infAlteracao(String msg){
        String resp = JOptionPane.showInputDialog(
                null,
                msg,
                "ALTERAR",
                JOptionPane.INFORMATION_MESSAGE);
        return resp;
    }
    
    private int geraCodigo(){
        int cod = 0;
        for(Aluno al : bdaluno){
            if(al.getCod() != cod){
                break;
            }else{
                cod++;
            }
        }
        return cod;
    }
}
