import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = teclado.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double num3 = teclado.nextDouble();

        double resultado = num1 * num2 * num3;

        System.out.println("El resultado de la multiplicación es: " + resultado);

        teclado.close();
    }
}

