public class Division {
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN; // Retorna "Not a Number" para indicar error
        }
        return a / b;
    }
}
