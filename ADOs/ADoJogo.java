
package Aula5;

import java.util.Random;
import java.util.Scanner;


public class ADoJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      int n1;
        
        Random NALEATORIO = new Random();
        int n = NALEATORIO.nextInt(10);
        
        do{
              System.out.println("Digite um numero:");
         n1 = input.nextInt();
            if(n1 < n){
            System.out.println("Proximo >");
            
            }else{
                System.out.println("perto <");
               
            }
          
        }while(n1 > n || n1 < n);
        System.out.println("Parabens vc acertou");
    }
 
}


/*

    if(n1 > 10 || n1 < 0){
                System.err.println("Opçao invalida. digite novamente");
            }
*/