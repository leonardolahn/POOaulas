package br.pucrs.poo;
import java.util.ArrayList;

public class CadClientes
{
    private ArrayList<Cliente> lista;
    private CadClientes()
    {
        lista = new ArrayList<>();
    }

    private static CadClientes instance;

    public static CadClientes getInstance()
    {
        if (instance == null)
        {
            instance = new CadClientes();
        }
        return instance;
    }

    public void inserir(Cliente cli)
    {
        lista.add(cli);
    }

    public void inserir(String umNome, String umCpf)
    {
        Cliente novoCliente = new Cliente(umNome, umCpf);
        lista.add(novoCliente);
        lista.add(new Cliente(umNome, umCpf));
    }

    public Cliente pesquisar(String cpf)
    {
        for (Cliente cli : lista)
        {
            if (cli.getCpf().equalsIgnoreCase(cpf))
            {
                return cli;
            }
        }
        return null;
    }

    public String toString()
    {
        StringBuilder aux = new StringBuilder("\nCadastro de Clientes\n- - - - - - - - - -\n");
        for (Cliente umCliente : lista)
        {
            aux.append(umCliente.toString() + "\n");
        }
        return aux.toString();
    }
}
