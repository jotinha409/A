import java.util.Scanner;

public class Exercicio11 {
    public Exercicio11() {
    }

    public void executarExercicio11(Scanner input) {
        int soma = 0;
        int contador = 0;
        System.out.println("Iniciando execução exericio 11 -- Média de números dos alunos");

        int numero;
        do {
            System.out.print("Digite um número inteiro (0 para encerrar)");
            numero = input.nextInt();
            if (numero != 0 && numero % 2 == 0) {
                soma += numero;
                ++contador;
            }
        } while(numero != 0);

        if (contador > 0) {
            double media = (double)soma / (double)contador;
            System.out.println("A média dos números pares é" + media);
        } else {
            System.out.println("Nenhuma numero par foi digitado");
        }

    }
}
