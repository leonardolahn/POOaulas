package br.pucrs.poo;

public class Comercial extends Imovel
{
    public Comercial(String prop, int area, Geo geo)
    {
        super(prop, area, geo);
    }

    @Override
    public double calculaImposto()
    {
        double imposto = 0;
        if (getAreaConstruida() > 200)
        {
            double aux = (getAreaConstruida() - 200);
            imposto += aux * getVR();
        }
        return imposto;
    }

    @Override
    public String toString()
    {
        return String.format(
            "Informações do Imóvel: %s",
            super.toString()
        );
    }
}
