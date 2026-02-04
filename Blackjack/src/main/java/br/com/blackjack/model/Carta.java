package br.com.blackjack.model;

public class Carta {
    private final Naipe naipe;
    private final Valor valor;

    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public int getPontos() {
        return valor.getValorNumerico();
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}