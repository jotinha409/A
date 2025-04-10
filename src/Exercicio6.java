import java.util.Scanner;

public class Exercicio6 {
    char turno = '-';

    public void executarExercicio6 (Scanner input){
        System.out.println("Iniciando exercicio 6 -- Turno de estudo");

        do {
            System.out.println("Informe qual turno você estuda");
            System.out.println("(M) Matutino");
            System.out.println("(V) Vespertino");
            System.out.println("(N) Noturno");
            turno = input.next().toUpperCase().charAt(0);


            if (turno == 'M'){
                System.out.println("Bom Dia!");
            }else if (turno == 'V'){
                System.out.println("Boa Tarde");
            }else if (turno == 'N'){
                System.out.println("Boa Noite");
            }else {
                System.out.println("Digite um valor válido");
            }
        }while (turno != 'M' && turno != 'V' && turno != 'N');
    }
}
