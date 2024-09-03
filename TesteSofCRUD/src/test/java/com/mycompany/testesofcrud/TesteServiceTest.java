/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testesofcrud;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aluno
 */
public class TesteServiceTest {
    
    public TesteServiceTest() {
    }
    

    /**
     * Test of salvarUsuario method, of class TesteService.
     */
    @Test
    public void testSalvarUsuario() {
        TesteService usuarioService = new TesteService();
        Usuario usuario = new Usuario(1L, "Katherine");

        usuarioService.salvarUsuario(usuario);

        assertEquals(1, usuarioService.getUsuarios().size());
        assertEquals("Katherine", usuarioService.getUsuarios().get(0).getNome());
        System.out.println("ID:"+usuario.getId()+" Nome: " + usuario.getNome());
    }

    /**
     * Test of deleteUsuario method, of class TesteService.
     */
    @Test
    public void testDeleteUsuario() {
        TesteService usuarioService = new TesteService();
        Usuario usuario = new Usuario(1L, "Niklaus");

        usuarioService.salvarUsuario(usuario);
        usuarioService.deleteUsuario(1L);

        assertEquals(0, usuarioService.getUsuarios().size());
        System.out.println("ID:"+usuario.getId()+" Nome: " + usuario.getNome());
    }

    /**
     * Test of buscaPorID method, of class TesteService.
     */
    @Test
    public void testBuscaPorID() {
        TesteService usuarioService = new TesteService();
        Usuario usuario = new Usuario(1L, "Rebeka");

        usuarioService.salvarUsuario(usuario);
        Usuario foundUser = usuarioService.buscaPorID(1L);

        assertNotNull(foundUser);
        assertEquals("Rebeka", foundUser.getNome());
        System.out.println("ID:"+usuario.getId()+" Nome: " + usuario.getNome());
    }

    /**
     * Test of editarUsuario method, of class TesteService.
     */
    @Test
    public void testEditarUsuario() {
        TesteService usuarioService = new TesteService();
        Usuario usuario = new Usuario(1L, "Elena");

        usuarioService.salvarUsuario(usuario);
        usuarioService.editarUsuario(1L, "Helena");

        assertEquals("Helena", usuarioService.getUsuarios().get(0).getNome());
        System.out.println("ID:"+usuario.getId()+" Nome: " + usuario.getNome());
    }

    
}
