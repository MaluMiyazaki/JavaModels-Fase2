public class Usuario {
    private Long idUsuario;
    private String nome;
    private String email;
    private String senhaCriptografada;
    private boolean is2FAAtivo;

    public Usuario() {}

    public Usuario(Long idUsuario, String nome, String email, String senhaCriptografada) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.senhaCriptografada = senhaCriptografada;
    }

    public boolean login(String email, String senha) {
        return true;
    }

    public void ativar2FA() {
        this.is2FAAtivo = true;
    }
}