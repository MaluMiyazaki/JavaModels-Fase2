import java.math.BigDecimal;

public class Empresa {
    private Long idEmpresa;
    private String nomeEmpresa;
    private String razaoSocial;
    private String cnpj;
    private BigDecimal saldoFiduciario;

    public void depositaarFiduciario (BigDecimal valor) {
        this.saldoFiduciario = this.saldoFiduciario.add(valor);
    }

    public BigDecimal consultarSaldo() {
        return saldoFiduciario;
    }
}