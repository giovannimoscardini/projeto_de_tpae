package principal;

import java.util.Random;

/**
 * Representa uma Luta entre dois boxeadores em uma competição.
 * A Luta envolve ataques alternados entre os boxeadores até que um deles seja derrotado
 * por nocaute ou o tempo de Luta seja atingido.
 */
public class Luta {
    private Lutador competidores;
    private Lutador competidores2;
    public int quantRauds;

    /**
     * Cria uma instância de Luta com dois boxeadores e uma duração específica.
     *
     * @param competidores   O primeiro boxeador na Luta.
     * @param competidores2   O segundo boxeador na Luta.
     * @param quantRauds A duração máxima da Luta em segundos.
     */
    public Luta(Lutador competidores, Lutador competidores2) {
        this.competidores = competidores;
        this.competidores2 = competidores2;
    }
    
    /**
     * Realiza a Luta entre os dois boxeadores, determinando o vencedor com base em nocaute,
     * número de golpes ou Defesa Restante restante.
     *
     * @return O boxeador vencedor da Luta ou null em caso de empate.
     */
    public Lutador Lutar() {
        Random random = new Random();
        int numGolpesCompetidores = 0;
        int numGolpesCompetidores2 = 0;
   
        int defesaLutador1 = competidores.getDefesa();
        int defesaLutador2 = competidores2.getDefesa();


        while (defesaLutador1 > 0 && defesaLutador2 > 0) {
            // Defina aleatoriamente qual boxeador consegue aplicar um golpe no adversário.
            boolean competidoresAtaca = random.nextBoolean();
            //System.out.println("Tempo restante: " + (quantRauds - tempoAtual));
            if (competidoresAtaca) {
                // boxeador 1 ataca boxeador 2
                int dano = competidores.getGolpe();
                defesaLutador2 -= dano;
                numGolpesCompetidores++;
                if (defesaLutador2 <= 0) {
                    return competidores;
                }
            } else {
                // boxeador 2 ataca boxeador 1
                int dano = competidores2.getGolpe();
                defesaLutador1 -= dano;
                numGolpesCompetidores2++;

                if (defesaLutador1 <= 0) {
                    return competidores2;
                }
            }                            
        }
        
        if (numGolpesCompetidores > numGolpesCompetidores2) {
            System.out.println(" ");
            System.out.println(competidores.getNome() + " venceu por tempo (" + numGolpesCompetidores + " vs " + numGolpesCompetidores2 + ")");
            return competidores;
        } else if (numGolpesCompetidores2 > numGolpesCompetidores) {
            System.out.println(" ");
            System.out.println(competidores2.getNome() + " venceu por tempo (" + numGolpesCompetidores + " vs " + numGolpesCompetidores2 + ")");
            return competidores2;
        } else {
            // Em caso de empate no número de golpes, verifica a DefesaRestante restante.
            if (defesaLutador1 > defesaLutador2) {
                System.out.println(" ");
                System.out.println(competidores.getNome() + " venceu por tempo (empate de golpes, maior Defesa).");
                return competidores;
            } else if (defesaLutador2 > defesaLutador1) {
                System.out.println(" ");
                System.out.println(competidores2.getNome() + " venceu por tempo (empate de golpes, maior Defesa).");
                return competidores2;
            } else {
                System.out.println("A Luta terminou em empate por tempo (empate de golpes e Defesa).");
                return null;
            }
        }
    }
    
}

