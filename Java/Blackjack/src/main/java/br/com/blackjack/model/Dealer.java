package br.com.blackjack.model;

public class Dealer extends Participante {

    public boolean devePedirCarta() {
        return getPontos() < 17;
    }
}