package br.pucrs.poo;

import java.util.ArrayList;

public class CadastroFuncionarios {
    private ArrayList<Funcionario> funcionarios;

    private static CadastroFuncionarios instance;

    public static CadastroFuncionarios getInstance() {
        if (instance == null) {
            instance = new CadastroFuncionarios();
        }
        return instance;
    }

    private CadastroFuncionarios() {
        funcionarios = new ArrayList<>();
        carregaFuncionarios();
    }

    public void cadastraFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public Funcionario recuperaPorMatricula(String matricula) {
        for (Funcionario func : funcionarios) {
            if (func.getMatricula().equals(matricula)) {
                return func;
            }
        }
        return null;
    }

    public String RelatorioFuncionarios() {
        StringBuilder rel = new StringBuilder("\nCadastro Funcionarios\n");
        for (Funcionario func : funcionarios) {
            rel.append(func.toString());
            rel.append("\n");
        }
        return rel.toString();
    }

    private void carregaFuncionarios() {
        funcionarios.add(new Funcionario("1001", "Huguinho Pato", 1890.0));
        funcionarios.add(new Funcionario("1002", "Zezinho Pato", 3720.0));
        funcionarios.add(new Funcionario("1003", "Luizinho Pato", 8940.0));
        funcionarios.add(new Funcionario("1004", "Lala Pata", 4220.0));
        funcionarios.add(new Funcionario("1005", "Lele Pata", 1283.0));
        funcionarios.add(new Funcionario("1007", "Lili Pata", 12438.0));
        funcionarios.add(new FuncionarioRisco("1008", "Bob Esponja", 10000.0, CategoriasRisco.RISCO_BAIXO));
        funcionarios.add(new FuncionarioRisco("1009", "Patrick", 10000.0, CategoriasRisco.RISCO_ALTO));
        funcionarios.add(new FuncionarioRisco("1010", "Lula Molusco", 10000.0, CategoriasRisco.SEM_RISCO));
        funcionarios.add(new Pesquisador("1111", "Daniel", 10000.0, 1));
        funcionarios.add(new Pesquisador("1112", "João", 10000.0, 2));
        funcionarios.add(new Pesquisador("1113", "Leonardo", 10000.0, 3));

    }
}
