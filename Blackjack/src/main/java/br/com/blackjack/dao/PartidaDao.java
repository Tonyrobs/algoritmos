package br.com.blackjack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PartidaDao {

    public void salvarPartida(String vencedor, int ptsJogador, int ptsBanca) {
        String sql = "INSERT INTO partidas (vencedor, pontos_jogador, pontos_banca) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, vencedor);
            stmt.setInt(2, ptsJogador);
            stmt.setInt(3, ptsBanca);

            stmt.executeUpdate();
            System.out.println("Partida salva com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao salvar: " + e.getMessage());
        }
    }
}