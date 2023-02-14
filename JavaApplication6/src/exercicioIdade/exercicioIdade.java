/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioIdade;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class exercicioIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade, dias;
        String nome;

        Scanner enterData = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        nome = enterData.next();
        System.out.println("Digite sua idade:");
        idade = enterData.nextInt();

        dias = idade * 365;

        System.out.println(nome + " Você já viveu " + dias + " dias!"); 


    }
    
}
