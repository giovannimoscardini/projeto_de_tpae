package principal;

/**
 * Classe que representa um lutador da categoria Pena.
 * Esta classe é uma extensão da classe abstrata Lutador.
 */
public class Pena extends Lutador {

    /**
     * Construtor da classe Pena.
     *
     * @param nome          Nome do lutador.
     * @param categoria     Categoria do lutador.
     * @param peso          Peso do lutador.
     * @param apelido       Apelido do lutador.
     * @param nacionalidade Nacionalidade do lutador.
     * @param golpe         Força do golpe do lutador.
     * @param defesa        Capacidade de defesa do lutador.
     * @param pontuacao     Pontuação do lutador.
     * @param numVitorias   Número de vitórias do lutador.
     * @param numDerrotas   Número de derrotas do lutador.
     */
    public Pena(String nome, String categoria, Double peso, String apelido, String nacionalidade, int golpe, int defesa,
                int pontuacao, int numVitorias, int numDerrotas) {
        super(nome, categoria, peso, apelido, nacionalidade, golpe, defesa, pontuacao, numVitorias, numDerrotas);
        // TODO Auto-generated constructor stub
    }
}
