package Entidades;
import java.util.List;
import java.util.ArrayList;


public class GerenciadorProprietario {
    List<Proprietario> listaProprietarios;
    
    
    //Metodos
    
    public GerenciadorProprietario(){
        this.listaProprietarios = new ArrayList<>();
    }
    
    public void adicionarProprietario(){
        Proprietario p1 = new Proprietario();
        p1.fill();
        this.listaProprietarios.add(p1);
    }
    
    public boolean removerProrpietario(String nome){
        for(Proprietario p1 : listaProprietarios){
            if(p1.getNome().equals(nome)){
                listaProprietarios.remove(p1);
                return true;
            }
        }
        return false;
    }
    
    public Proprietario pesquisarProprietario(String nome){
        for(Proprietario p1 : listaProprietarios){
            if(p1.getNome().equals(nome)){
                return p1;
            }
        }
        System.out.println("Proprietario nao encontrado!");
        return null;
    }
    
    public void imprimirProprietarios(){
        String aux;
        for(Proprietario p1 : listaProprietarios){
            System.out.println("---Imprimindo---");
            aux = p1.toString();
            System.out.println(aux);
        }
    }
}
