/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void exbirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("idade: "+idade);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("Rafael",3);
        pessoa.exbirInfo();
    }
}
