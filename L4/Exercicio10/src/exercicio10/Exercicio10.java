/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio10;

import java.util.Scanner;

/**
 *10) Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule
e imprima o seu índice de massa corporal, usando a seguinte fórmula: IMC = Peso /
Altura2
. Além do IMC, o programa deve mostrar se a pessoa está acima do peso ideal
(IMC > 25). O cálculo do IMC deve ser feito por uma função.
 * @author AM
 */
public class Exercicio10 {

    public static Scanner input = new Scanner(System.in);
    
    public static float calcularIMC(float peso, float altura){
        return peso / (altura * altura);
        
    }
    
    public static boolean acimadoPeso(float IMC){
        return IMC > 25;
    }
    public static void main(String[] args) {
        System.out.print("Digite o peso em (Kg)");
        float peso = Float.parseFloat(input.nextLine());
        
        System.out.print("Digite a altura em em (Metros)");
        float altura = Float.parseFloat(input.nextLine());
        
        float IMC = calcularIMC(peso, altura);
        boolean acimadoPeso = acimadoPeso(IMC);
        
        System.out.println("O IMC é: " + IMC);
        System.out.println("Acima do peso: " + acimadoPeso);
        
        
                
        
        
    }
    
}
