package br.pucrs.poo;

public class App
{
    public static void main(String[] args)
    {
        CadastroImoveis cad = new CadastroImoveis();
        Geo geo1 = new Geo(200, 400);
        Geo geo2 = new Geo(800, 100);
        Imovel imovel1 = new Residencial("Leonardo", 500, geo1, 700);
        Imovel imovel2 = new Comercial("Walter White", 100, geo2);
        cad.add(imovel1);
        cad.add(imovel2);

        Imovel.setVR(57);

        System.out.println(cad.listar());
        System.out.println(cad.listar("Leonardo"));
        System.out.println(cad.listar("Walter White"));
    }
}
