public class Beneficiario extends Pessoa {
    private String codigoBeneficiario;
    private int quantidadePessoasFamilia;
    private double rendaFamiliar;

    public Beneficiario(String codigoBeneficiario, String nome, String cpf, String telefone, String endereco, int quantidadePessoasFamilia, double rendaFamiliar) {
        super(nome, cpf, telefone, endereco);
        this.codigoBeneficiario = codigoBeneficiario;
        this.quantidadePessoasFamilia = quantidadePessoasFamilia;
        this.rendaFamiliar = rendaFamiliar;
    }

    public String getCodigoBeneficiario() { return codigoBeneficiario; }
    public void setCodigoBeneficiario(String codigoBeneficiario) { this.codigoBeneficiario = codigoBeneficiario; }

    public int getQuantidadePessoasFamilia() { return quantidadePessoasFamilia; }
    public void setQuantidadePessoasFamilia(int quantidadePessoasFamilia) { this.quantidadePessoasFamilia = quantidadePessoasFamilia; }

    public double getRendaFamiliar() { return rendaFamiliar; }
    public void setRendaFamiliar(double rendaFamiliar) { this.rendaFamiliar = rendaFamiliar; }


    public boolean possuiPrioridadeSocial() {
        if (quantidadePessoasFamilia == 0) return false;
        return (rendaFamiliar / quantidadePessoasFamilia) < 600.0;
    }

    @Override
    public void exibirDados() {
        System.out.println("--- BENEFICIÁRIO ---");
        System.out.println("Código: " + codigoBeneficiario + " | Pessoas na Família: " + quantidadePessoasFamilia + " | Renda: R$ " + rendaFamiliar);
        super.exibirDados();
    }
}