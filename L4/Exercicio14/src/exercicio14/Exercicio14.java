/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio14;

import java.util.Scanner;

/**
 *14) Faça um programa que, para uma conta bancária, leia o seu número, o saldo atual,
o tipo de operação a ser realizada (1 - depósito ou 2 - saque) e o valor da operação.
Após, o programa deve calcular e apresentar o novo saldo. Se o novo saldo ficar
negativo, deve ser mostrada, também, a mensagem “conta estourada”. O programa deve
possuir duas funções, uma para realizar os depósitos e outra os saques. As demais
tarefas devem ser feitas no programa principal.
 * @author me
 */
public class Exercicio14 {

    public static Scanner input = new Scanner(System.in);
    
    public static float calcularDeposito(float a, float b){
    return a+b;
}
    
    public static float calcularSaque(float a, float b){
        return a-b;
        
    }
    
    
    public static void main(String[] args) {
        
        
        System.out.print("Digite o numero da conta: ");
        String numeroConta = input.nextLine();
        
        System.out.print("Digite o saldo atual: ");
        float saldoAtual = Float.parseFloat(input.nextLine());
        
        System.out.println("Digite o tipo de operação a ser realizada");
        System.out.println("1 - depósito ou 2 - saque): ");
        int tipoOperacao = Integer.parseInt(input.nextLine());
        
        System.out.println("Digite o valo rd aoperacao");
        float valorOperacao = Float.parseFloat(input.nextLine());
        
        float novoSaldo = 0;
        
        switch (tipoOperacao) {
            case 1:
                novoSaldo = calcularDeposito(saldoAtual, valorOperacao);
                System.out.println("Deposito realizado com sucesso!");
                break;
            case 2:
                novoSaldo = calcularSaque(saldoAtual, valorOperacao);
                System.out.println("Saque realizado com sucesso!");
                break;
            default:
                System.out.println("Tipo de operacao invalida");
                break;
        }
        
        System.out.println("Novo saldo: " + novoSaldo);
        
        if(novoSaldo < 0)
            System.out.println("Conta estourada");
            
    }
    
}
