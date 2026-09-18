package br.pucrs.poo;

import java.util.Comparator;

public class ComparadorPorData implements Comparator<Pagamento>
{
    @Override
    public int compare(Pagamento p1, Pagamento p2)
    {
        return p1.getData().compareTo(p2.getData());
    }
}
