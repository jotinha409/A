import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {

    int numero = 0;
    int num;
    boolean negativo = false;

    public void executarExercicio10 (Scanner input){
        ArrayList<Integer> numeros = new  ArrayList<>();

        for (numero = 0; numero < 5; numero++) {
            System.out.println("Escreva 5 números");
            numeros.add(input.nextInt());
        }

        System.out.println("Verificando números negativos.......");

        for (numero = 0; numero < numeros.size(); numero++){
            num = numeros.get(numero);
            if(num < 0){
                System.out.println("Número negativo encontrado na posição " + (numero + 1) + ": " + num);
                negativo = true;

            }
        }
        if (!negativo) {
            System.out.println("Nenhum número negativo foi digitado.");
        }


    }
}
