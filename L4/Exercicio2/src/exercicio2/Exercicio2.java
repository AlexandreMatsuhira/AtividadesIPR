/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *Faça um programa que leia dois números inteiros, calcule e apresente:
- Soma dos números.
- Subtração do primeiro pelo segundo.
- Multiplicação dos números.
- Divisão do primeiro pelo segundo.
Elabore uma função para efetuar cada operação. As funções devem receber por
parâmetro os dois números e retornar o resultado usando o comando return.
 * @author Alexandre M
 */
public class Exercicio2 {

    public static Scanner input = new Scanner(System.in);
    
    public static int lerNumero(String tipo){
        System.out.print("Digite o valor "+tipo+": ");
        return Integer.parseInt(input.nextLine());
    }
    public static int somarNumero(int a, int b){
        return a+b;
    }
    
    public static int subtrairNumero(int a, int b){
        return a-b;
    }
    public static int multiplicarNumero(int a, int b){
        return a * b;
    }
    
    public static int dividirNumero(int a, int b){
        return a / b;
    }
    
    
    public static void main(String[] args) {
        
       int valorA = lerNumero("A");
       int valorB = lerNumero("B");
       
       int soma = somarNumero(valorA, valorB);
       int subtracao = subtrairNumero(valorA, valorB);
       int produto = multiplicarNumero(valorA, valorB);
       int divisao = dividirNumero(valorA, valorB);
       
        System.out.println("A soma dos valores: "+soma);
        System.out.println("A subtracao dos valores: "+subtracao);
        System.out.println("O produto dos valores: "+produto);
        System.out.println("A divisao dos valores: "+divisao);
       
       
              
        
        
    }
    
}
