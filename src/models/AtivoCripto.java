import java.math.BigDecimal;

public class AtivoCripto {
    private Long idAtivo;
    private String nomeMoeda;
    private String simbolo;
    private BigDecimal precoAtual;

    public void atualizarPreco(BigDecimal novoPreco) {
        this.precoAtual = novoPreco;
    }

}