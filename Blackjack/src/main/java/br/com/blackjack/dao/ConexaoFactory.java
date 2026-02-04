package br.com.blackjack.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoFactory {
    private static final String URL = "jdbc:sqlite:blackjack_db.sqlite";

    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public static void inicializarBanco() {
        String sql = "CREATE TABLE IF NOT EXISTS partidas (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "vencedor TEXT, " +
                "pontos_jogador INTEGER, " +
                "pontos_banca INTEGER, " +
                "data_hora DATETIME DEFAULT CURRENT_TIMESTAMP)";

        try (Connection conn = getConexao();
             Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
            System.out.println("Banco de dados verificado/criado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao iniciar banco: " + e.getMessage());
        }
    }
}