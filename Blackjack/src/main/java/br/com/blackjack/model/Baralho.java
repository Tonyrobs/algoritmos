package br.com.blackjack.model;

import java.util.Collections;
import java.util.Stack;

public class Baralho {
    private Stack<Carta> cartas;

    public Baralho() {
        cartas = new Stack<>();
        gerarCartas();
    }

    private void gerarCartas() {
        for (Naipe n : Naipe.values()) {
            for (Valor v : Valor.values()) {
                Carta c = new Carta(n, v);
                cartas.add(c);
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta distribuir() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.pop();
    }
}