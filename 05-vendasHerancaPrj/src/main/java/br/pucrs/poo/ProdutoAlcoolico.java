package br.pucrs.poo;

public class ProdutoAlcoolico extends Produto
{
    //static significa que a variável pertence
    //à classe ProdutoAlcoolico como um todo, e não a cada objeto individual
    private static double impostoAlcool;

    public ProdutoAlcoolico(int umCodigo, String umNome, double umPreco)
    {
        super(umCodigo, umNome, umPreco);
    }

    @Override
    public double getPreco()
    {
        return super.getPreco() * (1 + impostoAlcool);
    }

    public static double getImpostoAlcool()
    {
        return impostoAlcool;
    }

    public static void setImpostoAlcool(double novoValor)
    {
        impostoAlcool = novoValor;
    }

    @Override
    public String toString()
    {
    return String.format(
            "%s\n" +
            "Preço base: R$ %.2f\n" +
            "Imposto sobre álcool: %.2f%%\n" +
            "Preço com imposto: R$ %.2f",
            super.toString(),
            super.getPreco(),
            impostoAlcool * 100,
            getPreco());
    }
}
