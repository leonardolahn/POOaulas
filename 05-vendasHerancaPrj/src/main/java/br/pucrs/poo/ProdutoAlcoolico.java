package br.pucrs.poo;

public class ProdutoAlcoolico extends Produto
{
    //static significa que a variável pertence
    //à classe ProdutoAlcoolico como um todo, e não a cada objeto individual
    private static double taxaTrago;

    public ProdutoAlcoolico(int umCodigo, String umNome, double umPreco)
    {
        super(umCodigo, umNome, umPreco);
    }

    @Override
    public double getPreco()
    {
        return super.getPreco() * (1 + taxaTrago);
    }

    @Override
    public void setPreco(double umPreco)
    {
        super.setPreco(umPreco / (1 + taxaTrago));
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nTaxa Trago: " + taxaTrago;
    }
}
