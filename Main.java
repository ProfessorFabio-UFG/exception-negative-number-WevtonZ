import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static double raizQuadrada(double valor) {
        if(valor < 0) {
            throw new NumeroNegativo("Raiz quadrada de numero negativo!\n");
        }
        return Math.sqrt(valor);
    }

    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();

        double r;

        try {
            r = raizQuadrada(x);
            System.out.println(r);
        } catch(NumeroNegativo e) {
            System.out.println(e);
        }
    }
}