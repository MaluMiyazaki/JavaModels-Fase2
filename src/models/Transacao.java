import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transacao {
    private Long idTransacao;
    private Long idEmpresa;
    private Long idAtivo;
    private String tipoTransacao;
    private BigDecimal quantidade;
    private BigDecimal valorunitarioNoMomento;
    private LocalDateTime dataHora;

    public Transacao() {}

    public Transacao(Long idTransacao, Long idEmpresa, Long idAtivo, String tipoTransacao, BigDecimal quantidade, BigDecimal valorunitarioNoMomento) {
        this.idTransacao = idTransacao;
        this.idEmpresa = idEmpresa;
        this.idAtivo = idAtivo;
        this.tipoTransacao = tipoTransacao;
        this.quantidade = quantidade;
        this.valorunitarioNoMomento = valorunitarioNoMomento;
        this.dataHora = LocalDateTime.now();
    }

    public void executarTransacao() {
        
    }
}