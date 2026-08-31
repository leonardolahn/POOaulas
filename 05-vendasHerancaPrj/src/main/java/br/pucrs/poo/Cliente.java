package br.pucrs.poo;

public abstract class Cliente {
    private int codigo;
    private String nome;

    public Cliente(int umCodigo, String umNome) {
        this.codigo = umCodigo;
        this.nome = umNome;
    }

    public Cliente() {
        this.codigo = -1;
        this.nome = "Não informado";

    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public abstract String getID();

    @Override
    public String toString()
    {
        return String.format("(%d) \t %s", codigo, nome);
    }
}
