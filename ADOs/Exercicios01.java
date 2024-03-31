
package Aula5;

import java.util.Scanner;


public class Exercicios01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /*
        Escreva um programa em java que leia dois numeros inteiros e imprima os nuemros pares
        e immpares de acordo com as regras abaixos:
        1: se o valor inicial gor maior que o valor Final, o programa deve imprimir apenas os numeros pares compreendidos entre o inicio e o fim
        
        
        */
        
          System.out.println("Inicio");
        int ini = input.nextInt();
        
        System.out.println("Fim:");
        int fim = input.nextInt();
        
        if(ini > fim){
          for(int i = fim; i <= ini; i++){

               if(i%2==0){
                System.out.println("Numeros pares:"+ i++);
               }
             
          }
         } else if(ini < fim){
               for(int i = ini; i <= fim; i++){

             if(i%2!=0){
             System.out.println("Numeros impares:"+ i++);
             }
             
             }
          
          }else{
            System.out.println("Numeros são iguais:" + ini +" , " + fim);
          };
          
          
        
        
    }
}
