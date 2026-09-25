package br.pucrs.poo;

public class App {

    public static void main(String[] args) {

        ClientePF cli1, cli2;
        ClientePF cli3, cli4;
        CadastroClientes cadastro1 = CadastroClientes.getInstance();
        try {
        cadastro1.inserir(new ClientePF(01, "Bob Esponja", "1111111111"));
        cadastro1.inserir(new ClientePF(02, "Lula Molusco", "12345678901"));
        cadastro1.inserir(new ClientePJ(03, "Mordecai", "394238429834"));
        cadastro1.inserir(new ClientePJ(03, "Rigby", "3942384291234"));
        } catch (Exception e)
        {
            System.out.println("Erro: " + e.getMessage());
        }

        Cliente pesquisa = cadastro1.pesquisar("1111111111");
        System.out.println(pesquisa);
        Cliente pesquisa2 = cadastro1.pesquisar("394238429834");
        System.out.println(pesquisa2);
        Cliente pesquisa3 = cadastro1.pesquisar("0000000");
        System.out.println(pesquisa3);

        ProdutoEE prod1 = new ProdutoEE(01, "Liquidificador", 200.99, 90);
        System.out.println(prod1.getGarantia());

        ProdutoAlcoolico.setImpostoAlcool(4);
        ProdutoAlcoolico prod2 = new ProdutoAlcoolico(02, "Cerveja", 12);
        System.out.println(prod2.getPreco());

    }
}
