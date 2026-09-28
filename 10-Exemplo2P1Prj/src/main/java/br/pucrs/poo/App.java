package br.pucrs.poo;

public class App
{
    public static void main(String[] args)
    {
        CadastroBagagens cadastro = new CadastroBagagens();

        BagagemNormal b1 = new BagagemNormal("Leonardo", 20, Prioridade.NORMAL);
        BagagemDeMao b2 = new BagagemDeMao("Jorge", 23, Prioridade.PRIORITARIA);
        BagagemFragil b3 = new BagagemFragil("João", 10, Prioridade.NORMAL);

        try
        {
            BagagemDeMao invalida = new BagagemDeMao(null, 24, Prioridade.NORMAL);
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
