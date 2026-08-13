package br.pucrs.poo;

public class ItemVenda
{
    private Produto prod;
    private int quantidade;

    public ItemVenda(int umaQtd, Produto umProd)
    {
        this.quantidade = umaQtd;
        this.prod = umProd;
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
