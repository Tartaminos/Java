
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

                var numeros = recebeNumerosParaSomar(sc);

                System.out.println("Resultado: " + sum(numeros));

                menu();
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 0:
                break;
            default:
                throw new AssertionError("Opção inválida");
        }
    }

    private static List recebeNumerosParaSomar(Scanner sc) {

        List numeros = new ArrayList();

        System.out.println("Digite quantos números deseja somar: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o número inteiro: ");
            numeros.add(sc.nextInt());
        }

        return numeros;

    }

    private static String sum(List numeros){

        int resultado, resultadoFinal = 0;

        for (int i = 0; i < numeros.size(); i++) {

            var numero = numeros.indexOf(i);

            resultado = resultadoFinal + numero;

            resultadoFinal = resultado;

            
        }

        return String.valueOf(resultadoFinal);

    }

}