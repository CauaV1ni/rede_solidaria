import java.time.LocalDate;

public class DoacaoAlimento extends Doacao {
    private String descricao;
    private double quantidade;
    private LocalDate dataValidade;
    private boolean perecivel;

    public DoacaoAlimento(String codigo, Doador doador, String descricao, double quantidade, LocalDate dataValidade, boolean perecivel) {
        super(codigo, doador, LocalDate.now());
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
        this.perecivel = perecivel;
    }

    @Override
    public int calcularPrioridade() {
      
        return perecivel ? 10 : 5;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: Alimento | Descrição: " + descricao + " | Quantidade: " + quantidade + " | Validade: " + dataValidade);
    }
 } 
    
