package br.pucrs.poo;

public abstract class Pagamento
{
    private double valor;

    public Pagamento(double umValor)
    {
        this.valor = umValor;
    }

    public double getValor()
    {
        return valor;
    }
    public abstract boolean processar();

    @Override
    public String toString()
    {
        return "Valor: " + valor;
    }
}
