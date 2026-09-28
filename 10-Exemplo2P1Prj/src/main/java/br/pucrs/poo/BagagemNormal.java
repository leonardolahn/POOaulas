package br.pucrs.poo;

public class BagagemNormal extends Bagagem
{
    // contador iniciando em 1000
    private static int proximoNumero = 1000;
    // guarda o número fixo daquela bagaem específica
    private int numero;

    public BagagemNormal(String nome, double peso,
        Prioridade prioridade)
    {
        super(nome, peso, prioridade);
        if (nome == null)
        {
            throw new IllegalArgumentException("Nome inválido.");
        }
        // atribui a ESTA bagagem o valor ATUAL de proximoNumero (ex: 1000),
        // e só DEPOIS incrementa o contador static (vira 1001) para a próxima bagagem
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
        double custo = 0;
        // primeiros 20kg são gratuitos
        if (getPeso() <= 20)
        {
            custo += 0;
        }
        // é pago um adicional de R$ 30,00 por quilograma excedente
        if (getPeso() > 20)
        {
            custo += 30 * (getPeso() - 20);
        }
        // Bagagens “PRIORITÁRIAS” pagam uma taxa extra de R$ 200,00
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
            .append("Custo: ").append(calculaCusto());
        return aux.toString();
    }
}

