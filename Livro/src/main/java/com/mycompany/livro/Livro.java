/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livro;

/**
 *
 * @author aluno
 */
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublic;
    public Livro(String titulo,String autor,int anoPublic){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublic = anoPublic;
    }
    
    public void detalhesExibir(){
        System.out.println("Titulo: "+titulo+"\n Autor: "+autor+"\n Ano Publicação: "+anoPublic);
    }
    public static void main(String[] args) {
        Livro livro = new Livro("Percy Jackson e os Olimpianos","Rick Riordan",2012);
        livro.detalhesExibir();
    }
}
