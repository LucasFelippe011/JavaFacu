/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5;

import java.util.Scanner;

/**
 *
 * @author lucas.fsiqueira2
 */
public class AulaWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inicio");
        int ini = input.nextInt();
        
        System.out.println("Fim:");
        int fim = input.nextInt();
        
        //int i = 0;
        
        while(ini <= fim){
            
            System.out.println("i:" + ini);
            ini++;
            
        };
        
    }
}
