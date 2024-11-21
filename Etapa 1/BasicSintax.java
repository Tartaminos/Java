
import java.util.Arrays;

/* class
 o nome da classe deve ser o mesmo nome que o arquivo
*/

/**
 * quando o comentario começa com /**  significa que é um comentario de documentação, o netbeans faz esse comentario no começo geralmente
 * outro lugar que eu ja vi acontecer é no spring
 * @author johann
 */
// abstraem coisas do mundo real (basico do POO). JAVA usa CamelCase

class BasicSintax {

    // as variaveis

    public static void main(String[] args) {
            

        char a = 'a'; // char é apenas um caractere

        boolean isTrue = true; //booleans

        byte oitoBites = 1; // tem até 8 bits

        short inteiroCurto = 1; // int de 16 bits

        int inteiroMedio = 1; // int de 32 bits

        long inteiroLongo = 1; // int d e64 bits

        double decimalMedio = 1.1; // decimal de 32 bits

        float decimalLongo =  (float) 1.1; // decimal de 64 bits

        System.out.println(
            "char = " + a +
            ", boolean = " + isTrue +
            ", byte = " + oitoBites +
            ", short = " + inteiroCurto +
            ", int = " + inteiroMedio +
            ", long = " + inteiroLongo +
            ", double = " + decimalMedio +
            ", float = " + decimalLongo
        );

        arraysJava(); 
        
    }

    public static void arraysJava(){
        /*  arrays é um objeto que armazena varios valores
            porem cada array armazena apenas objetos que foram definidos na sua criação
            por exemplo, um array de int é criado para armazenar inteiros, não poderá receber
            em alguma posição um tipo String ou Float, além disso, seu tamanho é fixo
            POREM, se no momento da criação estivermos passando valores, o array terá o tamanho
            da quantidade de valores passados
        */

       int[] arrayInt = new int[2]; // isso é um array de inteiros com 2 posições 
       arrayInt[0] = 1;

       int[] arrayComTamanhoDinamico = {12, 13, 14, 16};

       System.out.println(
        "esse é um array de inteios com 2 posições, porém só a primeira foi atribuida o valor 1 = " +
        Arrays.toString(arrayInt));

        System.out.println(
            "esse é um array com tamanho dinamico = " + Arrays.toString(arrayComTamanhoDinamico));
    }

// esses tipos primitivos não são orientação a objetos mas sao precisos e rapidos, possivelmente muito usados em sistemas embarcados



/*
    Modificadores de acesso

    servem para delimitar o tipo de acesso ao scopo, por exemplo, um modificador public permite acesso de métodos de fora da classe,
    enquanto o private permite acesso somente da propria classe, o protected por outro lado nao permite acesso de fora do pacote

    _______________________________________________________________________________________________________
    | Modificador | Visivel na classe | Visivel no pacote | Visivel na subclasse | Visivel fora do pacote |
    | public      |         Sim       |         Sim       |         Sim          |          Sim           |
    |   protect   |         Sim       |        Sim        |         Sim          | Não(exceto por herança)|
    |  default    |         Sim       |       Sim         |         Não          |        Não             |
    |  private    |         Sim       |       Não         |         Não          |        Não             |
    -------------------------------------------------------------------------------------------------------

    alem disso podemos tipar metodos com outros modificadores, static, void, final, native 

    STATIC - pertencente a classe, faz com que nao seja necessario instanciar

    VOID - indica que o metodo nao espera nenhum valor de retorno, por exemplo um metodo de log

    NATIVE - indica que o método é implementado fora do java, por exemplo em outra linguagem, biblioteca ou funções do SO

    SYNCHRONIZED - usado para indicar que o metodo deve ser executado por apenas uma thread, excelente para problemas de concorrencia

    VOLATILE - usado para garantir que o valor da variavel seja sempre lido na memoria RAM e não no CACHE da cpu

*/

}
