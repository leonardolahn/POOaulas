package br.pucrs.poo;
import java.util.ArrayList;

public class CadClientes
{
    // Atributo de INSTÂNCIA: cada objeto CadClientes teria sua própria lista
    // (mas como só existe UM objeto - Singleton - essa lista é, na prática, única no sistema)
    private ArrayList<Cliente> lista;

    // Construtor PRIVADO: impede que qualquer código de fora da classe
    // faça "new CadClientes()". Só a própria classe pode se auto-instanciar.
    private CadClientes()
    {
        lista = new ArrayList<>();
    }

    // Atributo de CLASSE (static): existe uma única cópia dessa variável,
    // compartilhada por todo o programa, não uma por objeto.
    // Guarda a única instância de CadClientes que vai existir (Singleton).
    private static CadClientes instance;

    // Método static: chamado direto pela classe (CadClientes.getInstance()),
    // sem precisar de um objeto já criado.
    public static CadClientes getInstance()
    {
        // Se ainda não existe nenhuma instância criada...
        if (instance == null)
        {
            // ...cria a única instância que vai existir durante todo o programa.
            // Só é permitido chamar "new" aqui porque estamos DENTRO da própria classe.
            instance = new CadClientes();
        }
        // Em qualquer chamada seguinte, instance já não é null,
        // então devolve sempre o MESMO objeto criado anteriormente.
        return instance;
    }

    // Sobrecarga 1: insere um Cliente que já foi criado em outro lugar
    public void inserir(Cliente cli)
    {
        lista.add(cli);
    }

    // Sobrecarga 2: recebe os dados soltos, cria o Cliente internamente
    // e insere na lista. Reaproveita a lógica de criação sem duplicar o cliente.
    public void inserir(String umNome, String umCpf)
    {
        lista.add(new Cliente(umNome, umCpf));
        // (removida a segunda linha "lista.add(new Cliente(umNome, umCpf))"
        // que existia no gabarito original — ela criava um SEGUNDO cliente
        // com os mesmos dados e duplicava o cadastro por engano)
    }

    // Percorre a lista procurando um cliente pelo CPF
    public Cliente pesquisar(String cpf)
    {
        for (Cliente cli : lista)
        {
            // equalsIgnoreCase compara o CONTEÚDO das strings (ignorando maiúsc/minúsc),
            // diferente de "==" que compararia se são o mesmo objeto na memória
            if (cli.getCpf().equalsIgnoreCase(cpf))
            {
                return cli; // encontrou: interrompe o loop e devolve o cliente
            }
        }
        return null; // percorreu tudo e não achou: sinaliza "não encontrado"
    }

    public String toString()
    {
        // StringBuilder: diferente de String (imutável), ele é MUTÁVEL —
        // permite ir "acrescentando" texto ao mesmo objeto, sem recriar
        // uma String nova a cada concatenação (mais eficiente em loops)
        StringBuilder aux = new StringBuilder("\nCadastro de Clientes\n- - - - - - - - - -\n");

        for (Cliente umCliente : lista)
        {
            // .append() adiciona texto ao final do StringBuilder existente
            aux.append(umCliente.toString() + "\n");
        }

        // Converte o StringBuilder final para uma String de verdade, para retornar
        return aux.toString();
    }
}
