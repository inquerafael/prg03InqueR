/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.relacionamento.view;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class LogAuditoria {
    private Long id;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;
    
    // Relacionamento: Um log pertence a um usuário (1)
    private Usuario usuario;

    // Construtor
    public LogAuditoria() {
    }
    
    //gets e sets

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
