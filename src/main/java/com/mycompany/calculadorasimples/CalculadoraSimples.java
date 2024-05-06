/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadorasimples;

import java.util.Scanner;
public class CalculadoraSimples {

    public static void main(String[] args) {
        
        double n1,n2;
        int op;
        double Soma;
        double Subitracao;
        double Divisao;
        double multiplicacao;
        
        Scanner sc=new Scanner(System.in);
       
        System.out.println(" Informe o primeiro valor :");
        
        n1= sc.nextDouble();
        
        System.out.println(" Informe o segundo valor :");
        
        n2=sc.nextDouble();
        
        System.out.println(" SELECIONE UMA OPERAÇÃO ");
        System.out.println(" [1] - SOMA ");
        System.out.println(" [2] - SUBTRAÇÃO ");
        System.out.println(" [3] - MULTIPLICAÇÃO ");
        System.out.println(" [4] - DIVISÃO ");
        System.out.println(" DIGITE SUA OPÇÃO ");
        op= sc.nextInt();
        
        switch(op){
            case 1: 
                Soma=n1+n2;
                System.out.println(" A SOMA É "+Soma);
                break;
            case 2:
                Subitracao=n1-n2;
                System.out.println(" A SUBTRACAO  É "+Subitracao);
                 break;
            case 3:
                multiplicacao=n1*n2;
                System.out.println(" A MULTIPLICAÇÃO  É "+multiplicacao);
                 break;
            case 4:
                
                if(n1<n2){
                System.out.println(" IMPOSSIVEL REALIZAR O CALCULO ");}
                else{
                 Divisao=n1/n2;
                
                
                System.out.println(" A DIVISÃO É "+Divisao);}
                 break;
                 
            default:
                System.out.println(" OPERAÇÃO INVALIDA ");
                
              
        }
    }
    
}
