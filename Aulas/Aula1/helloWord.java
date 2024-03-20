
package Aula1;
//Importando o Scanner para poder 
import java.util.Scanner;
public class helloWord {
    public static void main(String[] args){
        
         Scanner entrada = new Scanner(System.in);
        
        
        //Comando escreva 
        System.out.println("Hello, Word!!");
        
        
        //Declarando uma variavel 
        String nome, nomeLucas = "lucas Felippe";
        
        //Fazendo contatenação
        System.out.println("Ola "+ nomeLucas);
        
        //Pegando infomações de entrada
        System.out.println("Digite seu nome: ");
        nome = entrada.next();
        
        //Imprimido
        System.out.println("ola "+ nome);
        
       
    }
}
