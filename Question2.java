import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * in.nextDouble() to read double
       
    Scanner in = new Scanner(System.in);

    * Prompt user for height
    System.out.print("Please enter your height (in meters): ");
    double height = in.nextDouble();
    System.out.println("Your height is: " + height + " meters.");

    * Prompt user for weight
    System.out.print("Please enter your weight (in kg): ");
    double weight = in.nextDouble();
    System.out.println("Your weight is: " + weight + " kilograms.");

    double bmi = calculateBMI(weight, height);
    // Display BMI
        System.out.println("Your BMI is: " + bmi);

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
  }
}
