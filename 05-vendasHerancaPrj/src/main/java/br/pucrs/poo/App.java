package br.pucrs.poo;

public class App {

    public static void main(String[] args) {
        // teste de criação de clientes
        Cliente c1;
        c1 = new ClientePF(123, "Sr. Smith","3.3-3");
        Cliente c2 = new ClientePJ(321, "John Doe Inc", "1\001-1");
        //System.out.println();
        //System.out.println(c1.toString());
        //System.out.println("c2: " + c2.getCodigo() + " " + c2.getNome());
        //System.out.println();

        CadastroClientes cadCli = CadastroClientes.getInstance();
        cadCli.inserir(c1);
        cadCli.inserir(c2);

        Cliente cliPF = new ClientePF(200, "Sra. Smith", "1.1-1");

        cadCli.inserir(cliPF);
        cadCli.inserir( new Estudante(201, "Huguinho", "2.2-2", "PUCRS"));

       // System.out.println("pf nome: "+cliPF.getNome());
       // System.out.println("pf cpf: "+cliPF.getCPF());
       // System.out.println("pf tostr: "+cliPF.toString());
       // System.out.println();


        //CadastroClientes outroCad = CadastroClientes.getInstance();
        System.out.println(cadCli);

        CadastroProdutos cadProd = CadastroProdutos.getInstance();

        // teste de criação de clientes
        Produto p1 = new Produto(1, "caneta azul", 2);
        Produto p2 = new Produto(2, "borracha", 1.5);
        Produto p3 = new Produto(3, "lápis", 1);
        Produto p4 = new Produto(4, "Chocolate", 10);

        //System.out.println(p1.toString());
        //System.out.println(p4);

        cadProd.inserir(1, "caneta azul", 2);
        cadProd.inserir(2, "borracha", 1.5);
        cadProd.inserir(3, "lápis", 1);
        cadProd.inserir(4, "Chocolate", 10);

        System.out.println(cadProd.toString());

        // teste de criação de clientes não faz sentido criar itens venda sem vendas...
        // ItemVenda i1 = new ItemVenda(3, p4);
        // ItemVenda i2 = new ItemVenda(5, p1);

        // System.out.println();
        // System.out.println(i1);
        // System.out.println(i2);

        // testar a classe venda...
        // Cliente c1 = cadCli.pesquisar(123);
        // if (c1 = null)
        // System.out.println("cliente nao existe...");

        Venda v1 = new Venda(cadCli.pesquisar(321));
        // Venda v1 = new Venda( c1 );
        v1.inserir(p1);
        v1.inserir(10, p2);

        v1.inserir(cadProd.pesquisar(1));
        v1.inserir(10, cadProd.pesquisar(4));

        System.out.println();
        System.out.println(v1.getNotaFiscal());
        
        Venda v2 = new Venda(cadCli.pesquisar(201));

        v2.inserir(cadProd.pesquisar(2));
        v2.inserir(5, cadProd.pesquisar(3));

        System.out.println(v2.getNotaFiscal());

        Venda v3 = new Venda(cadCli.pesquisar(200));

        v3.inserir(cadProd.pesquisar(4));

        System.out.println(v3.getNotaFiscal());

        System.out.println("\n\nPróxima venda será a de número: " +
                Venda.getProxNF());

        // System.out.println("\n\n");

        // Venda v1 = new Venda(c1);

        // v1.inserir(p4);
        // // System.out.println( "valor (parcial) da venda v1: " +v1.valorTotal());
        // v1.inserir(7, p1);
        // // System.out.println( "valor (parcial) da venda v1: " +v1.valorTotal());

        // System.out.println("\n\n");
        // System.out.println(v1.getNotaFiscal());

    }
}
