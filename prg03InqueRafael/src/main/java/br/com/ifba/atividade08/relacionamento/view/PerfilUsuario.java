/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.relacionamento.view;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class PerfilUsuario {
    private long id;
    private String descript;
    private List<String> permissoes;
    
    //relacoes
    private List<Usuario> usuarios;
    
    
    //construtor
    public PerfilUsuario() {
        //this.id = id;
        this.usuarios = new ArrayList<>();
        this.permissoes = new ArrayList<>();
    }
    
    //metodos
    @Override
    public String toString() {
        return "PerfilUsuario{" + "id=" + id + ", descript=" + descript + ", permissoes=" + permissoes + '}';
    }
    
    //get e set

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }
}
