/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade04.view;

import javax.swing.DefaultListModel;
//import br.com.ifba.atividade04.view.Vetor;
import javax.swing.JList;
/**
 *
 * @author Administrator
 */
public class VactorManager {
    //intermediador
    //DefaultListModel<String> listModel;//cria lista para armazenar as strings
    //int index;
   
    //adiciona o numero digitado no campo ao jList
    public static void adicionar(String text, JList<String> lstItens){
        
        if (lstItens.getModel() instanceof DefaultListModel) {
            DefaultListModel<String> model = (DefaultListModel<String>) lstItens.getModel();
            if (text != null && !text.isEmpty()) {
                model.addElement(text);
            } else {
                //JOptionPane.showMessageDialog(null, "Please enter some text!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    public static void remover(){}
    public static void ordenar(){}
}
