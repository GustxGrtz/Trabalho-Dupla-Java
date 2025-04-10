public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0.0; 
    }

    public void acelerar(double valor) {
        if (valor > 0) {
            velocidadeAtual += valor; 
            System.out.println("O carro acelerou para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("Valor de acereração inválido.");
        }
    }

    
    

    public void frear(double valor) {
        if (valor > 0 && valor <= velocidadeAtual) {
            velocidadeAtual -= valor; 
            System.out.println("O carro freou para " + velocidadeAtual + " km/h.");
        } else {
            System.out.println("Valor de frenagem inválido ou velocidade insuficiente.");
        }
    }


    
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }}