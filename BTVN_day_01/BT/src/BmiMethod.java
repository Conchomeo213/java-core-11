import java.util.Scanner;

public class BmiMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input weight in kilogram: ");
        double weight = input.nextDouble();
        System.out.println("Input height in meters: ");
        double height = input.nextDouble();
        double weight_in_kilo = weight;
        double height_in_meters = height;
        double bmi = weight_in_kilo / (height_in_meters * height_in_meters );
        System.out.println("BMI is: " + bmi);

    }
}
