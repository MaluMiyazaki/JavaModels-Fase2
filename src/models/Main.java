import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valorSaldo = 0;
        // Teste de Usuario
        Usuario usuario = new Usuario(1L, "Antônio Carvalho", "tiope@patinhas.com", "senha123", false);

        // Teste de Ativo Cripto
        AtivoCripto ativoCripto = new AtivoCripto(1L, "Bitcoin", "BTC", new BigDecimal("350000.00"));

        // Teste de Dashboard
        Dashboard dash = new Dashboard(1L, new BigDecimal("5000000.00"), new BigDecimal("150000.00"));

        // Teste de Carteira
        Carteira carteira = new Carteira(1L, 1L, 1L, new BigDecimal("5.00"), new BigDecimal("1750000.00"));

        // Teste de Empresa
        Empresa empresa = new Empresa(1L, "AgroTech", "Patinhas Agro LTDA", "89013170000114", new BigDecimal("100000.00"));
        System.out.println(empresa.getSaldoFiduciario());
        empresa.depositarFiduciario(new BigDecimal("50000"));
        System.out.println(empresa.getSaldoFiduciario());
        empresa.depositarFiduciario(50000);
        System.out.println(empresa.getSaldoFiduciario());
        System.out.print("Digite um novo valor para o SaldoFiduciario: ");
        try {
            valorSaldo = leitor.nextInt();
        } catch (Exception e) {
            System.out.println("Este não é um valor valido");
            System.out.println(e);
        } finally {
            leitor.close();
        }
        empresa.depositarFiduciario(valorSaldo);
        System.out.println(empresa.getSaldoFiduciario());



        // Teste de Transação
        Transacao transacao = new Transacao(1L, 1L, 1L, "COMPRA", new BigDecimal("2.5"), new BigDecimal("350000.00"));

        // Teste de UsuarioVip
        UsuarioVip usuariovip = new UsuarioVip();
        usuariovip.setIdUsuario(1L);
        usuariovip.setNome("Paulo Nunes");
        usuariovip.setEmail("em@em.com");
        usuariovip.setSenhaCriptografada("senha");
        usuariovip.setIs2FAAtivo(false);
        usuariovip.setStatus(true);
        System.out.println(usuariovip.getIdUsuario());
        System.out.println(usuariovip.getNome());
        System.out.println(usuariovip.getEmail());
        System.out.println(usuariovip.getSenhaCriptografada());
        System.out.println(usuariovip.getStatus());
        System.out.println("O usuario " + usuario.getNome() + " " + usuario.statusDaConta());
        System.out.println("O usuario " + usuariovip.getNome() + " " + usuariovip.statusDaConta());

        System.out.println("Sistema VOLTZ compilado com sucesso.");
    }
}