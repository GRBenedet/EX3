import java.util.Scanner;
//(ExeRepeticao01) Crie um programa em Java que receba do usuário um número inteiro positivo e informe os totais de números pares e ímpares encontrados entre 1 e o número digitado + o somatório dos pares e ímpares separadamente.

public class Exercicios_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int limite, i,j = 0, soma = 0, h, k;
        
        System.out.println("defina limite: ");
        limite = ler.nextInt();

        int[] pares = new int[limite];
        int[] impares = new int[limite];

        for ( k=0, h = 0, i = 0 ; i < limite; i++) {
            j++;
            if (j%2 == 0) {

                pares[h] = j;
                h++;
            }

            else {
                impares[k] = j;
                k++;
            }
        }
        System.out.printf("------ TOTAL DE PARES ------%n" + h +  "%n" + "------ SOMA DOS PARES ------");
        for (i = 0 ; i < limite; i++) {
            soma = soma + pares[i];   
        }
        System.out.println(soma);
        System.out.printf("------ TOTAL DE IMPARES ------%n" + k + "%n" + "------ SOMA DOS IMPARES ------ ");
        for (i = 0 ; i < limite; i++) {
            soma = soma + pares[i];
        }
        System.out.println(soma);
    }
}