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
        this.is2FAAtivo = false;
    }

    public boolean login(String email, String senha) {
        return true;
    }

    public void ativar2FA() {
        this.is2FAAtivo = true;
    }

    // --- Getters e Setters ---
    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenhaCriptografada() { return senhaCriptografada; }
    public void setSenhaCriptografada(String senhaCriptografada) { this.senhaCriptografada = senhaCriptografada; }

    public boolean isIs2FAAtivo() { return is2FAAtivo; }
    public void setIs2FAAtivo(boolean is2FAAtivo) { this.is2FAAtivo = is2FAAtivo; }
}