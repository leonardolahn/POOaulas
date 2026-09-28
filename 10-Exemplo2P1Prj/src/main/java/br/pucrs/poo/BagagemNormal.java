package br.pucrs.poo;

public class BagagemNormal extends Bagagem
{
    private static int proximoNumero = 1000;
    private int numero;
    public BagagemNormal(String nome, double peso, Prioridade prioridade)
    {
        super(nome, peso, prioridade);
        if (nome == null)
        {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.numero = proximoNumero++;
    }

    public static int getProximoNumero()
    {
        return proximoNumero;
    }

    public int getNumero()
    {
        return numero;
    }

    @Override
    public double calculaCusto()
    {
        int custo = 0;
        if (getPeso() <= 20)
        {
            custo += 0;
        }
        if (getPeso() > 20)
        {
            custo += 30 * (getPeso() - 20);
        }
        if (getPrioridade().equals(Prioridade.PRIORITARIA))
        {
            custo += 200;
        }
        return custo;
    }

    @Override
    public String toString()
    {
        StringBuilder aux = new StringBuilder();
        aux.append(super.toString()).append("\n")
           .append("Número da bagagem: ").append(getNumero()).append("\n")
           .append("Custo: ").append(calculaCusto()).append("\n");
        return aux.toString();
    }
}

