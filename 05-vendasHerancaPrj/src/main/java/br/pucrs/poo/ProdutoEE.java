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
        return String.format(
                "Dias de garantia- %d\n" +
                "Data atual- %s\n" +
                "Data de vencimento- %s",
                diasGarantia,
                dataAtual,
                dataVencimento
        );
    }

    @Override
    public String toString()
    {
        return String.format("%s - Garantia %d dias", super.toString(), diasGarantia);
    }
}
