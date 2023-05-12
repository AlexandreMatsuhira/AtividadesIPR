/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

import java.util.Scanner;

/**
 *Escreva um programa que leia a temperatura em graus Celsius e apresente a
temperatura correspondente em graus Fahrenheit, usando a fórmula abaixo. Crie uma
função para fazer a conversão.
 * @author AM
 */
public class Exercicio4 {

    public static Scanner input = new Scanner(System.in);
    
    public static float lerNumero(String tipo){
        System.out.print("Digite o valor "+tipo+": ");
        return Float.parseFloat(input.nextLine());
    }
    
    public static float converterTemperatura(float temperatura){
        return (float) ((9.0 / 5.0)*temperatura)+32;
    }
    public static void main(String[] args) {
        
        float temperatura = lerNumero("da temperatura em Celcius");
        float fahrenheit = converterTemperatura(temperatura);
        
        System.out.println("o valor em Fahrenheit é: "+fahrenheit);
        
    }
    
}
