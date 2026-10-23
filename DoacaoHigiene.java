import java.time.LocalDate;

public class DoacaoHigiene extends Doacao {
    private String descricao;
    private double quantidade;
    private boolean lacrado;

    public DoacaoHigiene(String codigo, Doador doador, double quantidade, boolean lacrado) {
        super(codigo, doador, LocalDate.now());
        this.descricao = "Produtos de Higiene";
        this.quantidade = quantidade;
        this.lacrado = lacrado;
    }

    @Override
    public int calcularPrioridade() {
        return lacrado ? 5 : 1;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: Higiene | Qtd: " + quantidade + " | Lacrado: " + lacrado);
    }
}
