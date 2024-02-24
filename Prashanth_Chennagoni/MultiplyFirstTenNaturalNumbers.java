public class MultiplyFirstTenNaturalNumbers {
    public static void main(String[] args) {
        long product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println("Multiplication of first 10 natural numbers: " + product);
    }
}
