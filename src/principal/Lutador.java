package principal;

/**
 * Classe abstrata que representa um lutador.
 * Esta classe serve como base para a criação de diferentes tipos de lutadores.
 */
public abstract class Lutador {

    protected String nome;
    protected String categoria;
    protected Double peso;
    protected String apelido;
    protected String nacionalidade;
    protected int golpe;
    protected int defesa;
    private int pontuacao;
    private int numVitorias;
    private int numDerrotas;

    /**
     * Construtor da classe Lutador.
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
    public Lutador(String nome, String categoria, Double peso, String apelido, String nacionalidade, int golpe,
                   int defesa, int pontuacao, int numVitorias, int numDerrotas) {
        this.nome = nome;
        this.categoria = categoria;
        this.peso = peso;
        this.apelido = apelido;
        this.nacionalidade = nacionalidade;
        this.golpe = golpe;
        this.defesa = defesa;
        this.pontuacao = pontuacao;
        this.numVitorias = numVitorias;
        this.numDerrotas = numDerrotas;
    }

    /**
     * Obtém o nome do lutador.
     *
     * @return Nome do lutador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém a categoria do lutador.
     *
     * @return Categoria do lutador.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Obtém o peso do lutador.
     *
     * @return Peso do lutador.
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * Obtém o apelido do lutador.
     *
     * @return Apelido do lutador.
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * Obtém a força do golpe do lutador.
     *
     * @return Força do golpe do lutador.
     */
    public int getGolpe() {
        return golpe;
    }

    /**
     * Obtém a capacidade de defesa do lutador.
     *
     * @return Capacidade de defesa do lutador.
     */
    public int getDefesa() {
        return defesa;
    }

    /**
     * Define a nova capacidade de defesa do lutador após receber dano.
     *
     * @param dano Dano recebido pelo lutador.
     */
    public void setDefesa(int dano) {
        this.defesa -= dano;
        if (this.defesa < 0) {
            this.defesa = 0;
        }
    }

    /**
     * Obtém a pontuação do lutador.
     *
     * @return Pontuação do lutador.
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * Obtém o número de vitórias do lutador.
     *
     * @return Número de vitórias do lutador.
     */
    public int getNumVitorias() {
        return numVitorias;
    }

    /**
     * Obtém o número de derrotas do lutador.
     *
     * @return Número de derrotas do lutador.
     */
    public int getNumDerrotas() {
        return numDerrotas;
    }
}