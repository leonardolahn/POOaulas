package br.pucrs.poo;

public class ItemVenda
{
    private Produto prod;
    private int quantidade;

    public ItemVenda(Produto umProd, int umaQtd)
    {
        this.prod = umProd;
        this.quantidade = umaQtd;
    }

    public double getValor()
    {
        return prod.getPreco() * quantidade;
    }

    @Override
    public String toString()
    {
        return String.format("Produto: %s%nQuantidade: %s", prod, quantidade);
    }
}
