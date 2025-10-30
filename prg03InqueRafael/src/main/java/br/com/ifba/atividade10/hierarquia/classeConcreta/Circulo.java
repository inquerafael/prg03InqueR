/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.hierarquia.classeConcreta;

import br.com.ifba.atividade10.hierarquia.Forma2D;

/**
 *
 * @author Administrator
 */
public class Circulo extends Forma2D {
    
    private final double raio;
    
    //construtor

    /**
     *
     * @param raio
     */
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double obterArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * O método toString() 
     * Ele deve retornar uma representação em texto do objeto.
     * Nós o sobrescrevemos (override) para dar uma descrição útil.
     * @return 
     */
    @Override
    public String toString() {
        return "Círculo (raio: " + raio + ")";
    }
    
}
