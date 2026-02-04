package br.com.blackjack.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Participante implements IParticipante {
    protected List<Carta> mao = new ArrayList<>();

    @Override
    public void receberCarta(Carta c) {
        mao.add(c);
    }

    @Override
    public void limparMao() {
        mao.clear();
    }

    @Override
    public List<Carta> getMao() {
        return mao;
    }

    @Override
    public int getPontos() {
        int soma = 0;
        int quantidadeAses = 0;

        for (Carta c : mao) {
            soma += c.getPontos();
            if (c.getValor() == Valor.AS) {
                quantidadeAses++;
            }
        }

        while (soma > 21 && quantidadeAses > 0) {
            soma -= 10;
            quantidadeAses--;
        }

        return soma;
    }
}