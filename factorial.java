import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = scanInput.nextLong();
        long fac = 1;

        for (long i = 1; i <= num; ++i) {
            fac = fac * i;
        }

        System.out.println("El factorial de " + num + " es " + fac);
        scanInput.close();
    }
}
