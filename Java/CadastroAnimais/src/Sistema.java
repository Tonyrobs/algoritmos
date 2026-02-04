import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Sistema extends JFrame {

    private List<Animal> listaAnimais;

    // Componentes Swing
    private JTextArea areaDisplay;
    private JComboBox<String> comboTipoAnimal;
    private JTextField campoNome;
    private JTextField campoIdade; // Novo campo para a idade
    private JButton botaoCadastrar;
    private JButton botaoListar;
    private JButton botaoSons;
    private JButton botaoSair;

    public Sistema() {
        super("Sistema de Cadastro de Pets com POO");
        listaAnimais = new ArrayList<>();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 600);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // --- Painel de Cadastro ---
        JPanel painelCadastro = new JPanel();
        painelCadastro.setBorder(BorderFactory.createTitledBorder("Cadastrar Novo Pet"));

        campoNome = new JTextField(15);
        campoIdade = new JTextField(5); // Inicializa o campo de idade
        String[] tipos = {"Cachorro", "Gato", "Papagaio", "Hamster", "Peixe", "Cavalo"};
        comboTipoAnimal = new JComboBox<>(tipos);
        botaoCadastrar = new JButton("Cadastrar Pet");

        painelCadastro.add(new JLabel("Nome:"));
        painelCadastro.add(campoNome);
        painelCadastro.add(new JLabel("Idade:")); // Adiciona o label de idade
        painelCadastro.add(campoIdade);         // Adiciona o campo de idade
        painelCadastro.add(new JLabel("Tipo:"));
        painelCadastro.add(comboTipoAnimal);
        painelCadastro.add(botaoCadastrar);

        // --- Área de Exibição ---
        areaDisplay = new JTextArea(18, 40);
        areaDisplay.setEditable(false);
        JScrollPane scrollDisplay = new JScrollPane(areaDisplay);

        // --- Painel de Ações e Botões ---
        botaoListar = new JButton("Ver Lista Completa");
        botaoSons = new JButton("Ouvir Sons (Polimorfismo)");
        botaoSair = new JButton("Encerrar Programa");

        JPanel painelBotoes = new JPanel();
        painelBotoes.add(botaoListar);
        painelBotoes.add(botaoSons);
        painelBotoes.add(botaoSair);

        add(painelCadastro);
        add(scrollDisplay);
        add(painelBotoes);

        // --- Listeners ---
        botaoCadastrar.addActionListener(e -> cadastrarAnimal());
        botaoListar.addActionListener(e -> listarAnimais());
        botaoSons.addActionListener(e -> verSons());
        botaoSair.addActionListener(e -> System.exit(0));

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void cadastrarAnimal() {
        String nome = campoNome.getText().trim();
        String tipo = (String) comboTipoAnimal.getSelectedItem();
        String idadeStr = campoIdade.getText().trim();

        if (nome.isEmpty() || idadeStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome e Idade são obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idade;
        try {
            idade = Integer.parseInt(idadeStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Idade deve ser um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Animal novoAnimal = null;

        // Instanciação da subclasse correta com 3 argumentos (nome, tipo, idade)
        switch (tipo) {
            case "Cachorro":
                novoAnimal = new Cachorro(nome, tipo, idade);
                break;
            case "Gato":
                novoAnimal = new Gato(nome, tipo, idade);
                break;
            case "Papagaio":
                novoAnimal = new Papagaio(nome, tipo, idade);
                break;
            case "Hamster":
                novoAnimal = new Hamster(nome, tipo, idade);
                break;
            case "Peixe":
                novoAnimal = new Peixe(nome, tipo, idade);
                break;
            case "Cavalo":
                novoAnimal = new Cavalo(nome, tipo, idade);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Tipo de animal desconhecido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
        }

        listaAnimais.add(novoAnimal);
        JOptionPane.showMessageDialog(this, tipo + " '" + nome + "' cadastrado com sucesso!");
        campoNome.setText("");
        campoIdade.setText("");
    }

    private void listarAnimais() {
        areaDisplay.setText("--- Lista de Animais Cadastrados ---\n");
        if (listaAnimais.isEmpty()) {
            areaDisplay.append("Nenhum animal cadastrado ainda.");
            return;
        }

        int contador = 1;
        for (Animal a : listaAnimais) {
            areaDisplay.append(contador++ + ". " + a.exibirInformacoes() + "\n");
        }
    }

    private void verSons() {
        areaDisplay.setText("--- Sons dos Animais (Polimorfismo Dinâmico) ---\n");
        if (listaAnimais.isEmpty()) {
            areaDisplay.append("Nenhum animal cadastrado para emitir sons.");
            return;
        }

        for (Animal a : listaAnimais) {
            areaDisplay.append("> " + a.exibirInformacoes(true) + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Sistema());
    }
}