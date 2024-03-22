package com.mycompany.ex_oo_agregacao;
import Entidades.*;
import java.util.Scanner;


public class Ex_OO_Agregacao {
    
    public static void Menu(){
        int opcao;
        Scanner read = new Scanner(System.in);
        GerenciadorProprietario gp1 = new GerenciadorProprietario();
        String nome;
        
        do{
            System.out.println("----------Menu----------");
            System.out.println("1-Adicionar Proprietario");
            System.out.println("2-Remover Proprietario");
            System.out.println("3-Pesquisar Proprietario");
            System.out.println("4-Imprimir Proprietarios");
            System.out.println("------------------------");
            opcao = read.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Adicionando...");
                    gp1.adicionarProprietario();
                break;
                
                case 2:
                    System.out.println("Insira o nome do Proprietario: ");
                    nome = read.next();
                    System.out.println("Removendo...");
                    gp1.removerProrpietario(nome);
                break;
                
                case 3:            
                    System.out.println("Insira o nome do Proprietario: ");
                    nome = read.next();
                    System.out.println("Removendo...");
                    gp1.pesquisarProprietario(nome);
                break;
                
                case 4:
                    System.out.println("Imprimindo...");
                    gp1.imprimirProprietarios();
                break;
            }
            
        }while(opcao != 0);
        
    }
    
    public static void main(String[] args) {
        Menu();
        
    }
}
