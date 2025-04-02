import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda{

    Scanner scanAdd = new Scanner(System.in);
    List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContatos(){

        for (int i = 0; i < 10; i++) {

        System.out.print("Digite 1 para adicionar, 2 para listar um contato ou 0 para sair: ");
        int opcao = scanAdd.nextInt();
        scanAdd.nextLine();

            if(opcao == 1){
                System.out.print("Digite o nome do contato: ");
                String nome = scanAdd.nextLine();
                System.out.print("Digite o telefone do contato: ");
                String telefone = scanAdd.nextLine();
                
                Contato contato = new Contato(nome, telefone);
                contatos.add(contato);
                System.out.println("contato adicionado: " + contato.getNome());
            }else if (opcao == 0) {
                System.out.println("É isso o sistema");
            }else if(opcao == 2){
                System.out.println("Lista de contatos");
                exibirInformacoes();
            }else{
                System.out.println("Inválido");
            }
        }
        }


    public Contato buscarContatos(String nome){
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
    }
    return null;
    }

    public void exibirInformacoes(){
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + " Telefone: " + contato.getTelefone());
        }
    }
}