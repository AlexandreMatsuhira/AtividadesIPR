/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *Crie uma função que receba dois números reais como parâmetro e retorne o maior
deles. Elabore um programa que leia dois valores e apresente o maior, usando esta
função.
 * @author Alexandre M
 */
public class Exercicio3 {

    public static Scanner input = new Scanner(System.in);
    
    public static float lerNumero(String tipo){
        System.out.print("Digite o valor "+tipo+": ");
        return Float.parseFloat(input.nextLine());
    }
    
    public static float encontrarMaior(float a, float b){
        if(a>b)
        return a;
        else
            return b;
    }
                    
            
            
    public static void main(String[] args) {
        
        float valorA = lerNumero("A");
        float valorB = lerNumero("B");
        
        double maior = encontrarMaior(valorA, valorB);
        
        System.out.println("o maior numero e: "+maior);
        
        
        
        
    }
    
}
