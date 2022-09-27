public class FormattedPrinting {
    public static void main(String[] args) {
        double salary = 455678.12345;
        int age = 18;
        String name = "Shriya Kappagantula";

        for (int x = 0; x < 15; x++)
        {
            System.out.printf("%20s%5d%12.2f", name, age, salary); //s for string, d for digit, f for floating point. %12.2f rounds the double value to 2 decimal places.
        }
    }
}
