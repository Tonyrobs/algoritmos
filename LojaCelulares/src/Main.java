import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estoque estoque = new Estoque();

        List<Cliente> clientes = new ArrayList<>();
        List<OrdemServico> ordens = new ArrayList<>();

        int opcao = -1;

        LocalTime horario = LocalTime.now();
        if(horario.isBefore(LocalTime.of(06,00))){
            System.out.print("Boa madrugada, seja bem-vindo! ");
        } else if (horario.isBefore(LocalTime.of(12,00))){
            System.out.print("Bom dia, seja bem-vindo! ");
        } else if (horario.isBefore(LocalTime.of(19,00))) {
            System.out.print("Boa tarde, seja bem-vindo! ");
        } else{
            System.out.print("Boa noite, seja bem-vindo!");
        }
        System.out.println();

        while(opcao != 0){
            System.out.println("\n---Menu Principal--- ");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Editar cliente");
            System.out.println("3 - Excluir cliente");
            System.out.println("4 - Cadastrar aparelho");
            System.out.println("5 - Editar aparelho");
            System.out.println("6 - Registrar ordem de serviço");
            System.out.println("7 - Adicionar peça em ordem de serviço");
            System.out.println("8 - Calcular valor total da OS");
            System.out.println("9 - Registrar pagamento");
            System.out.println("10 - Finalizar OS");
            System.out.println("11 - Cancelar OS");
            System.out.println("12 - Consultar OS");
            System.out.println("13 - Listar peças no estoque");
            System.out.println("14 - Adicionar peça no estoque");
            System.out.println("15 - Remover peça do estoque");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    Cliente novoCliente = Cliente.cadastrarCliente(sc);
                    clientes.add(novoCliente);
                    System.out.println("Cliente " + novoCliente.getNome() + " cadastrado com sucesso!");
                if (clientes.isEmpty()) { System.out.println("Nenhum cliente cadastrado.");

                }
                    break;
                case 2:

                    if (clientes.isEmpty()) { System.out.println("Nenhum cliente cadastrado.");
                        break;
                    }
                    System.out.print("Digite o CPF do cliente para editar: ");
                    String cpfBuscaEdit = sc.nextLine();

                    Cliente clienteEdit = null;
                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpfBuscaEdit)) {
                            clienteEdit = c;
                            break;
                        }
                    }

                    if (clienteEdit != null) {
                        clienteEdit.editarCliente(sc);
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 3:
                    if (clientes.isEmpty()){
                        System.out.println("Nenhum cliente cadastrado.");
                        break;
                    }
                    System.out.print("Digite o CPF do cliente para exclusão: ");
                    String cpfBuscaExcluir = sc.nextLine();

                    Cliente clienteExcluir = null;
                    for(Cliente c : clientes){
                        if (c.getCpf().equals(cpfBuscaExcluir)){
                            clienteExcluir = c;
                            break;
                        }
                    }
                    if(clienteExcluir != null){
                        clienteExcluir.removeCliente(clientes);
                    } else{
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 4:
                    if (clientes.isEmpty()) {
                        System.out.println("Cadastre primeiro um cliente!");
                        break;
                    }
                    System.out.print("Digite o CPF do cliente para vincular o aparelho: ");
                    String cpfBuscaAparelho = sc.nextLine();

                    Cliente clienteAparelho = null;
                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpfBuscaAparelho)) {
                            clienteAparelho = c;
                            break;
                        }
                    }

                    if (clienteAparelho != null) {
                        Aparelho novoAparelho = Aparelho.cadastrarAparelho(sc);
                        clienteAparelho.adicionarAparelho(novoAparelho);
                        estoque.entradaAparelho(novoAparelho);
                        System.out.println("Aparelho " + novoAparelho.getModelo() + " cadastrado para " + clienteAparelho.getNome());
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 5:
                    if (clientes.isEmpty()) { System.out.println("Nenhum cliente cadastrado."); break; }
                    System.out.print("Digite o CPF do cliente que possui o aparelho a ser editado: ");
                    String cpfBuscaAparelhoEdit = sc.nextLine();

                    Cliente clienteAparelhoEdit = null;
                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpfBuscaAparelhoEdit)) {
                            clienteAparelhoEdit = c;
                            break;
                        }
                    }

                    if (clienteAparelhoEdit == null || clienteAparelhoEdit.getAparelhos().isEmpty()) {
                        System.out.println("Cliente não encontrado ou não possui aparelhos.");
                    } else {

                        System.out.println("\nAparelhos de " + clienteAparelhoEdit.getNome() + ":");
                        int i = 0;
                        for (Aparelho a : clienteAparelhoEdit.getAparelhos()) {
                            System.out.println(i + " - " + a.getModelo() + " (IMEI: " + a.getImei() + ")");
                            i++;
                        }
                        System.out.print("Selecione o número do aparelho para editar: ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Seleção inválida."); sc.nextLine();
                            break;
                        }
                        int indiceAparelhoEdit = sc.nextInt();
                        sc.nextLine();

                        if (indiceAparelhoEdit >= 0 && indiceAparelhoEdit < clienteAparelhoEdit.getAparelhos().size()) {
                            Aparelho aparelhoEdit = clienteAparelhoEdit.getAparelhos().get(indiceAparelhoEdit);
                            aparelhoEdit.editarAparelho(sc);
                            System.out.println("Aparelho de modelo " + aparelhoEdit.getModelo() + " editado com sucesso.");
                        } else {
                            System.out.println("Seleção de aparelho inválida.");
                        }
                    }
                    break;
                case 6:
                    if (clientes.isEmpty()) { System.out.println("Cadastre primeiro um cliente!"); break; }

                    System.out.print("Digite o CPF do cliente para a OS: ");
                    String cpfBuscaOS = sc.nextLine();
                    Cliente clienteOS = null;
                    for (Cliente c : clientes) {
                        if (c.getCpf().equals(cpfBuscaOS)) {
                            clienteOS = c;
                            break;
                        }
                    }

                    if (clienteOS == null || clienteOS.getAparelhos().isEmpty()) {
                        System.out.println("Cliente não encontrado ou sem aparelhos cadastrados.");
                    } else {
                        System.out.println("\nAparelhos de " + clienteOS.getNome() + ":");
                        int i = 0;
                        for (Aparelho a : clienteOS.getAparelhos()) {
                            System.out.println(i + " - " + a.getModelo() + " (IMEI: " + a.getImei() + ")");
                            i++;
                        }
                        System.out.print("Selecione o número do aparelho: ");
                        if (!sc.hasNextInt()) { System.out.println("Seleção inválida."); sc.nextLine(); break; }
                        int indiceAparelho = sc.nextInt();
                        sc.nextLine();

                        if (indiceAparelho >= 0 && indiceAparelho < clienteOS.getAparelhos().size()) {
                            Aparelho aparelhoSelecionado = clienteOS.getAparelhos().get(indiceAparelho);
                            OrdemServico novaOS = OrdemServico.registrarOrdemServico(sc, aparelhoSelecionado, clienteOS);
                            ordens.add(novaOS);
                            System.out.println("OS criada! Número: " + novaOS.getNumeroOS());
                        } else {
                            System.out.println("Seleção de aparelho inválida.");
                        }
                    }
                    break;

                case 7:
                    System.out.print("OS: ");
                    int numOSAddPeca = sc.nextInt();
                    sc.nextLine();

                    OrdemServico osAddPeca = null;
                    for (OrdemServico os : ordens) {
                        if (os.getNumeroOS() == numOSAddPeca) {
                            osAddPeca = os;
                            break;
                        }
                    }

                    if (osAddPeca == null) {
                        System.out.println("OS não encontrada.");
                        break;
                    }

                    System.out.print("Peça: ");
                    String nomePecaOS = sc.nextLine();

                    System.out.print("Qtd: ");
                    int quantidadeOS = sc.nextInt();
                    sc.nextLine();

                    Peca pecaNoEstoque = null;
                    for (Peca p : estoque.getListaPecas()) {
                        if (p.getNome().equalsIgnoreCase(nomePecaOS)) {
                            pecaNoEstoque = p;
                            break;
                        }
                    }

                    if (pecaNoEstoque != null && pecaNoEstoque.getQuantEstoque() >= quantidadeOS) {

                        Peca pecaConsumida = new Peca(nomePecaOS, quantidadeOS, pecaNoEstoque.getPreco());
                        osAddPeca.adicionarPeca(pecaConsumida);

                        osAddPeca.calcularValorTotal();
                        System.out.println("Peça adicionada. Total: R$ " + String.format("%.2f", osAddPeca.getValorTotal()));

                    } else {
                        System.out.println("ERRO: Peça indisponível.");
                    }
                    break;

                case 8:
                    System.out.print("Informe o número da OS para calcular o valor: ");
                    if (!sc.hasNextInt()) { System.out.println("Entrada inválida."); sc.nextLine(); break; }
                    int numOSCalc = sc.nextInt();
                    sc.nextLine();

                    OrdemServico osCalc = null;
                    for (OrdemServico os : ordens) {
                        if (os.getNumeroOS() == numOSCalc) {
                            osCalc = os;
                            break;
                        }
                    }

                    if (osCalc != null) {
                        double valor = osCalc.calcularValorTotal();
                        System.out.println("O valor total da OS #" + osCalc.getNumeroOS() + " é: R$ " + String.format("%.2f", valor));
                    } else {
                        System.out.println("OS não encontrada.");
                    }
                    break;

                case 9:
                    System.out.print("Informe o número da OS para pagamento: ");
                    if (!sc.hasNextInt()) { System.out.println("Entrada inválida."); sc.nextLine(); break; }
                    int numOSPag = sc.nextInt();
                    sc.nextLine();

                    OrdemServico osPag = null;
                    for (OrdemServico os : ordens) {
                        if (os.getNumeroOS() == numOSPag) {
                            osPag = os;
                            break;
                        }
                    }

                    if (osPag != null) {
                        if (osPag.getValorTotal() <= 0) {
                            System.out.println("OS de valor zero. Pagamento não necessário.");
                            break;
                        }

                        Pagamento pagamento = new Pagamento(0, "Temp", osPag); // Objeto Pagamento temporário
                        pagamento.registrarPagamento(sc, osPag.getValorTotal());
                        osPag.registrarPagamento(pagamento);
                        System.out.println("Pagamento de R$ " + String.format("%.2f", osPag.getValorTotal()) + " registrado.");
                    } else {
                        System.out.println("OS não encontrada.");
                    }
                    break;

                case 10:
                    System.out.print("Informe o número da OS para finalizar: ");
                    if (!sc.hasNextInt()) { System.out.println("Entrada inválida."); sc.nextLine(); break; }
                    int numOSFinalizar = sc.nextInt();
                    sc.nextLine();

                    OrdemServico osFinalizar = null;
                    for (OrdemServico os : ordens) {
                        if (os.getNumeroOS() == numOSFinalizar) {
                            osFinalizar = os;
                            break;
                        }
                    }

                    if (osFinalizar != null) {
                        if (osFinalizar.getValorTotal() > 0 && !osFinalizar.getStatus().equals("Paga")) {
                            System.out.println("Erro: O valor total é R$ " + String.format("%.2f", osFinalizar.getValorTotal()) + ", mas a OS não está paga.");
                        } else {
                            osFinalizar.finalizarOS();
                            estoque.saidaAparelho(osFinalizar.getAparelho());
                            System.out.println("OS #" + osFinalizar.getNumeroOS() + " finalizada e aparelho entregue.");
                            LocalDateTime dataHoraAtual = LocalDateTime.now();
                            Mensagem mensagem = new Mensagem("Seu reparo está pronto!", dataHoraAtual);
                            mensagem.enviarMensagem();
                        }
                    } else {
                        System.out.println("OS não encontrada.");
                    }
                    break;

                case 11:
                    System.out.print("Informe o número da OS para cancelar: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Entrada inválida."); sc.nextLine(); break;
                    }
                    int numOSCancelar = sc.nextInt();
                    sc.nextLine();

                    OrdemServico osCancelar = null;
                    for (OrdemServico os : ordens) {
                        if (os.getNumeroOS() == numOSCancelar) {
                            osCancelar = os;
                            break;
                        }
                    }

                    if (osCancelar != null) {
                        osCancelar.cancelarOS();
                        System.out.println("OS #" + osCancelar.getNumeroOS() + " cancelada");
                    } else {
                        System.out.println("OS não encontrada.");
                    }
                    break;

                case 12:
                    System.out.print("Informe o número da OS para consultar: ");
                    if (!sc.hasNextInt()) { System.out.println("Entrada inválida."); sc.nextLine();
                        break;
                    }
                    int numOSConsultar = sc.nextInt();
                    sc.nextLine();

                    OrdemServico osConsultar = null;
                    for (OrdemServico os : ordens) {
                        if (os.getNumeroOS() == numOSConsultar) {
                            osConsultar = os;
                            break;
                        }
                    }

                    if (osConsultar != null) {
                        osConsultar.exibirDetalhes();
                    } else {
                        System.out.println("OS não encontrada.");
                    }
                    break;

                case 13:
                    System.out.println("\nPeças no Estoque");
                    if (estoque.getListaPecas().isEmpty()) {
                        System.out.println("O estoque de peças está vazio.");
                    } else {
                        for (Peca p : estoque.getListaPecas()) {
                            System.out.println("Nome: " + p.getNome() + " ; Quantidade: " + p.getQuantEstoque() +
                                    " ; Preço: R$ " + String.format("%.2f", p.getPreco()));
                        }
                    }
                    break;

                case 14:
                    System.out.print("Nome da peça: ");
                    String nomePeca = sc.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    Peca novaPeca = new Peca(nomePeca, quantidade, preco);
                    estoque.adicionarPeca(novaPeca);
                    break;

                case 15:
                    if (estoque.getListaPecas().isEmpty()) {
                        System.out.println("Não há peças no estoque para remover.");
                        break;
                    }

                    System.out.println("\nPeças disponíveis:");
                    int i = 0;
                    for (Peca p : estoque.getListaPecas()) {
                        System.out.println(i + " - " + p.getNome() + " (Qtd: " + p.getQuantEstoque() + ")");
                        i++;
                    }
                    System.out.print("Selecione o número da peça para remover: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Seleção inválida."); sc.nextLine(); break;
                    }
                    int indicePeca = sc.nextInt();
                    sc.nextLine();

                    if (indicePeca >= 0 && indicePeca < estoque.getListaPecas().size()) {
                        Peca pecaRemover = estoque.getListaPecas().get(indicePeca);
                        estoque.removerPeca(pecaRemover);
                    } else {
                        System.out.println("Seleção inválida.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}