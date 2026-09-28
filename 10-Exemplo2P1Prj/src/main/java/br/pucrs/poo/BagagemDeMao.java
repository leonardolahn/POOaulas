package br.pucrs.poo;

public class BagagemDeMao extends Bagagem
{
    public BagagemDeMao(String nome, double peso, Prioridade prioridade)
    {
        super(nome, peso, prioridade);
    }

    @Override
    public double calculaCusto()
    {
        return 0; 
    }
}
