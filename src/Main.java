public class Main {
    public static void main(String[] args) {
        final var aleatorio = new Aleatorio();
        final var numero = aleatorio.generarRandomInteger(20, 10);
        final var imprimir = new Imprimir();
        System.out.println("lista de numeros");
        imprimir.imprimirNumeros(numero);
        System.out.println();
        imprimir.imprimirPares(numero);
        System.out.println();
        imprimir.imprimirImpares(numero);
    }
}