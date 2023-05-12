/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio7;

import java.util.Scanner;

/**
 *7) Faça um programa que leia o saldo da conta de um cliente e a taxa de juros de um
determinado mês. O programa deve ter uma função que recebe como parâmetro estes
valores, calcula e retorna o novo saldo. Por fim, o programa deve apresentar o novo saldo
da conta após o recebimento do valor correspondente aos juros daquele mês.
 * @author AM
 */
public class Exercicio7 {

    public static Scanner input = new Scanner(System.in);
    
    public static float calcularSaldo(float saldo, float taxaJuros){
        float juros = saldo * (taxaJuros / 100);
        return juros + saldo;
    }
    
    public static void main(String[] args) {
        
        System.out.print("Digite o saldo da conta: ");
        float saldo = Float.parseFloat(input.nextLine());
        
        System.out.print("Digite a taxa de juros do mes: ");
        float taxaJuros = Float.parseFloat(input.nextLine());
        
        float novoSaldo = calcularSaldo(saldo, taxaJuros);
        
        System.out.println("O novo saldo da conta é: R$" + novoSaldo);
    }
    
}
