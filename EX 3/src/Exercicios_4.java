import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Exercicios_4 {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int num1 , num2;

    System.out.println("digite o primeiro numero");
    num1 = ler.nextInt();
    System.out.println("digite o segundo numero");
    num2 = ler.nextInt();

    if (num1 == num2) {
        System.out.printf("os numeros NÃO PODEM SER IGUAIS!! %n" + "------ FINALIZANDO ------");
        System.exit(0);
    }
  
    else if ( num1 < num2) {
        System.out.println("numeros estão em ordem crescente");
    }
    else {
        System.out.println("numeros estão em ordem decrecente");
    }

}
}
