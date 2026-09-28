package br.pucrs.poo;

public class BagagemFragil extends Bagagem
{
    public BagagemFragil(String nome, double peso, Prioridade prioridade)
    {
        super(nome, peso, prioridade);
    }

    @Override
    public double calculaCusto()
    {
        return getPeso() * 5;
    }
}
