/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testesofcrud;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class TesteService {
    private List<Usuario> usuarios = new ArrayList<>();
    
    public void salvarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void deleteUsuario(Long id){
        usuarios.removeIf(usuario->usuario.getId().equals(id));
    }
    
    public Usuario buscaPorID(Long id){
        for(Usuario usuario: usuarios){
            if(usuario.getId().equals(id)){
                return usuario;
            }
        }
        return null;
    }
    
    public void editarUsuario(Long id, String newNome){
        for(Usuario usuario:usuarios){
            if(usuario.getId().equals(id)){
                usuario.setNome(newNome);
            }
        }
    }
        public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
