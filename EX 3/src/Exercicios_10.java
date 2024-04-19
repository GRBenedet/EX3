import java.util.Scanner;

public class Exercicios_10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, i, soma;
        System.out.println("defina numero");
        num = ler.nextInt();


        if (num <= 0) {
            System.out.println("Operação encerrada...");
            System.exit(0);
        }

        else {
            System.out.println("estes são seus resultados:" );
            for (i = 1; i <= num ; i++){
                soma = num * i;
                System.out.println( num + " X " + i + " = " + soma );
            }
        }
    }
}
