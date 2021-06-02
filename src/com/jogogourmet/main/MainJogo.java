
package com.jogogourmet.main;

import com.jogogourmet.arvore.NoPrato;
import com.jogogourmet.logica.Jogo;

public class MainJogo {
    

    public static void main(String[] args) {
        NoPrato pratosIniciais = new NoPrato("massa","Lasanha","Bolo de Chocolate");
        Jogo novoJogo = new Jogo();
        novoJogo.iniciarPartida(pratosIniciais);
    }
}
