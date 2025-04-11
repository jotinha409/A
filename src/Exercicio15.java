import java.util.Scanner;
public class Exercicio15 {

    char opt = '-';

    public void executarExercicio15 (Scanner input){

        int altura;
        int largura;
        int valor;

        System.out.println("Iniciando execução do exercicio 15 -- modificação do exericio anterior");

        do {
            System.out.println("Informe a altura da figura");

            valor = input.nextInt();

            if (valor <= 0){
                System.out.println(" -- ERRO -- \n Informe um valor positivo");
                System.out.println("Deseja continuar?");
                System.out.println("(S) Sim");
                System.out.println("(N) Não");

                opt = input.next().toUpperCase().charAt(0);

                if (opt == 'S'){
                    System.out.println("-- Continuando --");
                    continue;
                }else if (opt == 'N'){
                    System.out.println(" Voltando ao menu ");
                    break;
                } else {
                    System.out.println("Informe entre S e N");
                }
            }

            if (valor <= 20 ) {
                for (altura = 1; valor >= altura; altura++){
                    for  (largura = 1; altura >= largura; largura++){
                        System.out.print(" *");
                    }
                    System.out.println();
                }
            } else{
                System.out.println("Os maximo de caracteres é 20");
            }
            } while (valor != 0);

    }

}