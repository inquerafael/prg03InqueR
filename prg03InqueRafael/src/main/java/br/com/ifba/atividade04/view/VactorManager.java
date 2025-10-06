/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade04.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
            DefaultListModel<String> model = (DefaultListModel<String>) lstItens.getModel();//cast para o tipo de modelo
            if (text != null && !text.isEmpty()) {
                model.addElement(text);
            } else {
                JOptionPane.showMessageDialog(null, "Please enter some text!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    public static void remover(JList<String> lstItens){
        if (!(lstItens.getModel() instanceof DefaultListModel)) {
            // Se o model não for o esperado
            return;
        }
        DefaultListModel<String> model = (DefaultListModel<String>) lstItens.getModel();

        // Descobrir o índice do item que o usuario selecionou
        int selectedIndex = lstItens.getSelectedIndex();

        // O método getSelectedIndex() retorna -1 se nada estiver selecionado.
        if (selectedIndex != -1) {
            // Se um item foi selecionado, removemos ele do model usando seu índice.
            model.remove(selectedIndex);
        } else {
            // Avisar o usuário que ele precisa
            // selecionar um item antes de tentar remover.
            JOptionPane.showMessageDialog(
                null, //null centraliza na tela
                "Por favor, selecione um item na lista para remover.",
                "Aviso", // Título da janela
                JOptionPane.WARNING_MESSAGE // Ícones
            );
        }
    }
    public static void ordenar(JList<String> lstItens){
        if (!(lstItens.getModel() instanceof DefaultListModel)) {
            return;
        }
        DefaultListModel<String> model = (DefaultListModel<String>) lstItens.getModel();

        // ArrayList para guardar todos os itens da JList.
        List<String> listaTemporaria = new ArrayList<>();
        for (int i = 0; i < model.getSize(); i++) {
            listaTemporaria.add(model.getElementAt(i));
        }
        // ordenar a lista
        Collections.sort(listaTemporaria);

        //Criar um NOVO model
        DefaultListModel<String> modelOrdenado = new DefaultListModel<>();
        
        // Popular o NOVO model
        for (String item : listaTemporaria) {
        modelOrdenado.addElement(item);
        }

        // Substituir o model antigo da JList pelo novo
        lstItens.setModel(modelOrdenado); 
        
    }
}
