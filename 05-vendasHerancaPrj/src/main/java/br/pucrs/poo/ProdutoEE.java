package br.pucrs.poo;
import java.time.LocalDate;

public class ProdutoEE extends Produto
{
    private int diasGarantia;

    public ProdutoEE(int umCodigo, String umNome, double umPreco, int diasGarantia)
    {
        super(umCodigo, umNome, umPreco);
        this.diasGarantia = diasGarantia;
    }

    public int getDiasGarantia()
    {
        return diasGarantia;
    }

    public String getGarantia()
    {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataVencimento = dataAtual.plusDays(diasGarantia);
        return String.format("Nome do Produto: %s%nDias de Garantia: %d%nData Atual: %s%nData de Vencimento: %s%n",
                             super.getNome(), diasGarantia, dataAtual, dataVencimento);
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nDias de Garantia: " + diasGarantia;
    }
}
