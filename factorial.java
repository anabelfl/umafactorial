import java.util.Scanner;

public class Factorial {
    public static long fact(long num) {
        if (num<=1) {
            return 1;
        } else {
            return num*fact(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = scanInput.nextLong();
        long fac = fact(num);
        System.out.println("El factorial de " + num + " es " + fac);
        scanInput.close();
    }
}
