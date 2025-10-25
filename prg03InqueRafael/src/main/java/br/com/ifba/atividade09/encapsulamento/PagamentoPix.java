/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.encapsulamento;

/**
 *
 * @author Administrator
 */
public class PagamentoPix implements Pagamento {
    
    private double valor;
    private static final double CASHBACK_PERCENTUAL = 0.02; // 2% de taxa

    // Construtor
    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        double cashback = this.valor * CASHBACK_PERCENTUAL;
        // O valor final é o valor base MENOS o cashback
        return this.valor - cashback;
    }

    @Override
    public void imprimirRecibo() {
        double valorCashback = this.valor * CASHBACK_PERCENTUAL;

        System.out.println("--- RECIBO (Pix) ---");
        System.out.printf("Valor base: R$ %.2f%n", this.valor);
        System.out.printf("Cashback (2%%): -R$ %.2f%n", valorCashback);
        System.out.println("-------------------------");
        System.out.printf("Valor Final: R$ %.2f%n", this.calcularTotal());
        System.out.println("-------------------------");
    }
    
}
