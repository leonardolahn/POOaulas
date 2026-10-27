package br.pucrs.poo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Um perfil da rede social.
 *
 * Exercício 1 — "Quem não me segue de volta?"
 * Siga o roteiro da lista: cada método abaixo está marcado com o passo
 * em que deve ser implementado. Os corpos atuais são apenas provisórios,
 * para que o projeto compile desde o início.
 */
public class Perfil implements Comparable<Perfil> {

    private final String handle; // ex.: "@ana" — único na rede
    private final String nome;
    private final Set<Perfil> seguindo = new HashSet<>();
    private final Set<Perfil> seguidores = new HashSet<>();

    public Perfil(String handle, String nome) {
        this.handle = handle;
        this.nome = nome;
    }

    public String getHandle() {
        return handle;
    }

    public String getNome() {
        return nome;
    }

    // ------------------------------------------------------------------
    // Passo 1 — equals, hashCode e toString
    // ------------------------------------------------------------------
    // Rode o App ANTES de implementar estes métodos e observe o tamanho
    // do conjunto de teste. Depois, descomente e complete-os.
    //
    // ATENÇÃO: use SOMENTE o handle. Nunca use os conjuntos seguindo/seguidores
    // aqui (StackOverflowError!).

    @Override
    public boolean equals(Object o) {
        // TODO (Passo 1)
        // verifica se ambos os ponteiros apontam para o mesmo objeto na memória
        if (this == o) {
            return true;
        }
        // verifica se o objeto é nulo ou não é da classe perfil
        if (!(o instanceof Perfil)) {
            return false;
        }
        // transforma 'Object o' para o tipo 'Perfil', permitindo acessar 'handle'
        Perfil outro = (Perfil) o;
        // verifica se o handle é igual ao outro.handle
        return handle.equals(outro.handle);
    }

    @Override
    public int hashCode() {
        // TODO (Passo 1)
        // retorna o código numérico (hash) do handle
        // o HashSet usa o hash pra saber em qual bucket guardar ou buscar o perfil
        // no bucket, como handle usa equals, o java compara cada elemento pra garantir
        // que perfis iguais fiquem no mesmo bucket
        return handle.hashCode();
    }

    @Override
    public String toString() {
        // TODO (Passo 1): devolva o handle
        return handle;
    }

    // ------------------------------------------------------------------
    // Passo 2 — seguir e deixar de seguir
    // ------------------------------------------------------------------

    /**
     * Faz este perfil seguir o outro, atualizando os DOIS lados da relação.
     *
     * @return true se a relação foi criada; false se já existia
     *         ou se o perfil tentou seguir a si mesmo.
     */
    public boolean seguir(Perfil outro) {
        // TODO (Passo 2): use o retorno de seguindo.add(...)
        // impede que um perfil siga a si próprio
        if (this.equals(outro)) {
            return false;
        }
        // tenta adicionar 'outro' em 'seguindo' (se for novo retorna true)
        boolean novo = seguindo.add(outro);
        // se a adição aconteceu
        if (novo) {
            // adiciona o perfil atual 'this' na lista de seguidores de 'outro'
            outro.seguidores.add(this);
        }
        // retorna true se era nova a conexão e false se já existia
        return novo;
    }

    /**
     * Desfaz a relação, atualizando os DOIS lados.
     *
     * @return true somente se a relação existia.
     */
    public boolean deixarDeSeguir(Perfil outro) {
        // tenta remover 'outro' do conjunto 'seguindo' (retorna true se o elemento
        // existia)
        boolean remover = seguindo.remove(outro);
        // se a remoção de fato aconteceu no conjunto 'seguindo'
        if (remover) {
            // remove o perfil atual 'this' dos seguidores do 'outro'
            outro.seguidores.remove(this);
        }
        // retorna true se a relação existia e foi desfeita, ou false caso contrário
        return remover;
    }

    // ------------------------------------------------------------------
    // Passo 3 — proteja os conjuntos internos
    // ------------------------------------------------------------------

    public Set<Perfil> getSeguindo() {
        // TODO (Passo 3): devolva uma visão somente leitura ou uma cópia
        // retorna uma visão somente leitura (não modificável) do conjunto 'seguindo',
        // impedindo alterações externas.
        return Collections.unmodifiableSet(seguindo);
    }

    public Set<Perfil> getSeguidores() {
        // TODO (Passo 3): devolva uma visão somente leitura ou uma cópia
        // retorna uma visão somente leitura (não modificável) do conjunto 'seguidores',
        // impedindo alterações externas.
        return Collections.unmodifiableSet(seguidores);
    }

    // ------------------------------------------------------------------
    // Passo 4 — as três perguntas clássicas
    // Todos devolvem um NOVO conjunto: copie antes de usar
    // retainAll/removeAll!
    // ------------------------------------------------------------------

    /** Quem eu sigo e também me segue (seguindo ∩ seguidores). */
    public Set<Perfil> mutuos() {
        // TODO (Passo 4)
        // Cria um novo conjunto de todos os que eu sigo (para a nova comparação)
        Set<Perfil> r = new TreeSet<>(seguindo);
        // Faz um interseção de todos que eu sigo e que estão me seguindo de volta.
        r.retainAll(seguidores);
        // Retorna o conjunto depois desse teste
        return r;
    }

    /** Quem eu sigo e não me segue (seguindo − seguidores). */
    public Set<Perfil> naoMeSegueDeVolta() {
        // Cria um novo conjunto de todos os que eu sigo (para a nova comparação)
        Set<Perfil> r = new TreeSet<>(seguindo);
        // Remove todos (diferença) os que eu sigo e que não me seguem de volta.
        r.removeAll(seguidores);
        // Retorna o conjunto depois desse teste
        return r;
    }

    /** Quem me segue e eu não sigo (seguidores − seguindo). */
    public Set<Perfil> fas() {
        // TODO (Passo 4)
        // Cria um novo conjunto de todos os que me seguem
        Set<Perfil> r = new TreeSet<>(seguidores);
        // Remove todos (diferença) os que me seguem mas eu não sigo de volta
        r.removeAll(seguindo);
        // Retorna o conjunto depois desse teste
        return r;
    }

    // ------------------------------------------------------------------
    // Passo 5 — seguidos em comum
    // ------------------------------------------------------------------

    /** Perfis seguidos tanto por este perfil quanto pelo outro. */
    public Set<Perfil> seguidosEmComum(Perfil outro) {
        // Cria um novo conjunto de todos os que eu sigo (para a nova comparação)
        Set<Perfil> r = new HashSet<>(seguindo);
        // Faz a interseção de quem eu e a outra pessoa segue simultaneamente
        r.retainAll(outro.seguindo);
        // Retorna o conjunto após o teste
        return r;
    }

    // ------------------------------------------------------------------
    // Passo 6 — sugestões para seguir
    // ------------------------------------------------------------------

    /** Pessoas seguidas por quem eu sigo, menos eu mesmo e quem já sigo. */
    public Set<Perfil> sugestoes() {
        // TODO (Passo 6): união -> remover a si mesmo -> remover quem já sigo
        // Cria um novo conjunto de todos os que eu sigo
        Set<Perfil> r = new TreeSet<>(seguindo);
        // Percorre todos os perfis 'p' que eu estou seguindo
        for (Perfil p : seguindo)
        {
            // Faz uma união de todos os perfis que determinado perfil que eu sigo, segue
            r.addAll(p.seguindo);
        }
        // Remove eu mesmo desse conjunto
        r.remove(this);
        // Remove todos os que eu já sigo.
        r.removeAll(seguindo);
        // Retorna o conjunto
        return r;
    }

    // ------------------------------------------------------------------
    // Passo 7 — saída em ordem alfabética
    // ------------------------------------------------------------------
    // TODO (Passo 7): faça a classe implementar Comparable<Perfil>,
    // escreva o compareTo (comparando handles) e troque, nos métodos dos
    // Passos 4 a 6, "new HashSet<>" por "new TreeSet<>".
    //
    // public int compareTo(Perfil outro) { ... }

    @Override
    public int compareTo(Perfil outro)
    {
        return handle.compareTo(outro.handle);
    }
}
