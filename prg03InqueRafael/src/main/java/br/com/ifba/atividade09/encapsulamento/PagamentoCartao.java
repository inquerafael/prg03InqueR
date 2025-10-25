/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.encapsulamento;

/**
 *
 * @author Administrator
 */
public class PagamentoCartao implements Pagamento {
    
    private double valor;
    private static final double TAXA_PERCENTUAL = 0.05; // 5% de taxa
    
    // Construtor
    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        double taxa = this.valor * TAXA_PERCENTUAL;
        return this.valor + taxa;
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("--- RECIBO (Cartão) ---");
        System.out.printf("Valor base: R$ %.2f%n", this.valor);
        System.out.printf("Taxa (5%%): R$ %.2f%n", (this.valor * TAXA_PERCENTUAL));
        System.out.printf("Valor Total: R$ %.2f%n", this.calcularTotal());
        System.out.println("-------------------------");
    }
    
    //ggets e sets
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
