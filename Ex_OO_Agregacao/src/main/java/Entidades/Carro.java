package Entidades;
import java.awt.BorderLayout;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Carro {
    private String fabricante;
    private String modelo;
    private double motor;
    private String cor;
    List<Roda> rodas;
    
    //Metodos
    
    public Carro() {//Principal
        this.fabricante = " ";
        this.modelo = " ";
        this.motor = 0.0;
        this.cor = " ";
        this.rodas = new ArrayList<>();
    }
    
    public Carro(String fabricante, String modelo, double motor, String cor, List<Roda> rodas) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.motor = motor;
        this.cor = cor;
        this.rodas = rodas;
    }
    
    public void copia(Carro copia){
        this.fabricante = copia.fabricante;
        this.modelo = copia.modelo;
        this.motor = copia.motor;
        this.rodas = copia.rodas;
    }
    
    //Getters e Setters

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }
    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public List<Roda> getRodas() {
        return rodas;
    }
    public void setRodas(List<Roda> rodas) {
        this.rodas = rodas;
    }
    
    //Preencher
    public void fill(){
        Scanner read = new Scanner(System.in);
        System.out.println("---Preenchendo-Carro---");
        System.out.println("Fabricante: ");
        this.fabricante = read.next();
        System.out.println("Modelo: ");
        this.modelo = read.next();
        System.out.println("Motor: ");
        this.motor = read.nextDouble();
        System.out.println("Cor: ");
        this.cor = read.next();
        for(int i= 0; i < rodas.size(); i++){
            System.out.println("Roda[" + i + "]: ");
            Roda aux = new Roda();
            aux.fill();
            rodas.add(aux);
        }
        
    }
    
    //To String
    @Override
    public String toString(){
        return "Carro { Fabricante: " + this.fabricante
               + ", Modelo: " + this.modelo
               + ", Motor: " + this.motor
               + ", Cor: " + this.cor
               + ", Roda: " + this.rodas + "}" ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.fabricante);
        hash = 79 * hash + Objects.hashCode(this.modelo);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.motor) ^ (Double.doubleToLongBits(this.motor) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.cor);
        hash = 79 * hash + Objects.hashCode(this.rodas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (Double.doubleToLongBits(this.motor) != Double.doubleToLongBits(other.motor)) {
            return false;
        }
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        return Objects.equals(this.rodas, other.rodas);
    }
    
    
    
}
