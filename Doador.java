public class Doador extends Pessoa {
    private String codigoDoador;

    public Doador(String codigoDoador, String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf, telefone, endereco);
        this.codigoDoador = codigoDoador;
    }

    public String getCodigoDoador() { return codigoDoador; }
    public void setCodigoDoador(String codigoDoador) { this.codigoDoador = codigoDoador; }

    @Override
    public void exibirDados() {
        System.out.println("Doador");
        System.out.println("Código: " + codigoDoador);
        super.exibirDados();
    }
}