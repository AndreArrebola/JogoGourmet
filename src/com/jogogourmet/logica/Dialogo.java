
package com.jogogourmet.logica;

import javax.swing.JOptionPane;

public class Dialogo {
    public int exibirMensagem(String tituloMensagem, String textoMensagem) {
        int comando = JOptionPane.showConfirmDialog(null,
                      textoMensagem,
                      tituloMensagem,
                      JOptionPane.DEFAULT_OPTION,
                      JOptionPane.INFORMATION_MESSAGE);
        return comando;
    }
    public String fazerPergunta(String tituloPergunta, String textoPergunta) {
        String resposta = JOptionPane.showInputDialog(null, 
                          textoPergunta, 
                          tituloPergunta, 
                          JOptionPane.QUESTION_MESSAGE);
        return resposta;
    }
    
    public int perguntarSimNao(String tituloPergunta, String textoPergunta) {
        int resposta = JOptionPane.showConfirmDialog(null, 
                textoPergunta,
                tituloPergunta,
                JOptionPane.YES_NO_OPTION);
        return resposta;
    }
    public boolean respondeuSim(int enumResposta) {
        return enumResposta == JOptionPane.YES_OPTION;
    }
    public boolean verificarFim(int enumComando) {
        return enumComando == JOptionPane.CLOSED_OPTION;
    }
}
