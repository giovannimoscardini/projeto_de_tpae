package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Simulação Karatê Paris 2024 com diferentes categorias.
 * Esta classe gerencia a inicialização dos dados da competição, a realização de batalhas
 * em cada categoria e a determinação dos vencedores em cada etapa.
 */
public class Simulacao {
    /** Lista de lutadores na competição */
    List<Lutador> lutadores = new ArrayList<>();

    /** Lista de categorias de luta */
    List<String> categorias = new ArrayList<>();

    /** Scanner para leitura de entradas do usuário */
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Construtor que inicializa a simulação com lutadores e categorias padrão.
     */
    public Simulacao() {
        inicializaLutadores();
    }

    /**
     * Inicializa os lutadores e categorias padrão na simulação.
     * 
     * Adiciona lutadores reais que estão participando das Olimpíadas de Paris 2024
     * nas respectivas categorias com atributos como nome, categoria, apelido,
     * nacionalidade, peso, golpe e defesa.
     */
    private void inicializaLutadores() {
        categorias.add("PENA");
        categorias.add("MEDIO");
        categorias.add("PESADO");
        categorias.add("SUPERPESADO");

        // Categoria PENA
        lutadores.add(new Pena("Eldar Gasanov", "PENA", "O Combativo", "Azerbaijano", 59.0, 85, 78));
        lutadores.add(new Pena("Buse Naz Cakiroglu", "PENA", "A Veloz", "Turca", 58.0, 87, 80));
        lutadores.add(new Pena("Hifumi Abe", "PENA", "O Agil", "Japones", 60.0, 89, 82));
        lutadores.add(new Pena("Nina Dascalu", "PENA", "A Determinada", "Romena", 61.0, 84, 76));
        lutadores.add(new Pena("Erika Kasahara", "PENA", "A Fera", "Japones", 59.0, 86, 79));
        lutadores.add(new Pena("Jamal Abdurrahman", "PENA", "O Resiliente", "Jordaniano", 60.0, 83, 77));
        lutadores.add(new Pena("Jovana Prekovic", "PENA", "A Precisao", "Servia", 60.0, 88, 81));
        lutadores.add(new Pena("Fatih Keles", "PENA", "O Habilidoso", "Turco", 62.0, 90, 82));

        // Categoria MEDIO
        lutadores.add(new Medio("Shinya Abe", "MEDIO", "O Forte", "Japones", 72.0, 102, 90));
        lutadores.add(new Medio("Ryo Kiyuna", "MEDIO", "O Tecnico", "Japones", 75.0, 108, 92));
        lutadores.add(new Medio("Sandra Sanchez", "MEDIO", "A Tecnica", "Espanhola", 74.0, 104, 88));
        lutadores.add(new Medio("Aline Silva", "MEDIO", "A Estrategica", "Brasileira", 76.0, 110, 91));
        lutadores.add(new Medio("Ahmad Abouelfetouh", "MEDIO", "O Agil", "Egipcio", 74.0, 105, 87));
        lutadores.add(new Medio("Lucas Melo", "MEDIO", "O Focado", "Brasileiro", 75.0, 107, 89));
        lutadores.add(new Medio("Ivan Kostic", "MEDIO", "O Habil", "Servio", 76.0, 109, 90));
        lutadores.add(new Medio("Gonzalo Rodriguez", "MEDIO", "O Agitado", "Argentino", 77.0, 111, 92));

        // Categoria PESADO
        lutadores.add(new Pesado("Ferydoon Shahraki", "PESADO", "O Poderoso", "Iraniano", 98.0, 115, 95));
        lutadores.add(new Pesado("Wen Wen", "PESADO", "O Agil", "Chines", 100.0, 113, 92));
        lutadores.add(new Pesado("Cristhian Pino", "PESADO", "O Habilidoso", "Colombiano", 102.0, 118, 90));
        lutadores.add(new Pesado("Gokhan Saki", "PESADO", "O Forte", "Turco", 104.0, 120, 94));
        lutadores.add(new Pesado("Junya Watanabe", "PESADO", "O Determinado", "Japones", 100.0, 114, 93));
        lutadores.add(new Pesado("Luis Beltran", "PESADO", "O Feroz", "Mexicano", 103.0, 117, 91));
        lutadores.add(new Pesado("Aldo Silva", "PESADO", "O Rapido", "Brasileiro", 101.0, 116, 90));
        lutadores.add(new Pesado("Martin Valdes", "PESADO", "O Imbativel", "Argentino", 105.0, 119, 94));

        // Categoria SUPERPESADO
        lutadores.add(new Superpesado("Milad Beigi", "SUPERPESADO", "O Gigante", "Iraniano", 110.0, 130, 105));
        lutadores.add(new Superpesado("Zhao Lei", "SUPERPESADO", "O Forte", "Chines", 112.0, 132, 108));
        lutadores.add(new Superpesado("Carlos Bante", "SUPERPESADO", "O Imbativel", "Brasileiro", 115.0, 135, 110));
        lutadores.add(new Superpesado("Saeid Mollaei", "SUPERPESADO", "O Estrategista", "Iraniano", 113.0, 133, 109));
        lutadores.add(new Superpesado("Arthur Correia", "SUPERPESADO", "O Resistente", "Brasileiro", 117.0, 138, 112));
        lutadores.add(new Superpesado("Egor Olegovich", "SUPERPESADO", "O Poderoso", "Russo", 118.0, 140, 115));
        lutadores.add(new Superpesado("Tomohiro Matsumoto", "SUPERPESADO", "O Feroz", "Japones", 116.0, 137, 114));
        lutadores.add(new Superpesado("Pablo Ruiz", "SUPERPESADO", "O Veloz", "Espanhol", 119.0, 139, 116));
    }

    /**
     * Exibe informações dos lutadores em uma categoria específica.
     * 
     * @param categoria Categoria dos lutadores a serem exibidos. Se vazio, exibe todos os lutadores.
     */
    public void infoLutadores(String categoria) {
        System.out.println("\nInformações dos Lutadores:");
        for (Lutador lutador : lutadores) {
            if (categoria.isEmpty() || lutador.getCategoria().equals(categoria)) {
                System.out.printf("Nome: %s%nCategoria: %s%nApelido: %s%nNacionalidade: %s%nPeso: %.2f%nGolpe: %d%nDefesa: %d%n",
                        lutador.getNome(), lutador.getCategoria(), lutador.getApelido(),
                        lutador.getNacionalidade(), lutador.getPeso(), lutador.getGolpe(), lutador.getDefesa());
                System.out.println("-------------------------------");
            }
        }
    }

    /**
     * Adiciona um novo lutador à lista de lutadores.
     * 
     * @param scanner Scanner para leitura da entrada do usuário.
     */
    public void adicionarLutador(Scanner scanner) {
        System.out.println("Digite o nome do lutador:");
        String nome = scanner.nextLine();

        System.out.println("Digite a categoria do lutador (PENA, MEDIO, PESADO, SUPERPESADO):");
        String categoria = scanner.nextLine().toUpperCase();

        System.out.println("Digite o apelido do lutador:");
        String apelido = scanner.nextLine();

        System.out.println("Digite a nacionalidade do lutador:");
        String nacionalidade = scanner.nextLine();

        System.out.println("Digite o peso do lutador:");
        int peso = scanner.nextInt();

        System.out.println("Digite o golpe do lutador:");
        int golpe = scanner.nextInt();

        System.out.println("Digite a defesa do lutador:");
        int defesa = scanner.nextInt();
        scanner.nextLine(); // Consumir o newline após a leitura do número

        Lutador novoLutador;
        switch (categoria) {
            case "PENA" -> novoLutador = new Pena(nome, categoria, apelido, nacionalidade, peso, golpe, defesa);
            case "MEDIO" -> novoLutador = new Medio(nome, categoria, apelido, nacionalidade, peso, golpe, defesa);
            case "PESADO" -> novoLutador = new Pesado(nome, categoria, apelido, nacionalidade, peso, golpe, defesa);
            case "SUPERPESADO" -> novoLutador = new Superpesado(nome, categoria, apelido, nacionalidade, peso, golpe, defesa);
            default -> {
                System.out.println("Categoria inválida. Lutador não adicionado.");
                return;
            }
        }

        lutadores.add(novoLutador);
        System.out.println("Lutador adicionado com sucesso!");
    }

    /**
     * Retorna uma lista de lutadores que pertencem a uma categoria específica.
     * 
     * Este método percorre a lista de todos os lutadores e seleciona aqueles cuja categoria corresponde
     * à categoria fornecida. A lista resultante contém apenas os lutadores que atendem ao critério de
     * categoria especificado.
     * 
     * @param categoria a categoria dos lutadores a serem retornados. Deve ser uma string que representa
     *                  uma das categorias válidas.
     * @return uma lista de lutadores que pertencem à categoria especificada. Se nenhum lutador corresponder
     *         à categoria, será retornada uma lista vazia.
     */
    public List<Lutador> getLutadoresPorCategoria(String categoria) {
        List<Lutador> lutadoresCategoria = new ArrayList<>();
        for (Lutador lutador : lutadores) {
            if (lutador.getCategoria().equals(categoria)) {
                lutadoresCategoria.add(lutador);
            }
        }
        return lutadoresCategoria;
    }

     /**
     * Realiza a competição entre lutadores na categoria especificada e exibe o resultado das lutas.
     * 
     * @param categoria a categoria dos lutadores que participarão da competição.
     */
    public void competicao(String categoria) {
        System.out.println("\nIniciando competição na categoria " + categoria);
        List<Lutador> lutadoresCategoria = getLutadoresPorCategoria(categoria);
        
        if (lutadoresCategoria.size() < 8) {
            System.out.println("Não há lutadores suficientes na categoria " + categoria);
            return;
        }
        
        Collections.shuffle(lutadoresCategoria);
        
        List<Lutador> vencedores;
        if (lutadoresCategoria.size() > 8) {
            System.out.println("************ Oitavas de Finais ************");
            vencedores = roundsLuta(lutadoresCategoria, "Oitavas de Finais");
            System.out.println("************ Quartas de Finais ************");
            vencedores = roundsLuta(vencedores, "Quartas de Finais");
        } else {
            System.out.println("************ Quartas de Finais ************");
            vencedores = roundsLuta(lutadoresCategoria, "Quartas de Finais");
        }
        
        System.out.println("************ Semifinais ************");
        vencedores = roundsLuta(vencedores, "Semifinais");
        
        List<Lutador> semifinalistas = new ArrayList<>(vencedores); // Armazena os semifinalistas
        
        // Determina o 3º lugar
        System.out.println("************ 3º Lugar ************");
        List<Lutador> naoAvancaramParaFinal = new ArrayList<>(lutadoresCategoria);
        naoAvancaramParaFinal.removeAll(semifinalistas);
        List<Lutador> terceiro = roundsLuta(naoAvancaramParaFinal, "3º Lugar");
        
        // Adiciona o 3º lugar à lista de vencedores
        if (!terceiro.isEmpty()) {
            vencedores.add(terceiro.get(0));
        }
    
        // Exibe o pódio
        System.out.println("\nPódio da categoria " + categoria + ":");
        for (int i = 0; i < Math.min(3, vencedores.size()); i++) {
            String posicao = (i + 1) + "º lugar";
            String nome = vencedores.get(i).getNome();
            System.out.printf("%s: %s%n", posicao, nome);
        }
        
        // Adiciona um espaço e uma mensagem de prompt
        System.out.println("\nPressione Enter para voltar ao menu...");
        scanner.nextLine(); // Espera o usuário pressionar Enter
    }

    /**
     * Executa uma rodada de lutas entre os lutadores fornecidos e determina os vencedores.
     * 
     * Este método organiza uma tabela de competições para a fase especificada da competição, onde
     * cada luta é entre dois lutadores. Os resultados de cada luta são exibidos, e os vencedores são
     * adicionados à lista de vencedores que é retornada ao final.
     
     * 
     * @param lutadoresCategoria a lista de lutadores que participarão das lutas. A lista deve conter
     *                           um número par de lutadores para formar os pares de competição.
     * @param fase a fase da competição para a qual as lutas estão sendo realizadas (por exemplo, "Oitavas de Finais",
     *             "Quartas de Finais", "Semifinais" ou "3º Lugar").
     * @return uma lista de lutadores que venceram suas respectivas lutas na fase especificada. Se a fase for "3º Lugar",
     *         a lista pode conter um número menor de lutadores, dependendo dos resultados das lutas.
     */
    private List<Lutador> roundsLuta(List<Lutador> lutadoresCategoria, String fase) {
        List<Lutador> vencedores = new ArrayList<>();
        System.out.println("\nChave da competição - " + fase + ":");
        System.out.println(" ");
        
        // Exibe a tabela dos jogos
        System.out.printf("%-20s %-10s %-10s %-20s %-10s %-10s %-20s%n", 
                "Lutador 1", "Golpe 1", "Defesa 1", "Lutador 2", "Golpe 2", "Defesa 2", "Resultado");
        System.out.println("---------------------------------------------------------------------------------------------");
    
        for (int i = 0; i + 1 < lutadoresCategoria.size(); i += 2) {
            Lutador lutador1 = lutadoresCategoria.get(i);
            Lutador lutador2 = lutadoresCategoria.get(i + 1);
    
            // Armazena as estatísticas originais dos lutadores
            int golpe1Original = lutador1.getGolpe();
            int defesa1Original = lutador1.getDefesa();
            int golpe2Original = lutador2.getGolpe();
            int defesa2Original = lutador2.getDefesa();
    
            Luta luta = new Luta(lutador1, lutador2);
            Lutador resultado = luta.lutar();
    
            if (resultado != null) {
                vencedores.add(resultado);
                // Atualiza a tabela com o nome do vencedor
                System.out.printf("%-20s %-10d %-10d %-20s %-10d %-10d %-20s%n",
                    lutador1.getNome(), golpe1Original, defesa1Original,
                    lutador2.getNome(), golpe2Original, defesa2Original,
                    resultado.getNome() + " venceu");
            } else {
                System.out.printf("%-20s %-10d %-10d %-20s %-10d %-10d %-20s%n",
                    lutador1.getNome(), golpe1Original, defesa1Original,
                    lutador2.getNome(), golpe2Original, defesa2Original,
                    "Empate");
            }
        }
    
        if (!fase.equals("3º Lugar")) {
            System.out.println("\nPressione Enter para continuar para a próxima fase...");
            scanner.nextLine(); // Espera o usuário pressionar Enter
        }
    
        return vencedores;
    }
}