package br.pucrs.poo;
public class ClientePF extends Cliente
{
    private String cpf;
    
    public ClientePF(int umCodigo, String umNome, String umCpf)
    {
        super(umCodigo, umNome);
        this.cpf = umCPF;
    }

    public String getCpf()
    {
        return cpf;
    }

    @Override
    public String toString()
    {
        return super.getCodigo() + super.getNome() + super.getCpf();
    }
}