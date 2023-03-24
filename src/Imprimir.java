public class Imprimir {
    public static void imprimirNumeros(int n) {
        for (var i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public static void imprimirPares(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void imprimirImpares(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
