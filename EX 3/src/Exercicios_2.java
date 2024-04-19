import java.util.Scanner;

public class Exercicios_2 {

public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

    int valorA, valorB, i, tamanhoVetor, soma = 0;

    System.out.println("defina valor A:");
    valorA = ler.nextInt();
    System.out.println("defina valor B:");
    valorB = ler.nextInt();

    int[] div = new int[valorB];

    while (valorA >= valorB) {
        System.out.printf("valores invalidos %n" + "redefina valor A e valor B %n" + "defina valor A: %n");
        valorA = ler.nextInt();
        System.out.println("defina valor B:");
        valorB = ler.nextInt();
    }
    for (tamanhoVetor = 0, i = 0; i < valorB; i++) {
        valorA++;
        if (valorA %5 == 0) {
            div[tamanhoVetor] = valorA;
            tamanhoVetor++;
        }
        else {
        }

    }
    System.out.println("este são os numeros divisiveis por 5 ");
        for ( i = 0 ; i < tamanhoVetor ; i++) {
            System.out.println(div[i]);
        }

        for ( i = 0; i < div.length; i++) {
            soma = soma + div[i];
        }
        System.out.println(soma);
}
    
}