/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade09.encapsulamento;

/**
 * @author Inque
 * Interface que define o contrato para uma forma de pagamento.
 * Qualquer classe que implementar esta interface deverá fornecer
 * lógicas para calcular o total e imprimir um recibo.
 */
public interface Pagamento {
    
    public double calcularTotal();
    public void imprimirRecibo();
    
}
