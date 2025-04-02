import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Sistema de agenda \n");

        Agenda agenda = new Agenda();
        Scanner scan = new Scanner(System.in);

        agenda.adicionarContatos();

        System.out.print("Digite o nome do contato para buscar: ");
        String nomeBusca = scan.nextLine();
        Contato contatoBuscado = agenda.buscarContatos(nomeBusca);
        
        if (contatoBuscado == null) {
            System.out.println("Invalido");
        } else {
            System.out.println("Contato encontrado: " + contatoBuscado.getNome() + contatoBuscado.getTelefone());
        }

        agenda.exibirInformacoes();

        scan.close();
    }
}