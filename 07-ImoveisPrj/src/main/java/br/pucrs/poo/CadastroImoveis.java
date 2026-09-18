package br.pucrs.poo;

import java.util.ArrayList;

public class CadastroImoveis
{
    private ArrayList<Imovel> lista;

    public CadastroImoveis()
    {
        lista = new ArrayList<>();
    }

    public void add(Imovel elem)
    {
        lista.add(elem);
    }

    public String listar()
    {
        StringBuilder aux = new StringBuilder("===Lista de Imóveis===\n\n");
        double totalImpostos = 0;
        for (Imovel imovel : lista)
        {
            double imposto = imovel.calculaImposto();
            aux.append(imovel.toString());
            aux.append("\nImposto: ");
            aux.append(imposto);
            aux.append("\n\n");
            totalImpostos += imposto;
        }
        aux.append("Total de impostos a ser cobrado: ");
        aux.append(totalImpostos);
        return aux.toString();
    }

    public String listar(String nome)
    {
        StringBuilder aux = new StringBuilder("===Dados do imóvel===\n\n");
        for (Imovel imovel : lista)
        {
            if (imovel.getProprietario().equalsIgnoreCase(nome))
            {
                System.out.println(imovel.toString());
            }
        }
        return aux.toString();
    }
}
