
package com.jogogourmet.logica;

import com.jogogourmet.arvore.NoPrato;

public class Jogo extends Dialogo {
    
    public void iniciarPartida(NoPrato noInicial) {
        boolean executando = true;
        do{
            int comando = exibirMensagem("Jogo Gourmet",
                                         "Pense em um prato que gosta");
            if(verificarFim(comando)) {
                executando = false;
            } else {
                this.adivinharPrato(noInicial);
            }
          }while(executando);
    }
    
    private void adivinharPrato(NoPrato noAtual) {
        int resposta = perguntarSimNao("Confirm",
                                       "O prato que você pensou é " +
                                       noAtual.getNomePrato() + "?");
        if(respondeuSim(resposta)) {
            if(fimDaArvore(noAtual.getPratoSim())) {
                exibirMensagem("Jogo Gourmet",
                               "Acertei de novo!");            
            }else {
                adivinharPrato(noAtual.getPratoSim());
            }
        }else {
            if(fimDaArvore(noAtual.getPratoSim())) {
                perguntarPratoNovo(noAtual);
            }else {
                adivinharPrato(noAtual.getPratoNao());
            } 
        }
    }
    private void perguntarPratoNovo(NoPrato prato){
        String nomeTempPrato = prato.getNomePrato();
        String nomeNovoPrato = fazerPergunta("Desisto", 
                                            "Qual prato você pensou?"); 
        String infoNovoPrato = fazerPergunta("Complete", 
                                             nomeNovoPrato + " é ______ mas " + 
                                             nomeTempPrato + " não."); 
        prato.setPratoComFilhos(infoNovoPrato, nomeNovoPrato, nomeTempPrato);
    }
    
    private boolean fimDaArvore(NoPrato pratoVerificado) {
        return pratoVerificado == null;
    }
    
}
