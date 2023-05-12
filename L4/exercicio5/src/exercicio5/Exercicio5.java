/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio5;

import java.util.Scanner;

/**
 *5) Faça um programa que leia um número inteiro N e passe-o por parâmetro para uma
função que deve apresentar uma mensagem indicando se N é par ou ímpar.
 * @author AM
 */
public class Exercicio5 {

    public static Scanner input = new Scanner(System.in);
    
    public static int lerNumero(String tipo){
        System.out.print("Digite o valor "+tipo+": ");
        return Integer.parseInt(input.nextLine());
    }
    
    public static void compararNumero(int numero){
        int resto = numero%2;
        if(resto != 0)
            System.out.println(numero+" é impar!");
        else
            System.out.println(numero+" é par");
            
    }
    
    public static void main(String[] args) {
        int numero = lerNumero("Digite o valor do numero");
        compararNumero(numero);
        
        
    }
    
}
