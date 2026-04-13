import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Caso seja necessario usar o Scanner, descomentar a proxima linha.
        //Scanner sc = new Scanner(System.in);

        // Teste de Usuario
        Usuario usuario = new Usuario(1L, "bruno", "bruno@gmail.com", "senha123");

        //Teste de Ativo Cripto
        AtivoCripto ativoCripto = new AtivoCripto(1L, "Dolar", "USD", new BigDecimal("5"));

        // Teste de Dashboard
        Dashboard dash = new Dashboard(1L, new BigDecimal("500"), new BigDecimal("100"));

        // Teste de carteira
        Carteira carteira = new Carteira(1L, 1L, 1L, new BigDecimal("5.00"), new BigDecimal("500"));

        // Teste de Empresa
        Empresa empresa = new Empresa(1L, "AgroTech", "Fiap LTDA", "89013170000114", new BigDecimal("100"));

        // Teste de Transação
        Transacao transacao = new Transacao(1L, 1L, 1L, "tipo", new BigDecimal("10"), new BigDecimal("30"));

    }
}
