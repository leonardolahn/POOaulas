package br.pucrs.poo;

import java.util.ArrayList;

public class CadastroBagagens
{
    private ArrayList<Bagagem> bagagens = new ArrayList<>();

    public void add(Bagagem bagagem)
    {
        bagagens.add(bagagem);
    }

    public String listar()
    {
        double custoTotal = 0;
        StringBuilder aux = new StringBuilder("===Lista de Bagagens===");
        for (Bagagem b : bagagens)
        {
            double custo = b.calculaCusto();
            aux.append(b.toString()).append("\n")
               .append("Custo: ").append(custo).append("\n");
            custoTotal += custo;
        }
        aux.append("Custo total das bagagens: ").append(custoTotal);
        return aux.toString();
    }

    public double percentualBagagensDeMao()
    {
        int qtdBagagensDeMao = 0;
        for (Bagagem b : bagagens)
        {
            if (b instanceof BagagemDeMao)
            {
                qtdBagagensDeMao++;
            }
        }
        return qtdBagagensDeMao / bagagens.size();
    }

    public Bagagem pesquisar(String nome)
    {
        for (Bagagem b : bagagens)
        {
            if (b.getNome().equalsIgnoreCase(nome))
            {
                return b;
            }
        }
        return null;
    }
}
