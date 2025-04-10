import java.util.Scanner;

public class Exercicio3 {
    int numero;
    int numeroq;
    int numeroc;

    public void executarExercicio3(Scanner input) {
        System.out.println("Iniciando a execução do exercício 3 -- Número é par");
        System.out.println("Digite um número inteiro, vamos verificar se ele é par ou impar");
        numero = input.nextInt();
        numeroq = (numero * numero);
        numeroc = (numero * numero * numero);

        if ( numero % 2 == 0){
            System.out.println( numero + " é par");
            System.out.println(numero +" ao quadrado é " + numeroq);
        }else if (numero % 2 > 0) {
            System.out.println( numero + " é ímpar");
            System.out.println(numero + " ao cubo é " + numeroc );
        }


    }
}
