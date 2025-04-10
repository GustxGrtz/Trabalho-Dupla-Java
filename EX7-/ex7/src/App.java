import java.util.Scanner;

public class App {


    private static Produto[] estoque = new Produto[10];
    private static int contadorEstoque = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Atualizar Quantidade de Produto");
            System.out.println("3 - Exibir Estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProduto(scanner);
                    break;
                case 2:
                    atualizarQuantidade(scanner);
                    break;
                case 3:
                    exibirEstoque();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarProduto(Scanner scanner) {
        if (contadorEstoque < estoque.length) {
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o código do produto: ");
            String codigo = scanner.nextLine();
            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();
            System.out.print("Digite a quantidade em estoque: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();  // Limpar a linha

            Produto produto = new Produto(nome, codigo, preco, quantidade);
            estoque[contadorEstoque] = produto;
            contadorEstoque++;
            System.out.println("Produto adicionado ao estoque.");
        } else {
            System.out.println("Estoque cheio. Não é possível adicionar mais produtos.");
        }
    }


    private static void atualizarQuantidade(Scanner scanner) {
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();

        Produto produto = encontrarProduto(codigo);
        if (produto != null) {
            System.out.print("Digite a quantidade a ser adicionada (use um número negativo para remover): ");
            int quantidade = scanner.nextInt();
            if (quantidade >= 0) {
                produto.adicionarQuantidade(quantidade);
            } else {
                produto.removerQuantidade(-quantidade);
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }


    private static Produto encontrarProduto(String codigo) {
        for (int i = 0; i < contadorEstoque; i++) {
            if (estoque[i].getCodigo().equals(codigo)) {
                return estoque[i];
            }
        }
        return null;
    }


    private static void exibirEstoque() {
        if (contadorEstoque == 0) {
            System.out.println("Estoique vazio.");
        } else {
            for (int i = 0; i < contadorEstoque; i++) {
                estoque[i].exibirInformacoes();
                System.out.println("-----------");
            }
        }
    }
}