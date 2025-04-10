import java.util.Scanner;

public class Exercicio2 {
    int valorA;
    int valorB;
    int valorC;

    public void executarExercicio2(Scanner input) {
        System.out.println("Iniciando a execução do programa 2 -- soma de dois números");
        System.out.print("Informe o valor da variável A: ");
        valorA = input.nextInt();
        System.out.println();
        System.out.print("Informe o valor da variável B: ");
        valorB = input.nextInt();
        System.out.println();
        System.out.print("Informe o valor da variável C: ");
        valorC = input.nextInt();

        System.out.println();
        if ((valorA + valorB) <= valorC) {
            System.out.println("A soma de A + B é menor que ou igual a C");
        } else {
            System.out.println("A soma de A + B é maior do que o valor de C");
        }
        System.out.println("---Fim exercício 2--\n");
    }
}