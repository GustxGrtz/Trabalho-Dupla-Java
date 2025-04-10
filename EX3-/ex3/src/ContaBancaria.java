public class ContaBancaria {

    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saque inválido. Verifique o valor ou saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Saldo Atual: R$ " + saldo);
    }}