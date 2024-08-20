/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorasimples;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class CalculadoraFatorial {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro não-negativo: ");
        int numero = in.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Por favor, insira um número não-negativo.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        } 
   }
}
