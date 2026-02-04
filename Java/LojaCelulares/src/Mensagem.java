import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensagem {
    private String conteudo;
    private LocalDateTime dataMensagem;

    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Mensagem(String conteudo, LocalDateTime dataMensagem) {
        this.conteudo = conteudo;
        this.dataMensagem = dataMensagem;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataMensagem() {
        return dataMensagem;
    }

    public void setDataMensagem(LocalDateTime dataMensagem) {
        this.dataMensagem = dataMensagem;
    }

    public void enviarMensagem(){
        String dataFormatada = dataMensagem.format(formatoData);
        System.out.println(conteudo);
        System.out.println("Enviando mensagem para o número do cliente, data: " + dataFormatada);
    }
}
