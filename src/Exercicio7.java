import java.util.Scanner;

public class Exercicio7 {
    char While = '-';

    public void executarExercicio7 (Scanner input) {

        do{
            System.out.println("Iniciando execução do exercicio 4 -- Diferenciação while, do-while e for. ");

            System.out.println("Informe qual While gostaria de verificar");
            System.out.println("(W) -- while.... ");
            System.out.println("(D) -- do-while.... ");
            System.out.println("(F) -- for.... ");
            System.out.println("(E) -- Sair -- ");

            While = input.next().toUpperCase().charAt(0);



            if (While == 'W'){
                System.out.println("Testa a condição antes de executar. Se for falsa, não entra no bloco.");
                System.out.println("Exemplo");
                System.out.println("int i = 0;\n" +
                        "while (i < 3) {\n" +
                        "    System.out.println(i);\n" +
                        "    i++;\n" +
                        "}");
                System.out.println("Começa com i = 0.\n" +
                        "\n" +
                        "Verifica: i < 3 → verdadeiro → entra no bloco.\n" +
                        "\n" +
                        "Imprime: 0\n" +
                        "\n" +
                        "Faz i++ → agora i = 1\n" +
                        "\n" +
                        "Volta pro while, verifica: 1 < 3 → verdadeiro\n" +
                        "\n" +
                        "Imprime: 1, incrementa i = 2\n" +
                        "\n" +
                        "Verifica: 2 < 3 → verdadeiro\n" +
                        "\n" +
                        "Imprime: 2, incrementa i = 3\n" +
                        "\n" +
                        "Verifica: 3 < 3 → falso → PARA");

            } else if (While == 'D'){
                System.out.println(" Executa o bloco pelo menos uma vez, e só depois testa a condição.");
                System.out.println(" Exemplo");
                System.out.println("int i = 0;\n" +
                        "while (i < 3) {\n" +
                        "    System.out.println(i);\n" +
                        "    i++;\n" +
                        "}");
                System.out.println("Começa com i = 0\n" +
                        "\n" +
                        "Executa o bloco mesmo sem testar condição\n" +
                        "\n" +
                        "Imprime 0, depois i++ → i = 1\n" +
                        "\n" +
                        "Verifica: 1 < 3 → verdadeiro → repete\n" +
                        "\n" +
                        "Imprime 1, i++ → i = 2\n" +
                        "\n" +
                        "Verifica: 2 < 3 → verdadeiro → repete\n" +
                        "\n" +
                        "Imprime 2, i++ → i = 3\n" +
                        "\n" +
                        "Verifica: 3 < 3 → falso → PARA");


            }else if (While == 'F' ){
                System.out.println("Usado quando já sabemos quantas vezes queremos repetir. Controla tudo numa só linha: início, condição e passo.");
                System.out.println("Exemplo");
                System.out.println("int i = 0;\n" +
                        "do {\n" +
                        "    System.out.println(i);\n" +
                        "    i++;\n" +
                        "} while (i < 3);.");
                System.out.println("int i = 0 → inicializa a variável\n" +
                        "\n" +
                        "Verifica: i < 3 → verdadeiro\n" +
                        "\n" +
                        "Executa: imprime 0\n" +
                        "\n" +
                        "Faz i++ → i = 1\n" +
                        "\n" +
                        "Verifica: i < 3 → verdadeiro\n" +
                        "\n" +
                        "Imprime 1, depois i++ → i = 2\n" +
                        "\n" +
                        "Verifica: i < 3 → verdadeiro\n" +
                        "\n" +
                        "Imprime 2, depois i++ → i = 3\n" +
                        "\n" +
                        "Verifica: i < 3 → falso → PARA");
            }else{
                System.out.println("Digite um caracter válido");
            }

            System.out.println("\nSe tiver entendido digite -- E -- para voltar ao menu\n");
        }while (While != 'E');
    }
}
