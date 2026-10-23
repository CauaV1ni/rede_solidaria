import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Doador doador = new Doador("D01", "Cauã", "061.045.855-82", "7999135-9178", "Rua A, 123");
        Beneficiario beneficiario = new Beneficiario("B01", "Fernando", "555.666.777-88", "98888-2222", "Rua B, 456", 4, 1200.00);

        DoacaoAlimento doacaoArroz = new DoacaoAlimento("A01", doador, "Saco de Arroz 1kg", 10.0, LocalDate.of(2026, 12, 31), false);

        
        doacaoArroz.setBeneficiario(beneficiario);

        
        doacaoArroz.exibirDados();
    }
}