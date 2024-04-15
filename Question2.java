import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter your height (in meters): ");
        double height = in.nextDouble();

        System.out.print("Please enter your weight (in kg): ");
        double weight = in.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.println("Your BMI is: " + bmi);
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}


