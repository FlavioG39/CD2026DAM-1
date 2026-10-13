public class TresBucles {

    public static void main(String[] args) {

        // 1. Bucle FOR
        for (int i = 1; i <= 3; i++) {
            System.out.println("FOR: " + i);
        }

        // 2. Bucle WHILE
        int j = 1;

        while (j <= 3) {
            System.out.println("WHILE: " + j);
            j++;
        }

        imprimirBucleInterno();
        int kk = sumar(4, 3);

        // 3. Bucle DO-WHILE
        int k = 1;

        do {
            System.out.println("DO-WHILE: " + k);
            k++;
        } while (k <= 3);
    }

    public static void imprimirBucleInterno(){
        int k = 1;

        do {
            System.out.println("DO-WHILE: " + k);
            k++;
        }while (k <= 3);
    }

    public static int sumar(int a, int b){
        int resultado;

        resultado = a + b;

        return resultado;
    }
}