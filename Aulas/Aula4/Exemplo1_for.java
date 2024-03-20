
package Aula4;

import java.util.Scanner;


public class Exemplo1_for {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inicio:");
        int inicio = input.nextInt();
        
        System.out.println("Fim:");
        int fim = input.nextInt();
        
        //Fazemos um if de teste
       if(inicio < fim){
           //Depois desse teste ele executa a condição for que se for verdade ele volta e executa ate o fim da condição
           for(int i = inicio; i <= fim; i++){
            System.out.println("I:"+ i);
           }
       }else if(inicio > fim){
            for(int i = inicio; i >= fim; i--){
            System.out.println("I:"+ i);
            }
        }
    }
}
