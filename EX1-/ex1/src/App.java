public class App {
    public static void main(String[] args) {
        // Testando os métodos da classe Calculadora
        double num1 = 10;
        double num2 = 5;

        System.out.println("Soma: " + Calculadora.som(num1, num2));
        System.out.println("Subtração: " + Calculadora.sub(num1, num2));
        System.out.println("Multiplicação: " + Calculadora.mult(num1, num2));
        System.out.println("Divisão: " + Calculadora.div(num1, num2));
        System.out.println("Divisão por zero: " + Calculadora.div(num1, 0));
    }
}