import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // Teste de Usuario
        Usuario usuario = new Usuario(1L, "Antônio Carvalho", "tiope@patinhas.com", "senha123");

        // Teste de Ativo Cripto
        AtivoCripto ativoCripto = new AtivoCripto(1L, "Bitcoin", "BTC", new BigDecimal("350000.00"));

        // Teste de Dashboard
        Dashboard dash = new Dashboard(1L, new BigDecimal("5000000.00"), new BigDecimal("150000.00"));

        // Teste de Carteira
        Carteira carteira = new Carteira(1L, 1L, 1L, new BigDecimal("5.00"), new BigDecimal("1750000.00"));

        // Teste de Empresa
        Empresa empresa = new Empresa(1L, "AgroTech", "Patinhas Agro LTDA", "89013170000114", new BigDecimal("100000.00"));

        // Teste de Transação
        Transacao transacao = new Transacao(1L, 1L, 1L, "COMPRA", new BigDecimal("2.5"), new BigDecimal("350000.00"));
        
        System.out.println("Sistema VOLTZ compilado com sucesso.");
    }
}