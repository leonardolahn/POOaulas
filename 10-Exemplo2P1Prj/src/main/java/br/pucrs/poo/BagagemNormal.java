package br.pucrs.poo;

public class BagagemNormal extends Bagagem
{
    // Quando precisamos que um valor seja compartilhado por todas as instâncias da classe e
    // seja incrementado a cada novo objeto criado, usamos um atributo static
    // deve ser gerado um número de bagagem, sequencial, a cada nova bagagem criada (os números iniciam a partir do número 1000)
    private static int proximoNumero = 1000;
    private int numero;

    public BagagemNormal(String nome, double peso, Prioridade prioridade)
    {
        if (nome == null || nome.isEmpty())
        {
            throw new IllegalArgumentException("Nome inválido");
        }

        super(nome, peso, prioridade);
        this.numero = proximoNumero++;
    }

    public static int getProximoNumero()
    {
        return proximoNumero;
    }

    @Override
    public double calcularCusto()
    {
        int custo = 0;
        if (getPeso() <= 20)
        {
            custo += 0;
        }
        if (getPeso() > 20)
        {
            custo += (getPeso() - 20) * 30;
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

        aux.append("Proprietário: ").append(getNome())
          .append(", Número da Bagagem: ").append(this.numero)
          .append(", Custo: R$ ").append(calcularCusto());

        return aux.toString();
    }
}
