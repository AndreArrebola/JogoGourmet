
package com.jogogourmet.arvore;


public class NoPrato {
    private String nomePrato;
    private NoPrato pratoSim;
    private NoPrato pratoNao;

    public NoPrato(String nomePrato){
        this.nomePrato = nomePrato;
        pratoSim = null;
        pratoNao = null;
    }

    public NoPrato(String nomePrato, String nomePratoSim, String nomePratoNao) {
        setPratoComFilhos(nomePrato, nomePratoSim, nomePratoNao);
    }

    public final void setPratoComFilhos(String nomePrato, String nomePratoSim, String nomePratoNao) {
        this.nomePrato = nomePrato;
        pratoSim = new NoPrato(nomePratoSim);
        pratoNao = new NoPrato(nomePratoNao);
    }
    
    public NoPrato getPratoSim() {
        return pratoSim;
    }

    public NoPrato getPratoNao() {
        return pratoNao;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    

    
    
}
