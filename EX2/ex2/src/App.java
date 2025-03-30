public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Sistema Biblioteca Java");

        Livro l1 = new Livro("O Caso do Martelo", "José Clemente Pozenato", 1994);
        Livro l2 = new Livro("Tempo e o Vento", "Érico Veríssimo", 1985);
        Livro l3 = new Livro("Senhor dos anéis", "José Clemente Pozenato", 1985);

        l1.exiberInfo();
        System.out.println();
        l2.exiberInfo();
        System.out.println();
        l3.exiberInfo();
    
        System.out.println("Agora digite o livro que deseja inserir na biblioteca: ");

        Livro novoLivro = Livro.registrarLivro();

        novoLivro.exiberInfo();
    }   
}
