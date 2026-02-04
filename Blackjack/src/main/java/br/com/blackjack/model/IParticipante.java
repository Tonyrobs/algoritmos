package br.com.blackjack.model;

import java.util.List;

public interface IParticipante {
    void receberCarta(Carta c);
    void limparMao();
    int getPontos();
    List<Carta> getMao();
}