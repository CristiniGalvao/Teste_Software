/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

/**
 *
 * @author aluno
 */
public class ContaBancaria {
    private int numero;
    private double saldo;
    public ContaBancaria(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Foi depositado: R$"+valor);
        System.out.println("Saldo atual é: "+saldo);
    }
    public void sacar(double valor){
       saldo -= valor;
        System.out.println("Foi sacado: R$"+valor);
        System.out.println("Saldo atual é: "+saldo);
    }
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(256523,100.00);
        conta.depositar(200);
        conta.sacar(20);
    }
}
