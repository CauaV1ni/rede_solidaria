import java.time.LocalDate;

public class Doacao {
    private String codigo;
    private Doador doador;
    private Beneficiario beneficiario;
    private LocalDate dataCadastro;
    private StatusDoacao status;

    
    public Doacao(String codigo, Doador doador, LocalDate dataCadastro) {
        this.codigo = codigo;
        this.doador = doador;
        this.dataCadastro = dataCadastro;
        this.status = StatusDoacao.DISPONIVEL; 
    }

    
    public String getCodigo() { return codigo; }
    
    public Doador getDoador() { return doador; }
    
    public Beneficiario getBeneficiario() { return beneficiario; }
    public boolean setBeneficiario(Beneficiario beneficiario) {
        if (this.status == StatusDoacao.DISPONIVEL) {
            this.beneficiario = beneficiario;
            this.status = StatusDoacao.RESERVADA;
            return true;
        }
        return false;
    }

    public LocalDate getDataCadastro() { return dataCadastro; }
    
    public StatusDoacao getStatus() { return status; }
    public void setStatus(StatusDoacao status) { this.status = status; }

    public int calcularPrioridade() {
        return 1; 
    }

    public void exibirDados() {
        System.out.println("Doação");
        System.out.println("Código: " + codigo + " | Status: " + status + " | Data: " + dataCadastro);
        if (doador != null) System.out.println("Doador: " + doador.getNome());
        if (beneficiario != null) System.out.println("Beneficiário: " + beneficiario.getNome());
    }
}