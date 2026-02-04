package br.com.blackjack.view;

import br.com.blackjack.dao.ConexaoFactory;
import br.com.blackjack.dao.PartidaDao;
import br.com.blackjack.model.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class BlackJackGame extends JFrame {

    private Baralho baralho;
    private PlayerHumano jogador;
    private Dealer dealer;
    private PartidaDao dao;

    private JPanel painelMesa, painelJogador, painelDealer, painelBotoes;
    private JButton btnPedir, btnParar, btnNovoJogo;
    private JLabel lblStatus, lblPontosJogador, lblPontosDealer;

    public BlackJackGame() {
        baralho = new Baralho();
        jogador = new PlayerHumano();
        dealer = new Dealer();
        dao = new PartidaDao();

        configurarJanela();

        iniciarJogo();
    }

    private void configurarJanela() {
        setTitle("BlackJack Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        painelMesa = new JPanel(new GridLayout(2, 1));
        painelMesa.setBackground(new Color(100, 0, 0));

        painelDealer = criarPainelCartas("Dealer");
        painelJogador = criarPainelCartas("Suas Cartas");

        painelMesa.add(painelDealer);
        painelMesa.add(painelJogador);
        add(painelMesa, BorderLayout.CENTER);

        JPanel painelInferior = new JPanel(new BorderLayout());

        lblStatus = new JLabel("Bem-vindo!");
        lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
        lblStatus.setFont(new Font("Arial", Font.BOLD, 18));
        painelInferior.add(lblStatus, BorderLayout.NORTH);

        painelBotoes = new JPanel();
        btnPedir = new JButton("PEDIR CARTA");
        btnParar = new JButton("PARAR");
        btnNovoJogo = new JButton("NOVO JOGO");

        painelBotoes.add(btnPedir);
        painelBotoes.add(btnParar);
        painelBotoes.add(btnNovoJogo);
        painelInferior.add(painelBotoes, BorderLayout.SOUTH);

        JPanel painelPlacar = new JPanel(new GridLayout(1, 2));
        lblPontosDealer = new JLabel("Dealer: ?" );
        lblPontosJogador = new JLabel("Você: 0" );
        lblPontosDealer.setHorizontalAlignment(SwingConstants.CENTER);
        lblPontosJogador.setHorizontalAlignment(SwingConstants.CENTER);
        painelPlacar.add(lblPontosDealer);
        painelPlacar.add(lblPontosJogador);
        painelInferior.add(painelPlacar, BorderLayout.CENTER);

        add(painelInferior, BorderLayout.SOUTH);

        btnPedir.addActionListener(e -> jogadaPedir());
        btnParar.addActionListener(e -> jogadaParar());
        btnNovoJogo.addActionListener(e -> iniciarJogo());
    }

    private JPanel criarPainelCartas(String titulo) {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        p.setBackground(new Color(100, 0, 0));
        p.setBorder(BorderFactory.createTitledBorder(null, titulo,
                TitledBorder.CENTER, TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14), Color.WHITE));
        return p;
    }

    private void iniciarJogo() {
        jogador.limparMao();
        dealer.limparMao();
        baralho = new Baralho(); // Baralho novo
        baralho.embaralhar();

        jogador.receberCarta(baralho.distribuir());
        dealer.receberCarta(baralho.distribuir());
        jogador.receberCarta(baralho.distribuir());
        dealer.receberCarta(baralho.distribuir());

        btnPedir.setEnabled(true);
        btnParar.setEnabled(true);
        btnNovoJogo.setEnabled(false);
        lblStatus.setText("Sua vez!" );

        atualizarInterface(false);
    }

    private void jogadaPedir() {
        jogador.receberCarta(baralho.distribuir());
        if (jogador.getPontos() > 21) {
            atualizarInterface(true);
            finalizarJogo("Você estourou! ");
        } else {
            atualizarInterface(false);
        }
    }

    private void jogadaParar() {
        while (dealer.devePedirCarta()) {
            dealer.receberCarta(baralho.distribuir());
        }
        determinarVencedor();
    }

    private void determinarVencedor() {
        int ptsJog = jogador.getPontos();
        int ptsDeal = dealer.getPontos();
        String resultado;

        if (ptsDeal > 21) {
            resultado = "Você Venceu! Dealer estourou. ";
        } else if (ptsJog > ptsDeal) {
            resultado = "Você Venceu! ";
        } else if (ptsDeal > ptsJog) {
            resultado = "Dealer Venceu! ";
        } else {
            resultado = "Empate! ";
        }

        atualizarInterface(true);
        finalizarJogo(resultado);
    }

    private void finalizarJogo(String msg) {
        lblStatus.setText(msg);
        btnPedir.setEnabled(false);
        btnParar.setEnabled(false);
        btnNovoJogo.setEnabled(true);

        dao.salvarPartida(msg, jogador.getPontos(), dealer.getPontos());
    }

    private void atualizarInterface(boolean revelarDealer) {
        painelJogador.removeAll();
        painelDealer.removeAll();

        for (Carta c : jogador.getMao()) {
            painelJogador.add(criarCartaVisual(c));
        }
        lblPontosJogador.setText("Você: " + jogador.getPontos());

        java.util.List<Carta> maoDealer = dealer.getMao();
        for (int i = 0; i < maoDealer.size(); i++) {
            if (i == 0 && !revelarDealer) {
                painelDealer.add(criarCartaVerso());
            } else {
                painelDealer.add(criarCartaVisual(maoDealer.get(i)));
            }
        }

        if (revelarDealer) {
            lblPontosDealer.setText("Dealer: " + dealer.getPontos());
        } else {
            lblPontosDealer.setText("Dealer: ?");
        }

        painelMesa.revalidate();
        painelMesa.repaint();
    }

    private JPanel criarCartaVisual(Carta c) {
        JPanel card = new JPanel(new BorderLayout());
        card.setPreferredSize(new Dimension(80, 110));
        card.setBackground(Color.WHITE);
        card.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        JLabel label = new JLabel(c.toString());
        label.setText("<html><center>" + c.getValor() + "<br>de<br>" + c.getNaipe() + "</center></html>");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        if (c.getNaipe() == Naipe.COPAS || c.getNaipe() == Naipe.OUROS) {
            label.setForeground(Color.RED);
        }

        card.add(label);
        return card;
    }

    private JPanel criarCartaVerso() {
        JPanel card = new JPanel();
        card.setPreferredSize(new Dimension(80, 110));
        card.setBackground(new Color(139, 0, 0));
        card.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        return card;
    }

    public static void main(String[] args) {
        ConexaoFactory.inicializarBanco();

        SwingUtilities.invokeLater(() -> {
            new BlackJackGame().setVisible(true);
        });
    }
}