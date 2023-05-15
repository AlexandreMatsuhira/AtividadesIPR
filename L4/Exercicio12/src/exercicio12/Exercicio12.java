/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio12;

import java.util.Scanner;

/**
 *12) Faça um programa que leia 3 números inteiros distintos e envie-os para uma função
que retornará o menor deles.
 * @author me
 */
public class Exercicio12 {

    public static Scanner input = new Scanner(System.in);
    
    static int leiaNumero(){
        System.out.print("um numero: ");
        return Integer.parseInt(input.nextLine());
    }
    
    static int compararNumero(int a, int b, int c){
        return Math.min(Math.min(a, b),c);
    }
    
            
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    int numeroA = leiaNumero();
    int numeroB = leiaNumero();
    int numeroC = leiaNumero();
    
    int menorValor = compararNumero(numeroA, numeroB, numeroC);
    
    
    
    System.out.println("Menor valor entre eles é: "+menorValor);
    
    }
    
    
}
