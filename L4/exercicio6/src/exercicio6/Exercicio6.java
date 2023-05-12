/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio6;

import java.util.Scanner;

/**
 *6) Suponha que o conceito de um aluno seja determinado em função da sua nota,
conforme a tabela abaixo. Crie um programa que leia o nome e a nota de um aluno e
passe-a por parâmetro para uma função que deve retornar o seu conceito. Por fim, o
programa deve apresentar o nome, a nota e o conceito do aluno.
 * @author AM
 */
public class Exercicio6 {

public static Scanner input = new Scanner(System.in);

public static String retornarConceito(float nota){
    if(nota < 0 || nota > 100)
        return "Nota invalida";
    else if(nota < 50)
        return "Insuficiente";
    else if(nota < 65)
        return "regular";
    else if(nota < 85)
        return "bom";
    else
        return "Otimo";
    
                
}


    public static void main(String[] args) {
        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = Float.parseFloat(input.nextLine());
        
        String  conceito = retornarConceito(nota);
        
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Nota do aluno: " + nota);
        System.out.println("Conceito do aluno: " + conceito);
    }
    
}
