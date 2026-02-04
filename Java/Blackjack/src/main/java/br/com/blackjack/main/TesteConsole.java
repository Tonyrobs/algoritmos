package br.com.blackjack.main;

import br.com.blackjack.dao.ConexaoFactory;
import br.com.blackjack.dao.PartidaDao;

public class TesteConsole {
    public static void main(String[] args) {
        ConexaoFactory.inicializarBanco();

        PartidaDao dao = new PartidaDao();
        dao.salvarPartida("Teste Console", 21, 18);
    }
}