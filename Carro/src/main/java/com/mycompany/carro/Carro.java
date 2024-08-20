/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carro;

/**
 *
 * @author aluno
 */
public class Carro {
    private String modelo;
    private int ano;
    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }
    public void ligandoCarro(){
        System.out.println("Carro modelo: "+modelo+" está ligado");
    }
    public static void main(String[] args) {
        Carro carro = new Carro("Chevette",93);
        carro.ligandoCarro();
    }
}
