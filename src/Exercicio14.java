import java.util.Scanner;

public class Exercicio14 {
    public void executarExercicio14 (Scanner input){

        int altura;
        int largura;
        int valor;

        System.out.println("Iniciando execução do exericicio14 -- Imprima a seguinte figura");

        do {
        System.out.println("Informe a altura da figura");
        valor = input.nextInt();

        if (valor <= 20) {
            for (altura = 1; altura <= valor; altura++){
                for  (largura = 1; largura <= altura; largura++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }else {
            System.out.println("O maximo é 20 caracteres");
        }

        }while (valor != 0);

        System.out.println("Explicação (achei daohra o exercicio");
        System.out.println("Este trecho desenha a figura:\n" +
                "\n" +
                "\uD83D\uDD39 O for (altura = 1; altura <= valor; altura++) define a linha atual (de 1 até a altura informada).\n" +
                "\uD83D\uDD39 O for (largura = 1; largura <= altura; largura++) imprime os asteriscos da linha atual.\n" +
                " ➡ Cada linha tem tantos * quanto o número da linha.\n" +
                "\n" +
                "\uD83D\uDD39 System.out.print(\"* \") imprime o asterisco sem quebrar linha.\n" +
                "\uD83D\uDD39 System.out.println() quebra a linha depois que todos os * de uma linha foram impressos.");
    }


}
