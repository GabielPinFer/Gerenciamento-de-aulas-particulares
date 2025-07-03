// Desenvolvedor: Gabriel Pinheiro Ferrari
// Modificação: 02/07/2025

package Gerenciamento;
import Objetos.Professor;
import java.util.List;
import java.util.LinkedList;

public class GerProf {
    private static GerProf profUnic;
    private List<Professor> bdprof;
    
    //construtor
    private GerProf(){
        bdprof = new LinkedList<>();
    }
    
    //singleton
    public static GerProf geraGerProf(){
        if(profUnic == null){
            profUnic = new GerProf();
        }
        return profUnic;
    }
    
    public List<Professor> getBdProf(){
        return bdprof;
    }
    
    public void cadastrar(Professor prof){
        bdprof.add(prof);   
    }
    
    public Professor buscar(String cpf){
        
        for(Professor prof : bdprof){
            if(cpf.equals(prof.getCpf())){
                return prof;
            }
        }
        return null;
    }
    
    //Sobrecarga de busca (por senha)
    public Professor buscar(String senha, String user){
        for(Professor prof : bdprof){
            if(prof.getSenha().equals(senha) && prof.getUser().equals(user)){
                return prof;
            }
        }
        return null;
    }
    
    public Professor excluir(String cpf){
        
        for(Professor prof : bdprof){
            if(cpf.equals(prof.getCpf())){
                bdprof.remove(prof);
                return null;
            }
        }
        
        return null;
    }
}
