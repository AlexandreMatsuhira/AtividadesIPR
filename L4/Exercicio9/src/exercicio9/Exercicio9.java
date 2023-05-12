/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio9;

import java.util.Scanner;

/**
 *Uma revendedora de carros paga a seus vendedores um salário fixo equivalente a dois
salários-mínimos, mais uma comissão de R$ 150,00 por carro vendido e mais uma

comissão de 5% do valor das vendas. Crie um programa que leia o valor do salário-
mínimo, quantos carros o vendedor vendeu ao longo do mês e o valor total das vendas.

Após ler os dados, o programa deve calcular e apresentar o valor do salário do
funcionário. O cálculo do salário deve ser realizado por uma função.
 * @author AM
 */
public class Exercicio9 {

    public static Scanner input = new Scanner(System.in);
    public static float salarioFuncionario(float salarioMinimo, int quantidadeCarros, float valorTotalVendido){
        
        float valorCarrosVendidos = (quantidadeCarros * 150) + valorTotalVendido * 0.05f;
        float salarioFixo = salarioMinimo * 2;
        return salarioFixo + valorCarrosVendidos;
        
    }
    
    
    public static void main(String[] args) {
        System.out.print("Salario minimo: ");
        float salarioMinimo = Float.parseFloat(input.nextLine());
        
        System.out.print("Quantidade de carros vendidos: ");
        int quantidadeCarros = Integer.parseInt(input.nextLine());
        
        System.out.print("Digite o valor total de carros vendidos: ");
        float valorTotalVendido = Float.parseFloat(input.nextLine());
        
        float salario = salarioFuncionario(salarioMinimo, quantidadeCarros, valorTotalVendido);
        
        System.out.println("Salário total é: " + salario);
    }
    
}
