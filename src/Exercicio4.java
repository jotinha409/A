import java.util.Scanner;

public class Exercicio4 {
    String nome;
    char sexo,estado_civil = '-';
    int tempo_casado = 0;

    public void executarExercicio4(Scanner input) {

        System.out.println("Iniciando execução exercicio 4 -- leitura de nome, sexo e estado civil");

        input.nextLine();
        System.out.println("Escreva um nome");
        nome = input.nextLine();

        System.out.println("Selecione o sexo de " + nome);
        System.out.println(" F -- Femenino\n M -- Masculino");
        sexo = input.next().toUpperCase().charAt(0);
        input.nextLine();

        if ( sexo == 'F'){
            System.out.println("Sexo (F)emenino");
            System.out.println("Informe o estado civil de " + nome);
            System.out.println(" C -- Casado\n S -- Solteiro ");
            estado_civil = input.next().toUpperCase().charAt(0);

            if (estado_civil == 'C'){
                System.out.println("Estado Civil (C)asado");
                System.out.println("Informe o tempo de casamento");
                tempo_casado = input.nextInt();
            } else {
                System.out.println("Estado Civil (S)olteiro");
            }

        } else if ( sexo == 'M'){
            System.out.println("Sexo (M)asculino");
        }else {
            System.out.println("Digite um caracter entre F e M");
        }

        System.out.println("Nome " + nome);
        System.out.println("Sexo " + sexo);
        if (sexo == 'F'){
            System.out.println("Femenino");
        }else if (sexo == 'M'){
            System.out.println("Masculino");
        }else{
            System.out.println("Não informado");
        }

        System.out.println("Estado Civil " + estado_civil);
        if (estado_civil == 'C'){
            System.out.println("Casado");
        }else if (estado_civil == 'S'){
            System.out.println("Solteiro");
        }else {
            System.out.println("Não informado");
        }

        System.out.println("Tempo de casamento " + tempo_casado);

    }
}
