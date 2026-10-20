#include <stdio.h>

int main() {
    double num1, num2, num3, resultado;

    printf("Introduce el primer número: ");
    scanf("%lf", &num1);

    printf("Introduce el segundo número: ");
    scanf("%lf", &num2);

    printf("Introduce el tercer número: ");
    scanf("%lf", &num3);

    resultado = num1 * num2 * num3;

    printf("El resultado de la multiplicación es: %.2f\n", resultado);

    return 0;
}