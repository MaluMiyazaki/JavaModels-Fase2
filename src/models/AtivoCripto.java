import java.math.BigDecimal;

public class AtivoCripto {
    private Long idAtivo;
    private String nomeMoeda;
    private String simbolo;
    private BigDecimal precoAtual;

    public AtivoCripto() {}

    public AtivoCripto(Long idAtivo, String nomeMoeda, String simbolo, BigDecimal precoAtual) {
        this.idAtivo = idAtivo;
        this.nomeMoeda = nomeMoeda;
        this.simbolo = simbolo;
        this.precoAtual = precoAtual;
    }

    public BigDecimal atualizarPreco(BigDecimal novoPreco) {
        return novoPreco;
    }

}