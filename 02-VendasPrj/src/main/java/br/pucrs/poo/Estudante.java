package br.pucrs.poo;
public class Estudante extends ClientePF
{
    private String instituicao;

    public Estudante(int umCodigo, String umNome, String umCpf, String nomeInst)
    {
        super(umCodigo, umNome, umCpf);
        this.instituicao = nomeInst;
    }

    
}