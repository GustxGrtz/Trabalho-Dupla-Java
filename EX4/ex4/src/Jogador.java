import java.util.Scanner;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;
    
    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void aumentarPontos(int pontos){
        this.pontuacao += pontos;
    }

    public int subirNivel(){
        return nivel++;
    }

    public String exibirInfo(){
        return (" Lista de informações \n" + " Nome: " + nome + " Pontuação: " +
        pontuacao + " Nível: " + nivel);
    }

    public void cadastrarJogador(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastrar um jogador");
        System.out.println("Digite o nome do jogador: ");
        this.nome = scan.nextLine();
        System.out.println("Digite a pontuação do jogador: ");
        this.pontuacao = scan.nextInt();
        System.out.println("Digite o nível do jogador: ");
        this.nivel = scan.nextInt();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
