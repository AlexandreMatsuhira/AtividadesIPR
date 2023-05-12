/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

import java.util.Scanner;

/**
 Crie um programa que leia as medidas da base e altura de um retângulo, calcule e
apresente a área e o perímetro deste retângulo. Crie uma função para calcular a área e
outra para calcular o perímetro.
 * @author Alexandre M Andrade
 */
public class Exercicio1 {

    public static Scanner input = new Scanner(System.in);
    
    public static float lerMedida(String a){
        System.out.print("Digite o valor da "+a+ " do retangulo: ");
        return Float.parseFloat(input.nextLine()); 
    }
    
    public static float calcularArea(float a, float b){
        return a*b;
    }
    
    public static float calcularPerimetro(float a, float b){
        return (a+b)*2;
    }
    
    
    public static void main(String[] args) {
        float base = lerMedida("base");
        float altura = lerMedida("altura");
        
        float area = calcularArea(base, altura);
        
        float perimetro = calcularPerimetro(base, altura);
        
        System.out.println("Sua area e: "+area);
        System.out.println("Seu perimetro e: "+perimetro);
        
    }
    
}
