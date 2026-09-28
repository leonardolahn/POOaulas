package br.pucrs.poo;

public class App
{
    public static void main(String[] args)
    {
        CadastroBagagens cadastro = new CadastroBagagens();
        BagagemNormal b1 = new BagagemNormal("Leonardo", 27, Prioridade.NORMAL);
        BagagemDeMao b2 = new BagagemDeMao("Isa", 30, Prioridade.PRIORITARIA);
        BagagemFragil b3 = new BagagemFragil("Chico", 10, Prioridade.NORMAL);
        try
        {
            BagagemNormal invalida = new BagagemNormal(null, 12, Prioridade.PRIORITARIA);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Exceção encontrada: " + e.getMessage());
        }

        cadastro.add(b1);
        cadastro.add(b2);
        cadastro.add(b3);

        System.out.println(cadastro.listar());
        System.out.println(cadastro.percentualBagagensDeMao());
        System.out.println(cadastro.pesquisar("Leonardo"));
    }
}
