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
public class Verificador_Impar_Par {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite o numero para verificar se o mesmo é Par ou Ímpar: ");
        numero = in.nextInt();
              
        if(numero % 2  == 0){
            System.out.println("Numero "+numero+" é Par");
        }else{
            System.out.println("Numero "+numero+" é Ímpar");
        }
    }
}
