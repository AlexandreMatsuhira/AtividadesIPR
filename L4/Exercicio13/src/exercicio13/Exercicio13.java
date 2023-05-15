/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio13;

import java.util.Scanner;

/**
 *13) Escreva um programa que tome como entradas as coordenadas de um ponto
(abscissa e ordenada) e as envie para uma função que deve imprimir em que quadrante
(1, 2, 3 ou 4) o ponto está localizado.
 * @author Alexandre M
 */
public class Exercicio13 {

    public static Scanner input = new Scanner(System.in);
    
    static int lerNumero(String tipo){
        System.out.print("Digite a coordenada "+tipo+":");
        return Integer.parseInt(input.nextLine());
    }
    
    static void encontreQuadrante(int x, int y){
        if(x>0 && y>0)
            System.out.println("Esta no quadrante 1");
        else if(x<0 && y>0)
            System.out.println("Esta no quadrante 2");
        else if(x<0 && y<0)
            System.out.println("Esta no quadrante 3");
        else if(x<0 && y > 0)
            System.out.println("Esta no quadrante 4");
        else if(x==0 && y!=0)
            System.out.println("Esta no eixo x");
        else if(x!=0 && y==0)
            System.out.println("Esta no eixo x");
        else
            System.out.println("O ponto esta na origem");
        
            
            
        
    }
    
    
    public static void main(String[] args) {
        
        int x = lerNumero("absicissa");
        int y = lerNumero("ordenada");
        
        encontreQuadrante(x,y);
        
        
        
        
    }
    
}
