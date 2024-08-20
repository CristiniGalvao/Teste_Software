/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorasimples;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero1;
        int numero2;
        String escolha;
        System.out.println("Digite o primeiro numero escolhido: ");
        numero1 = in.nextInt();
        System.out.println("Digite o segundo numero escolhido: ");
        numero2 = in.nextInt();
        System.out.println("Escolha qual operação deseja realizar\n A (Adição)\n S (Subtração)\n M (Multiplicação)\n D (Divisão)");
        escolha = in.next();
  if(escolha.equalsIgnoreCase("A")){
      int resultado = numero1 + numero2;
      System.out.println("Resultado da Adição dos numeros é igual a : "+resultado);
  }else if(escolha.equalsIgnoreCase("S")){
            int resultado = numero1 - numero2;
      System.out.println("Resultado da Subtração dos numeros é igual a : "+resultado);
  }else if(escolha.equalsIgnoreCase("M")){
            int resultado = numero1 * numero2;
      System.out.println("Resultado da Multiplicação dos numeros é igual a : "+resultado);
  }else if(escolha.equalsIgnoreCase("D")){
      if(numero2 != 0 ){
            int resultado = numero1 / numero2;
            System.out.println("Resultado da Divisão dos numeros é igual a : "+resultado);
      }else{
          System.out.println("Não é possivel dividir por zero");
      }
  }else{
      System.out.println("Escolha uma opção valida");
  }
    } 
}
