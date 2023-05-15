/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio15;

import java.util.Scanner;

/**
 *15) Faça um programa leia o salário bruto e o número de dependentes de um funcionário
e calcule o seu salário líquido. Para calcular o salário líquido, deve-se descontar:
 * @author AM
 */
public class Exercicio15 {

    static Scanner input = new Scanner(System.in);

    public static float calcularSalarioLiquido(float salarioBruto, int dependentes) {
        float descontoINSS = descontarINSS(salarioBruto);
        float descontoIR = descontarIR(salarioBruto);
        float auxilioDependentes = dependentes * 250;
        float salarioLiquido = salarioBruto - descontoINSS - descontoIR + auxilioDependentes;
        return salarioLiquido;
    }

    public static float descontarINSS(float salarioBruto) {
        if (salarioBruto <= 2000)
            return salarioBruto * 0.08f;
        else
            return salarioBruto * 0.11f;
    }

    public static float descontarIR(float salarioBruto) {
        if (salarioBruto <= 2500)
            return 0.00f;
        else if (salarioBruto <= 5000)
            return salarioBruto * 0.075f;
        else if (salarioBruto <= 10000)
            return salarioBruto * 0.15f;
        else
            return salarioBruto * 0.27f;
    }

    public static void main(String[] args) {

        System.out.print("Digite o salário bruto: ");
        float salarioBruto = Float.parseFloat(input.nextLine());

        System.out.print("Digite o número de dependentes: ");
        int numeroDependentes = Integer.parseInt(input.nextLine());

        float salarioLiquido = calcularSalarioLiquido(salarioBruto, numeroDependentes);
        float descontoINSS = descontarINSS(salarioBruto);
        float descontoIR = descontarIR(salarioBruto);

        System.out.println("O desconto do INSS é de: " + descontoINSS);
        System.out.println("O desconto do IR é de: " + descontoIR);
        System.out.println("O salário líquido é de: " + salarioLiquido);
    }
}