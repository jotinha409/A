import java.util.Scanner;

public class Exercicio9 {
    public void executarExercicio9 (Scanner input) {

        int count = 0;
        int numero;

        System.out.println("Iniciando execução exericio 9 -- Mostrar em ordem decrescente os 20 primeiros numeros impares naturais");
        System.out.println("Os 20 primeiros números naturais impares em ordem decrescente");

        for (numero = 20; numero >= 1 && count < 20; numero--) {
            if (numero % 2 != 0) {
                System.out.println(numero);
                count++;

            }
        }
    }
}

