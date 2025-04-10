public class App{
    public static void main(String[] args) {
    
    
    
        ContaBancaria conta1 = new ContaBancaria("123456", "João Silva");
    
        conta1.exibirInformacoes();
    
    
        conta1.depositar(500.00);
        conta1.sacar(200.00);
    
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());
        conta1.sacar(350.00);
    }}