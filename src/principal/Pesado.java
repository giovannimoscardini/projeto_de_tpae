package principal;

/**
 * Classe que representa um lutador da categoria Pesado.
 * Esta classe é uma extensão da classe abstrata Lutador.
 */
public class Pesado extends Lutador {

    /**
     * Construtor da classe Pesado.
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
    public Pesado(String nome, String categoria, Double peso, String apelido, String nacionalidade, int golpe,
                  int defesa, int pontuacao, int numVitorias, int numDerrotas) {
        super(nome, categoria, peso, apelido, nacionalidade, golpe, defesa, pontuacao, numVitorias, numDerrotas);
        // TODO Auto-generated constructor stub
    }

    /**
     * Categoria de peso do lutador.
     * Representa a classe de peso do lutador na categoria Pesado.
     */
    public int categoriaPeso;

}
