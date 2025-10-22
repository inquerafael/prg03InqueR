/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.classeEObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status = false; 

    //construtor
    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
    }

    //metodos
    public void criarConta(){
        status = true;
        //regra de negocio
        if(status && tipo.equals("cc")){
            setSaldo(50);
        }else if(status && tipo.equals("cp")){
            setSaldo(150);
        }else{
            JOptionPane.showMessageDialog(null, "erro ao criar conta");
        }
        
    }
    public void fecharConta(){
        if (this.status) { // Verifica se a conta já está ativa
            if (this.getSaldo() > 0) {
                // Se o saldo for positivo, o cliente precisa sacar o dinheiro primeiro.
                JOptionPane.showMessageDialog(null, "Não é possível fechar a conta. Saldo positivo de: " + this.getSaldo() + "\nRealize o saque do valor total.");
            } else if (this.getSaldo() < 0) {
                // Se o saldo for negativo, o cliente precisa quitar o débito.
                JOptionPane.showMessageDialog(null, "Não é possível fechar a conta. Saldo devedor de: " + this.getSaldo() + "\nPor favor, quite seus débitos.");
            } else {
                // Se o saldo for zero, a conta pode ser fechada.
                this.setStatus(false); // Desativa a conta
                JOptionPane.showMessageDialog(null, "Conta de " + this.getDono() + " fechada com sucesso!");
            }
        } else {
        // Mensagem caso a conta já esteja desativada.
        JOptionPane.showMessageDialog(null, "Atenção: esta conta já está fechada.");
        }
        
    }
    public void depositar(){
        
    }
    public void sacar(){}
    public void pagarMensal(){}
    
    public boolean isStatus() {    
        return status;
    }

    //gets e sets
    public void setStatus(boolean status) {    
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
}
