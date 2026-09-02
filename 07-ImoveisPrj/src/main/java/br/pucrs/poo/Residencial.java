package br.pucrs.poo;

public class Residencial extends Imovel
{
    private int areaTerreno;

    public Residencial(String prop, int area, Geo geo, int areaTerreno)
    {
        super(prop, area, geo);
        this.areaTerreno = areaTerreno;
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
        if (areaTerreno > 1000)
        {
            imposto += (getVR() * 100);
        }
        return imposto;
    }

    @Override
    public String toString()
    {
        String temImposto;
        if (areaTerreno > 1000)
        {
            temImposto = "Sim";
        }
        else
        {
            temImposto = "Não";
        }
        return String.format(
            "Informações do Imóvel: %s\n" +
            "Há imposto na área do terreno? %s",
            super.toString(),
            temImposto
        );
    }
}
