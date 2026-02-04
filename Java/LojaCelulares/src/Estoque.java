import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Peca> listaPecas;
    private List<Aparelho> listaAparelhos;

    public Estoque() {
        this.listaPecas = new ArrayList<>();
        this.listaAparelhos = new ArrayList<>();
    }

    public List<Peca> getListaPecas() {
        return listaPecas;
    }

    public void adicionarPeca(Peca peca){
        listaPecas.add(peca);
        System.out.println("Peça " + peca.getNome() + " (Qtd: " + peca.getQuantEstoque() + ") adicionada ao estoque.");

    }

    public void removerPeca(Peca peca){
        if(listaPecas.remove(peca)){
            System.out.println("Peça " + peca.getNome() + " removida do estoque. ");
        }
        else{
            System.out.println("Peça não encontrada. ");
        }
    }

    public void entradaAparelho(Aparelho aparelho) {
        listaAparelhos.add(aparelho);
        System.out.println("Aparelho de modelo " + aparelho.getModelo() + " adicionado ao estoque. ");

    }

    public void saidaAparelho(Aparelho aparelho){
        if(listaAparelhos.remove(aparelho)){
            System.out.println("Aparelho " + aparelho.getModelo() + " removido do estoque. ");
        }
        else{
            System.out.println("Aparelho não encontrado. ");
        }
    }

}

