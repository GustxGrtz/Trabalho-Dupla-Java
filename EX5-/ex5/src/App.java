public class App {
    public static void main(String[] args) {

        
        
        
        Carro carro1 = new Carro("Chevrolet", "Corsa", 2008, "ABC-1234");


       
        carro1.exibirInformacoes();

 
        
        
        
        carro1.acelerar(50.0);
        carro1.acelerar(30.0);
        carro1.frear(20.0);
        carro1.frear(70.0);
        carro1.exibirInformacoes();
    }
}