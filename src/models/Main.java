import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String adicionarDados;
        int valorSaldo = 0;
        Long idDoUsuario;
        String nomeDoUsuario;
        String emailDoUsuario;
        String senhaDoUsuario;
        String autenticacaoDe2FA;
        boolean auth2FAis;
        System.out.println("Deseja adicionar os dados ou apenas verificar se o programa roda?");
        System.out.print("Digite sim para adicionar dados ou não/enter para apenas compilar e verificar: ");
        adicionarDados = leitor.nextLine();
        if (adicionarDados.equalsIgnoreCase("sim") || adicionarDados.equalsIgnoreCase("s") || adicionarDados.equalsIgnoreCase("si")) {
            // Teste de Usuario
            try {
                System.out.print("Digite o ID do Usuario: ");
                idDoUsuario = leitor.nextLong();
            } catch (Exception e) {
                System.out.println("Seu ID de Usuario era invalido");
                idDoUsuario = 1L;
            }
            try {
                System.out.print("Digie o nome de Usuario: ");
                nomeDoUsuario = leitor.next();
            } catch (Exception e) {
                System.out.println("Seu nome de Usuario era invalido");
                nomeDoUsuario = "Erro";
            }
            try {
                System.out.print("Digite o email: ");
                emailDoUsuario = leitor.next();
            } catch (Exception e) {
                System.out.println("Email invalido");
                emailDoUsuario = "generico@email.com";
            }
            try {
                System.out.print("Digite sua senha: ");
                senhaDoUsuario = leitor.next();
            } catch (Exception e) {
                System.out.println("Senha invalida");
                senhaDoUsuario = "senhaGenerica123";
            }
            try {
                System.out.print("O autenticador de 2 fatores esta ativo?: ");
                autenticacaoDe2FA = leitor.nextLine();
                if (autenticacaoDe2FA.equals("true") || autenticacaoDe2FA.equals("s") || autenticacaoDe2FA.equals("sim")) {
                    auth2FAis = true;
                } else {
                    auth2FAis = false;
                }
            } catch (Exception e) {
                System.out.println("O valor deve ser true ou false");
                auth2FAis = false;
            }

//        Usuario usuario = new Usuario(1L, "Antônio Carvalho", "tiope@patinhas.com", "senha123", false);
            Usuario usuario = new Usuario(idDoUsuario, nomeDoUsuario, emailDoUsuario, senhaDoUsuario, auth2FAis);
            System.out.println(usuario.getIdUsuario());
            System.out.println(usuario.getNome());
            System.out.println(usuario.getEmail());
            System.out.println(usuario.getSenhaCriptografada());
            System.out.println(usuario.isIs2FAAtivo());
            // Teste de Ativo Cripto
            AtivoCripto ativoCripto = new AtivoCripto(1L, "Bitcoin", "BTC", new BigDecimal("350000.00"));

            // Teste de Dashboard
            Dashboard dash = new Dashboard(1L, new BigDecimal("5000000.00"), new BigDecimal("150000.00"));

            // Teste de Carteira
            Carteira carteira = new Carteira(1L, 1L, 1L, new BigDecimal("5.00"), new BigDecimal("1750000.00"));

            // Teste de Empresa
            Empresa empresa = new Empresa(1L, "AgroTech", "Patinhas Agro LTDA", "89013170000114", new BigDecimal("100000.00"));
            System.out.println("A empresa " + empresa.getNomeEmpresa() + " esta com saldo fiduciario de " + empresa.getSaldoFiduciario());
            empresa.depositarFiduciario(new BigDecimal("50000"));
            System.out.println("Novo saldo fiduciario de " + empresa.getSaldoFiduciario());
            empresa.depositarFiduciario(50000);
            System.out.println("Novo saldo fiduciario de " + empresa.getSaldoFiduciario());
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
            System.out.println("Novo saldo fiduciario de " + empresa.getSaldoFiduciario());



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
        } else {
            //Teste de usuario
            Usuario usuario = new Usuario(1L, "Antônio Carvalho", "tiope@patinhas.com", "senha123", false);

            // Teste de Ativo Cripto
            AtivoCripto ativoCripto = new AtivoCripto(1L, "Bitcoin", "BTC", new BigDecimal("350000.00"));

            // Teste de Dashboard
            Dashboard dash = new Dashboard(1L, new BigDecimal("5000000.00"), new BigDecimal("150000.00"));

            // Teste de Carteira
            Carteira carteira = new Carteira(1L, 1L, 1L, new BigDecimal("5.00"), new BigDecimal("1750000.00"));

            // Teste de Empresa
            Empresa empresa = new Empresa(1L, "AgroTech", "Patinhas Agro LTDA", "89013170000114", new BigDecimal("100000.00"));
            System.out.println("A empresa " + empresa.getNomeEmpresa() + " esta com saldo fiduciario de " + empresa.getSaldoFiduciario());
            empresa.depositarFiduciario(new BigDecimal("50000"));
            System.out.println("Novo saldo fiduciario de " + empresa.getSaldoFiduciario());
            empresa.depositarFiduciario(50000);
            System.out.println("Novo saldo fiduciario de " + empresa.getSaldoFiduciario());

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

        }




        System.out.println("Sistema VOLTZ compilado com sucesso.");
    }
}