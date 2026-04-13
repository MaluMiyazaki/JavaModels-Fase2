import java.math.BigDecimal;

public class Dashboard {
    private Long idUsuario;
    private BigDecimal saldoTotalGeral;
    private BigDecimal lucroPrejuizoTotal;

    public Dashboard() {}

    public Dashboard(Long idUsuario, BigDecimal saldoTotalGeral, BigDecimal lucroPrejuizoTotal) {
        this.idUsuario = idUsuario;
        this.saldoTotalGeral = saldoTotalGeral;
        this.lucroPrejuizoTotal = lucroPrejuizoTotal;
    }

    public BigDecimal calcularTotalConsolidado() {
        return saldoTotalGeral;
    }

    public void gerarGraficoDesempenho() {
        
    }

    // --- Getters e Setters ---
    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

    public BigDecimal getSaldoTotalGeral() { return saldoTotalGeral; }
    public void setSaldoTotalGeral(BigDecimal saldoTotalGeral) { this.saldoTotalGeral = saldoTotalGeral; }

    public BigDecimal getLucroPrejuizoTotal() { return lucroPrejuizoTotal; }
    public void setLucroPrejuizoTotal(BigDecimal lucroPrejuizoTotal) { this.lucroPrejuizoTotal = lucroPrejuizoTotal; }
}