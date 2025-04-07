import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Pizza> menu = new ArrayList<>();
        menu.add(new Pizza("mussarela", 30.0, "queijo, molho de tomate"));
        menu.add(new Pizza("calabresa", 35.0, "calabresa, cebola, queijo"));
        menu.add(new Pizza("portuguesa", 40.0, "presunto, ovo, ervilha, queijo"));

        Pedido pedido = new Pedido();

        for (int i = 0; i < 10; i++) {
            System.out.println("menu de opcoes");
            System.out.println("1 - fazer pedido");
            System.out.println("2 - cancelar pedido");
            System.out.println("3 - mostrar pedidos");
            System.out.println("4 - sair");
            int opcao = scan.nextInt();
            scan.nextLine();

            if (opcao == 1) {
                System.out.println("escolha uma pizza do menu:");
                for (int j = 0; j < menu.size(); j++) {
                    Pizza p = menu.get(j);
                    System.out.println(j + " - " + p.getNome() + " | " + p.getValor() + " reais | ingredientes: " + p.getIngredientes());
                }
                int escolha = scan.nextInt();
                scan.nextLine();

                if (escolha >= 0 && escolha < menu.size()) {
                    Pizza pizzaEscolhida = menu.get(escolha);
                    System.out.print("digite o tamanho da pizza (pequena/media/grande): ");
                    String tamanho = scan.nextLine();
                    System.out.print("digite o endereco de entrega: ");
                    String endereco = scan.nextLine();

                    pedido.adicionarPedido(new PedidoItem(pizzaEscolhida, tamanho, endereco));
                    System.out.println("pedido adicionado com sucesso");
                } else {
                    System.out.println("opcao invalida");
                }
            } else if (opcao == 2) {
                System.out.print("digite o numero do pedido para cancelar: ");
                int numero = scan.nextInt();
                scan.nextLine();
                pedido.cancelarPedido(numero);
            } else if (opcao == 3) {
                pedido.gerarRelatorio();
            } else if (opcao == 4) {
                System.out.println("encerrando o sistema");
                break;
            } else {
                System.out.println("opcao invalida");
            }
        }

        scan.close();
    }
}