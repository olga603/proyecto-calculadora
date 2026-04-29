import java.util.Scanner;

public class App {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double n1, n2;

        do {
            System.out.println("\n--- CALCULADORA MODULAR ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = teclado.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Primer número: ");
                n1 = teclado.nextDouble();
                System.out.print("Segundo número: ");
                n2 = teclado.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + Suma.sumar(n1, n2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + Resta.restar(n1, n2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + Multiplicacion.multiplicar(n1, n2));
                        break;
                    case 4:
                        // La validación de división por cero se hace dentro del método
                        double resDiv = Division.dividir(n1, n2);
                        if (!Double.isNaN(resDiv)) {
                            System.out.println("Resultado: " + resDiv);
                        }
                        break;
                }
            }
        } while (opcion != 5);

        System.out.println("Programa finalizado.");
        teclado.close();
    }
}
