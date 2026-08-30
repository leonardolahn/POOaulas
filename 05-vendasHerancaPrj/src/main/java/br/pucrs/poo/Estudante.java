package br.pucrs.poo;

public class Estudante extends ClientePF {
   private String instituicao;

  public Estudante(int umCodigo, String umNome, String umCPF, String nomeInst) {
    super(umCodigo, umNome, umCPF);
    this.instituicao = nomeInst;
  }


  public String getInstituicao() { return instituicao; }

  @Override
  public String toString() {
    return super.toString() + "(" + instituicao + ")";
  }


  
}
