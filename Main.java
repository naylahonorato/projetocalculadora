public class Main {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 2;

        // Exemplo de chamada de método de outra classe (Soma)
        double resultadoSoma = Soma.calcular(num1, num2);
        System.out.println("Soma: " + resultadoSoma);

        // Exemplo de chamada de método de outra classe (Subtracao)
        double resultadoSubtracao = Subtracao.calcular(num1, num2);
        System.out.println("Subtração: " + resultadoSubtracao);

        // Exemplo de chamada de método de outra classe (Multiplicacao)
        double resultadoMultiplicacao = Multiplicacao.calcular(num1, num2);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        // Exemplo de chamada de método de outra classe (Divisao)
        double resultadoDivisao = Divisao.calcular(num1, num2);
        System.out.println("Divisão: " + resultadoDivisao);
    }

}
