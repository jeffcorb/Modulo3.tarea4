public class Imprimir {
    void imprimirNumeros(int n) {
        for (var i = 1; i <= n; i++) {
            System.out.printf(i + " ");
        }
    }

    void imprimirPares(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf(i + " ");
            }
        }
    }

    void imprimirImpares(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.printf(i + " ");
            }
        }
    }
}
