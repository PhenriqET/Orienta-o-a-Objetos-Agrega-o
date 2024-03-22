package Entidades;

import java.util.Objects;
import java.util.Scanner;

public class Roda {
    private double raio;
    private String material;
    private double peso;
    private double suporteMax;
    
    //Metodos
    
    public Roda(){//Principal
        this.raio = 0.0;
        this.material = " ";
        this.peso = 0.0;
        this.suporteMax = 0.0;
    }
    
    public Roda(double raio, String material, double peso, double suporteMax){//Parametros
        this.raio = raio;
        this.material = material;
        this.peso = peso;
        this.suporteMax = suporteMax;
    }
    
    public void copia(Roda copia){
        this.raio = copia.raio;
        this.material = copia.material;
        this.peso = copia.peso;
        this.suporteMax = copia.suporteMax;
    }
    
    //Getters and Setters

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getSuporteMax() {
        return suporteMax;
    }
    public void setSuporteMax(double suporteMax) {
        this.suporteMax = suporteMax;
    }
    
    //Preencher
    public void fill(){
        Scanner read = new Scanner(System.in);
        System.out.println("---Preenchendo-Roda---");
        System.out.println("Raio: ");
        this.raio = read.nextDouble();
        read.nextLine();
        System.out.println("Material: ");
        this.material = read.nextLine();
        System.out.println("Peso: ");
        this.peso = read.nextDouble();
        read.nextLine();
        System.out.println("Suporte Maximo: ");
        this.suporteMax = read.nextDouble();
        read.nextLine();
    }
    
    @Override
    public String toString(){
     return "Roda { Raio: " + this.raio
            + ", Material: " + this.material
            + ", Peso: " + this.peso
            + ", Suporte Maximo: " + this.suporteMax + "}";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.raio) ^ (Double.doubleToLongBits(this.raio) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.material);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.suporteMax) ^ (Double.doubleToLongBits(this.suporteMax) >>> 32));
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
        final Roda other = (Roda) obj;
        if (Double.doubleToLongBits(this.raio) != Double.doubleToLongBits(other.raio)) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (Double.doubleToLongBits(this.suporteMax) != Double.doubleToLongBits(other.suporteMax)) {
            return false;
        }
        return Objects.equals(this.material, other.material);
    }
    
    
    
}
