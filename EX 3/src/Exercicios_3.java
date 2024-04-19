import java.util.Scanner;

public class Exercicios_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, somaDivisores = 0, i ;

        System.out.println("Digite um número: ");
        numero = ler.nextInt();

        while (numero <= 0) {
            System.out.println("Numero invaido!!!!");
            numero = ler.nextInt();
            
        }

        for (i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        if (somaDivisores == numero) {
            System.out.println(numero + " É um número perfeito.");
        } else {
            System.out.println(numero + "É não é um número perfeito.");
        }
    }
}
