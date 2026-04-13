import java.math.BigDecimal;

public class Empresa {
    private Long idEmpresa;
    private String nomeEmpresa;
    private String razaoSocial;
    private String cnpj;
    private BigDecimal saldoFiduciario;

    public Empresa() {}

    public Empresa(Long idEmpresa, String nomeEmpresa, String razaoSocial, String cnpj, BigDecimal saldoFiduciario) {
        this.idEmpresa = idEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.saldoFiduciario = saldoFiduciario;
    }

    public void depositaarFiduciario (BigDecimal valor) {
        this.saldoFiduciario = this.saldoFiduciario.add(valor);
    }

    public BigDecimal consultarSaldo() {
        return saldoFiduciario;
    }
}