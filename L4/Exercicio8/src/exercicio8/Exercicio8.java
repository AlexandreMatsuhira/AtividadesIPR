/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio8;

import java.util.Scanner;

/**
 *Faça um programa que leia o valor de uma venda e a condição de pagamento,
conforme opções abaixo. O programa deve enviar estes dados para uma função que
calcula e retorna o valor final da venda, que deve ser apresentado pelo programa.
 * @author AM
 */

public class Exercicio8 {

    public static Scanner input = new Scanner(System.in);
    
    public static float calcularValorFinal(float valorVenda, int condicaoVenda){
        switch(condicaoVenda){
            case 1 -> {
                return valorVenda * 0.9f;
            }
            case 2 -> {
                return valorVenda * 0.95f;
            }
            case 3 -> {
                return valorVenda;
            }
            case 4 -> {
                return valorVenda * 1.05f;
            }
            case 5 -> {
                return valorVenda * 0.93f;
            }
            case 6 -> {
                return valorVenda * 0.95f;
            }
            default -> {
                System.out.println("Opcao de pagamento inválida.");
                return 0;
            }
        }
            
    }
    
    public static void main(String[] args) {
        
        System.out.print("Digite o valor da venda: ");
        float venda = Float.parseFloat(input.nextLine());
        
        System.out.println("COndiçoes de pagamento:  ");
        System.out.println("1 - Venda a vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de débito");
        System.out.println("6 - Venda com cartão de crédito");
        System.out.print("Digite a condicao de pagamento: ");
        int condicaoPagamento = Integer.parseInt(input.nextLine());
        
        float valorFinal = calcularValorFinal(venda, condicaoPagamento);
        
        System.out.println("O valor final da venda é: " + valorFinal);
        
        
    }
    
}
