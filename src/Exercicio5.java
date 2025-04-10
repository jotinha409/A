import java.util.Scanner;

public class Exercicio5 {
    int numero;
    int numerodivisao;

    public void executarExercicio5(Scanner input) {

        System.out.println("Inciando execução do exercício 5 -- se par, Divisão ");
        System.out.println(" -- Digite -1 para voltar ao menu -- ");

        do {
            System.out.println("Digite um número inteiro:");
            numero = input.nextInt();
            System.out.println("Número digitado " + numero);

            if (numero == -1){
                System.out.println("-- Finalizando exercicio 5 --\n");
                System.out.println(" -- Voltando ao menu --\n");
            }
            if (numero <= 0) {
                System.out.println("!!Erro!!\n");
                System.out.println("!!PROGRAMANDO AUTO DESTRUIÇÃO!!\n");
                continue;
            }

            if (numero % 3 == 0){
                numerodivisao = (numero / 3);
            } else {
                numerodivisao = (numero / 5);
            }

            if ( numero % 2 == 0){
                System.out.println( numero + " é par");

                if (numero % 3 == 0){
                    System.out.println(numero + " É divisivel por 3");
                    System.out.println(numero + " Divido por 3 é " + numerodivisao);
                }else{
                    System.out.println(numero + " Não é divisivel por 3");
                }

            } else {
                System.out.println( numero + " é ímpar");

                if (numero % 5 == 0){
                    System.out.println(numero + " é divisivel por 5");
                    System.out.println(numero + " Divido por 5 é " + numerodivisao);
                } else {
                    System.out.println(numero + " Não é divisivel por 5");
                }
            }

        }while (numero != -1);
    }
}
