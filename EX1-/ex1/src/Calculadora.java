public class Calculadora {


    public static double som(double a, double b) {
        return a + b;
    }


    public static double sub(double a, double b) {
        return a - b;
    }


    public static double mult(double a, double b) {
        return a * b;
    }


    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não permitida.");
            return 0.0;
        }
        return a / b;
    }}