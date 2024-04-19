

public class Exercicios_8 {
    public static void main(String[] args) {
        int cont  = 0, num = 101;

        System.out.println("Estes são so numeros primos requisitados");

        while (cont < 50) {
            if (primos(num)) {
                System.out.println(num);
                cont++;
            }
            num++;
        }
    }

    public static boolean primos(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
