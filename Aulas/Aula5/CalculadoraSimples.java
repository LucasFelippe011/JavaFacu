/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5;

import java.util.Scanner;

/**
 *
 * @author lucas.fsiqueira2
 * 
 * Calculadora Simles:
 * Soma
 * Subtração
 * Divisão
 * Multiplicação
 */
public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        do{
        System.out.println("1 - Adição ");
        System.out.println("2 - Subtração ");
        System.out.println("3 - Divisao ");
        System.out.println("4 - Multiplicação ");
        System.out.println("Opções: ");
        op = input.nextInt(); 
            if(op < 1 || op > 4){
                System.err.println("Opçao invalida. digite novamente");
            }
        }while(op < 1 ||  op > 4);
        
        System.out.println("Digite seu numero");
        float n1 = input.nextFloat();
        System.out.println("Digite o segundo numero");
        float n2 = input.nextFloat();
        
        switch(op){
            case 1:
                //float calc = n1 + n2;
                System.out.println("Resultado:" + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado:" + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado:" + (n1 / n2));
                break;
            case 4:
                System.out.println("Resultado:" + (n1 * n2));
                break;
        }
        
        
        
        
    }
}
