import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opt;
        do {
            System.out.println("Menu de exercícios");
            System.out.println("\t1 - Menu com do-while");
            System.out.println("\t2 - Exercício ....");
            System.out.println("\t3 - Exercício ....");
            System.out.println("\t4 - Exercício ....");
            System.out.println("\t5 - Exercício ....");
            System.out.println("\t6 - Exercício ....");
            System.out.println("\t7 - Exercício ....");
            System.out.println("\t8 - Exercício ....");
            System.out.println("\t9 - Exercício ....");
            System.out.println("\t10 - Exercício ....");
            System.out.println("\t11 - Exercício ....");
            System.out.println("\t0 - SAIR DO PROGRAMA!");
            System.out.println("Escolha sua opção: ");
            opt = input.nextInt();
            switch (opt) {
                case 0:
                    System.out.println("Programa finalizado com sucesso!");
                    break;
                case 1:
                    System.out.println("Iniciando a execução do exercício 1...\n");
                    Exercicio1 ex1 = new Exercicio1();
                    ex1.executar();
                    break;
                case 2:
                    Exercicio2 exercicio2 = new Exercicio2();
                    exercicio2.executarExercicio2(input);
                    break;
                case 3:
                    Exercicio3 exercicio3 = new Exercicio3();
                    exercicio3.executarExercicio3(input);
                    break;
                case 4:
                    Exercicio4 exercicio4 = new Exercicio4();
                    exercicio4.executarExercicio4(input);
                    break;
                case 5:
                    Exercicio5 exercicio5 = new Exercicio5();
                    exercicio5.executarExercicio5(input);
                    break;
                case 6:
                    Exercicio6 exercicio6 = new Exercicio6();
                    exercicio6.executarExercicio6(input);
                    break;
                case 7:
                    Exercicio7 exercicio7 = new Exercicio7();
                    exercicio7.executarExercicio7(input);
                    break;
                case 8:
                    Exercicio8 exercicio8 = new Exercicio8();
                    exercicio8.executarExercicio8();
                    break;
                case 9:
                    Exercicio9 exercicio9 = new Exercicio9();
                    exercicio9.executarExercicio9(input);
                    break;
                case 10:
                    Exercicio10 exercicio10 = new Exercicio10();
                    exercicio10.executarExercicio10(input);
                    break;
                case 11:
                    Exercicio11 exercicio11 = new Exercicio11();
                    exercicio11.executarExercicio11(input);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while(opt != 0);

    }
}
