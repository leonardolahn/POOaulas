package br.pucrs.poo;

public class ItemVenda
{
    private Produto prod;
    private int quantidade;

    public ItemVenda(int umaQtde, Produto umProd)
    {
        this.quantidade = umaQtde;
        this.prod = umProd;
    }

    public double getValor()
    {
        return quantidade * prod.getPreco();
    }

    @Override
    public String toString()
    {
        return String.format("Produto: %s%nQuantidade: %d", quantidade, prod);
    }
}
