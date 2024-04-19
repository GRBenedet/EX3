import java.util.Scanner;

public class Exercicios_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num, multi, i;
        int[] tabuada = new int[10];

        System.out.println("qual tabuada deseja?");
        num = ler.nextInt();
        if (num <= 0) {
        System.out.println("numero invalido");
        System.exit(0);
            
        }
        else {
            for (i = 0, multi = 1; i < tabuada.length; i++, multi++){
                tabuada[i] = num * multi;
            }
        }

        for (i = 0; i< tabuada.length; i++){
            System.out.println(tabuada[i]);
        }
    }
}
