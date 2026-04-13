import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("== TESTE DE USUARIO ==");

        Usuario usuario = new Usuario(1L, "bruno", "bruno@gmail.com", "senha123");
        System.out.println("Usuario está logado: " + usuario.login("bruno@gmail.com", "senha123"));

        System.out.println("============================");

        System.out.println("== TESTE DE ATIVO CRIPTO ==");

        AtivoCripto ativoCripto = new AtivoCripto(1L, "Dolar", "USD", new BigDecimal("5.00"));
        System.out.println("Novo preço: " + ativoCripto.atualizarPreco(new BigDecimal("10.00")));

        System.out.println("============================");
//
//        System.out.println("== TESTE DE ATIVO CRIPTO ==");
//
//        System.out.println("============================");
//
//        System.out.println("== TESTE DE CARTEIRA ==");
//
//        System.out.println("============================");
//
//        System.out.println("== TESTE DE EMPRESA ==");
//
//        System.out.println("============================");
//
//        System.out.println("== TESTE DE TRANSAÇÃO==");
//
//        System.out.println("============================");
    }
}
