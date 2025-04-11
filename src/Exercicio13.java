import java.util.Scanner;

public class Exercicio13 {
    public void executarExercicio13 (Scanner input) {

        int numero;
        int num;
        int soma;

        System.out.println("Iniciando execução do exercicio 13 -- tabuada");
        do {
            input.nextLine();
            System.out.println("Digite um número inteiro: ");

            if (input.hasNextInt()){
                numero = input.nextInt();
                for (num = 1; num <= 10; num++){

                    soma = (numero * num);

                    System.out.println(numero + " X " + num + " = " + soma);
                }
            }else if (input.hasNextLine()){
                System.out.println("Isso não é um número inteiro.....");
            }
    }while (input.hasNextLine());
}
}