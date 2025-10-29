/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.hierarquia.classeConcreta;

import br.com.ifba.atividade10.hierarquia.Forma3D;

/**
 *
 * @author Administrator
 */
public class Cubo extends Forma3D {
    private double lado;

    // Construtor
    public Cubo(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double obterArea() {
        // Área da Superfície do Cubo = 6 * (lado * lado)
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double obterVolume() {
        // Volume do Cubo = lado^3
        return Math.pow(lado, 3);
    }
    
    @Override
    public String toString() {
        return "Cubo (lado: " + lado + ")";
    }
}
