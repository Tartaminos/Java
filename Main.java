class Pessoa{
    int idade;
    double peso, altura;
}

public class Main {
    public static void main(String args[]){
    Pessoa fernando = new Pessoa();
    Pessoa alexsandro = new Pessoa();

    fernando.idade = 36;
    fernando.peso = 78.0;
    fernando.altura = 1.69;

    alexsandro.peso = fernando.peso + 90.0;

    fernando.peso = 0;

    System.out.println("idade " + fernando.idade );
    System.out.println("altura " + fernando.altura);
    System.out.println("peso " + fernando.peso);
    System.out.println("alex peso " + alexsandro.peso);
    }
}