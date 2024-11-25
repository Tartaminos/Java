
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Crie um programa em Java que funcione como uma calculadora simples. O programa deve:

    Solicitar ao usuário dois números.
    Solicitar ao usuário a operação desejada (+, -, *, /).
    Realizar a operação e exibir o resultado.
*/

class Calc {

    public static void main(String[] args) {
 
        menu();

    }
    

    public static void menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.err.println("0 - Sair");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:

                var numerosParaSomar = recebeNumeros(sc);

                System.out.println("Resultado: " + sum(numerosParaSomar));

                menu();
            case 2:
                
                var numerosParaSubtrair = recebeNumeros(sc);

                System.out.println("Resultado: " + subtraction(numerosParaSubtrair));

                menu();
            case 3:

                var numerosParaMultiplicar = recebeNumeros(sc);

                System.out.println("Resultado: " + toMultiply(numerosParaMultiplicar));

                menu();
            case 4:

                System.out.println("Digite o Dividendo:");
                var dividendo = sc.nextInt();

                System.out.println("Digite o Divisor: ");
                var divisor = sc.nextInt();

                System.out.println("Resultado: " + division(dividendo, divisor));

                menu();
            case 0:
                break;
            default:
                System.err.println("Opção inválida!");
                menu();
        }
    }
    

    private static List recebeNumeros(Scanner sc) {

        List<Integer> numeros = new ArrayList();

        System.out.println("Digite a quantidade de numeros: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o número inteiro: ");
            numeros.add(sc.nextInt());

            System.out.println("Numeros: " + numeros);
            
        }

        return numeros;

    }

    private static String sum(List<Integer> numerosParaSomar) {

        int resultado, resultadoSum = 0;

        for (int i = 0; i < numerosParaSomar.size(); i++) {

            var numero = numerosParaSomar.get(i);

            resultado = resultadoSum + numero;

            resultadoSum = resultado;
        }

        return String.valueOf(resultadoSum);

    }

    private static String subtraction(List<Integer> numerosParaSubtrair) {

        int resultado, resultadoFinal = 0;

        for (int i = 0; i < numerosParaSubtrair.size(); i++) {

            var numero = numerosParaSubtrair.get(i);

            resultado = resultadoFinal - numero;

            resultadoFinal = resultado;
        }

        return String.valueOf(resultadoFinal);

    }

    private static String toMultiply(List<Integer> numerosParaMultiplicar) {

        int resultado = 0, resultadoMult = 1;

        for (int i = 0; i < numerosParaMultiplicar.size(); i++) {

            var numero = numerosParaMultiplicar.get(i);

            resultado = resultadoMult * numero;

            resultadoMult = resultado;
        }

        return String.valueOf(resultadoMult);
    }

    private static String division(Integer dividendo, Integer divisor) {
        return String.valueOf(dividendo / divisor);
    }

}