/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.encapsulamento;

/**
 *
 * @author Administrator
 */
public class PagamentoDinheiro implements Pagamento{
    
    private double valor;
    private static final double DESCONTO_PERCENTUAL = 0.1; // 10% de desconto
    
    // Construtor para receber o valor base
    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        double desconto = this.valor * DESCONTO_PERCENTUAL;//varivel do metodo vai receber o valor ja calculadoo
        return this.valor - desconto;//valor calculado subtraido do valor total antes de retornar
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("--- RECIBO (Dinheiro) ---");
        System.out.printf("Valor base: R$ %.2f%n", this.valor);
        System.out.printf("Desconto (10%%): R$ %.2f%n", (this.valor * DESCONTO_PERCENTUAL));
        System.out.printf("Valor Total: R$ %.2f%n", this.calcularTotal());
        System.out.println("-------------------------");
    }
    
    //gets e sets
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
