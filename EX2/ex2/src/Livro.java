import java.util.Scanner;

public class Livro {
    String titulo;
    String autor;
    int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void exiberInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + ano);
    }

    public static Livro registrarLivro() {
        
        Scanner scanLivro = new Scanner(System.in);

        System.out.println("Digite o título: ");
        String titulo = scanLivro.nextLine();

        System.out.println("Digite o autor: ");
        String autor = scanLivro.nextLine();

        System.out.println("Digite o ano de publicação: ");
        int ano = scanLivro.nextInt();

        scanLivro.close();

        // Retornando o objeto Livro
        return new Livro(titulo, autor, ano);
    }

}  
