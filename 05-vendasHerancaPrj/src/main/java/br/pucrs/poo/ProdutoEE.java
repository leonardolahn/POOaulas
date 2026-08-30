package br.pucrs.poo;

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

    @Override
    public String toString()
    {
        return super.toString() + "\nDias de Garantia: " + diasGarantia;
    }
}
