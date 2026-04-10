import java.math.BigDecimal;

public class Carteira {
    private Long idCarteira;
    private Long idEmpresa;
    private Long idAtivo;
    private BigDecimal quantidade; 
    private BigDecimal saldoTotalAtualizado;

    public BigDecimal calcularValorTotal(BigDecimal precoAtual) {
        return quantidade.multiply(precoAtual);
    }

    public void atualizarQuantidade(BigDecimal novaQuantidade) {
        this.quantidade = novaQuantidade;
    }
}