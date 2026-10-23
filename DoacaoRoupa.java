import java.time.LocalDate;

public class DoacaoRoupa extends Doacao {
    private String tipoRoupa;
    private String tamanho;
    private int quantidadePecas;
    private String estadoConservacao;

    public DoacaoRoupa(String codigo, Doador doador, String tipoRoupa, String tamanho, int quantidadePecas, String estadoConservacao) {
        super(codigo, doador, LocalDate.now());
        this.tipoRoupa = tipoRoupa;
        this.tamanho = tamanho;
        this.quantidadePecas = quantidadePecas;
        this.estadoConservacao = estadoConservacao;
    }

    public int calcularPrioridade() {
        return 3;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: Roupa | Peça: " + tipoRoupa + " | Tam: " + tamanho + " | Qtd: " + quantidadePecas + " | Estado: " + estadoConservacao);
    }
}