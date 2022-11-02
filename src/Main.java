import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int Max = 0;
        int resSuma = 0;

        for (;;) {
            System.out.println("1) Rellenar");
            System.out.println("2) Sumar");
            System.out.println("3) Max");
            System.out.println("4) Imprimir");
            System.out.println("5) Salir");
            System.out.println("Introduzca la opcion:");
            int a = scanner.nextInt();


            if (a == 1) {
                System.out.println("Introduzca los numeros:");
                for (int i = 0; i < 5; i++) {
                    int opcion = scanner.nextInt();
                    numeros[i] = opcion;
                }
            }
            if (a == 2) {
                resSuma = 0;
                for (int i = 0; i < 5; i++) {
                    resSuma = resSuma + numeros[i];
                }
                System.out.println(resSuma);
            }
            if (a == 3) {
                for (int i = 0; i < 5; i++) {
                    if (numeros[i] > Max) {
                        Max = numeros[i];
                    }
                }
                System.out.println(Max);

            }
            if (a == 4) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(numeros[i]);
                }
            }
            if (a == 5) {
                System.out.println("Adioooooos");
                break;
            }
            a = 0;
        }
    }
}



