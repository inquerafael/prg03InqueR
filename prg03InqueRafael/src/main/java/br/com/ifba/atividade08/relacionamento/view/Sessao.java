/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.relacionamento.view;

/**
 *
 * @author Administrator
 */
public class Sessao {
    
    private Long id;
    private String token;

    // Relacionamento: Uma sessão pertence a um usuário (1)
    private Usuario usuario;

    // Construtor
    public Sessao() {
    }
    
    //gets e sets
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
