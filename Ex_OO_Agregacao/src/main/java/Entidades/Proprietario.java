package Entidades;
import java.util.List;
import java.util.ArrayList;

public class Proprietario {
    private String nome;
    private String cpf;
    private String email;
    List<Carro> carros;
    
    //Metodos
    
    public Proprietario() {//Parametros
        this.nome = " ";
        this.cpf = " ";
        this.email = " ";
        this.carros = new ArrayList<>();
    }
    
    public Proprietario(String nome, String cpf, String email, List<Carro> carros) {//Parametros
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.carros = carros;
    }
    
    public void copiaProprietario(Proprietario copia){
        this.nome = copia.nome;
        this.cpf = copia.cpf;
        this.email = copia.email;
        this.carros = copia.carros;
    }
    
    //Getters e Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public List<Carro> getCarros() {
        return carros;
    }
    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    
    
}
