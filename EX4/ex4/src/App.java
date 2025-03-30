public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Gerenciador de Jogadores");

        Jogador jogador = new Jogador(null, 0, 0);

        jogador.cadastrarJogador();

        System.out.println(jogador.exibirInfo());

        jogador.aumentarPontos(5);

        System.out.println(jogador.exibirInfo());
    }
}
