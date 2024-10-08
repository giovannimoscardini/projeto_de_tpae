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
     */
    public Pesado(String nome, String categoria, String apelido, String nacionalidade, Double peso, int golpe, int defesa) {
        super(nome, categoria, apelido, nacionalidade, peso, golpe, defesa);
    }
}
