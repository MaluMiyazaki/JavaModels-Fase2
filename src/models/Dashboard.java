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
}