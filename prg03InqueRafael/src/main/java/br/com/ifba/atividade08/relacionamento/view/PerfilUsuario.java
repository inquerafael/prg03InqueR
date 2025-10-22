/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.relacionamento.view;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class PerfilUsuario {
    private long id;
    private String descript;
    private List<String> permissoes;
    //construtor

    public PerfilUsuario(long id, String descript, List<String> permissoes) {
        this.id = id;
        this.descript = descript;
        this.permissoes = permissoes;
    }
    
    //metodos
    public void Metodo(){}
    
    //get e set

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
