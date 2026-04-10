public class Usuario {
    private Long idUsuario;
    private String nome;
    private String email;
    private String senhaCriptografada;
    private boolean is2FAAtivo;

    public boolean login(String email, String senha) {
        return true;
    }

    public void ativar2FA() {
        this.is2FAAtivo = true;
    }
}