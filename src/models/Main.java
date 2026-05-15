import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== SISTEMA VOLTZ - MISSÃO TIO PATINHAS ===");
        System.out.println("Deseja inserir dados manualmente? (S/N)");
        String opcao = leitor.nextLine();

        if (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) {
            executarComInputs(leitor);
        } else {
            executarTesteAutomatico();
        }

        System.out.println("\nSistema VOLTZ finalizado com sucesso.");
        leitor.close(); // Fecha o scanner apenas no fim de tudo
    }

    private static void executarComInputs(Scanner leitor) {
        // --- TESTE DE USUÁRIO ---
        try {
            System.out.println("\n--- Cadastro de Usuário ---");
            System.out.print("ID: ");
            Long id = Long.parseLong(leitor.nextLine());
            System.out.print("Nome: ");
            String nome = leitor.nextLine();
            System.out.print("Email: ");
            String email = leitor.nextLine();
            System.out.print("Senha: ");
            String senha = leitor.nextLine();
            System.out.print("Ativar 2FA? (true/false): ");
            boolean mfa = Boolean.parseBoolean(leitor.nextLine());

            Usuario usuario = new Usuario(id, nome, email, senha, mfa);
            System.out.println("Usuário criado: " + usuario.getNome() + " | Status: " + usuario.statusDaConta());
        } catch (Exception e) {
            System.err.println("Erro ao criar usuário: Dados inválidos. Usando padrão.");
        }

        // --- TESTE DE EMPRESA E POLIMORFISMO ESTÁTICO ---
        try {
            System.out.println("\n--- Cadastro de Empresa ---");
            System.out.print("Nome da Empresa: ");
            String nomeEmp = leitor.nextLine();
            System.out.print("Saldo Inicial: ");
            BigDecimal saldo = new BigDecimal(leitor.nextLine());

            Empresa empresa = new Empresa(1L, nomeEmp, "Razao Social Ltda", "00.000.000/0001-00", saldo);

            // Testando Polimorfismo Estático (Overload)
            System.out.print("Valor para depósito (BigDecimal): ");
            empresa.depositarFiduciario(new BigDecimal(leitor.nextLine()));

            System.out.print("Valor para depósito (int): ");
            empresa.depositarFiduciario(Integer.parseInt(leitor.nextLine()));

            System.out.println("Saldo final da " + empresa.getNomeEmpresa() + ": R$ " + empresa.getSaldoFiduciario());
        } catch (Exception e) {
            System.err.println("Erro na operação da Empresa: " + e.getMessage());
        }

        // --- TESTE DE ATIVO E TRANSAÇÃO ---
        try {
            System.out.println("\n--- Registro de Transação ---");
            AtivoCripto btc = new AtivoCripto(1L, "Bitcoin", "BTC", new BigDecimal("350000.00"));

            System.out.print("Quantidade para compra: ");
            BigDecimal qtd = new BigDecimal(leitor.nextLine());

            Transacao t = new Transacao(100L, 1L, 1L, "COMPRA", qtd, btc.getPrecoAtual());
            System.out.println("Transação realizada em: " + t.getDataHora());
        } catch (Exception e) {
            System.err.println("Erro ao processar transação.");
        }
    }

    private static void executarTesteAutomatico() {
        System.out.println("\n--- Executando Testes Automatizados ---");

        try {
            // Polimorfismo Dinâmico (Override)
            Usuario uNormal = new Usuario(1L, "João", "joao@email.com", "123", false);
            UsuarioVip uVip = new UsuarioVip(2L, "Maria VIP", "maria@vip.com", "456", true, true);

            System.out.println("User 1: " + uNormal.statusDaConta());
            System.out.println("User 2: " + uVip.statusDaConta());

            // Instanciando outros objetos obrigatórios
            Dashboard dash = new Dashboard(100L, 1L, new BigDecimal("10000.00"), new BigDecimal("500.00"));
            Carteira cart = new Carteira(1L, 1L, 1L, new BigDecimal("0.5"), new BigDecimal("175000.00"));

            System.out.println("Teste de Dashboard e Carteira concluído.");
        } catch (Exception e) {
            System.err.println("Erro nos testes automáticos.");
        }
    }
}