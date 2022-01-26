import java.util.Scanner;

public class BMI {
    private double pounds;
    private double inches;
    private double bmi;
    private String intepretation;
    private static final double KG = 0.45359237;
    private static final double METERS = 0.0254;

    public BMI(double pounds, double inches) {
        this.setPounds(pounds);
        this.setInches(inches);
        bmi = (pounds * KG) / (inches * METERS * inches * METERS);
        if (bmi < 18.5) {
            intepretation = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            intepretation = "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            intepretation = "Overweight";
        } else {
            intepretation = "Obese";
        }
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public double setPounds() {
        return pounds;
    }

    public void setPounds(double pounds) {
        this.pounds = pounds;
    }

    public double getBmi() {
        return bmi;
    }

    public String getIntepretation() {
        return intepretation;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter weight in pounds: ");
            double pounds = input.nextDouble();
            System.out.print("Enter height in inches: ");
            double inches = input.nextDouble();
            BMI bmi = new BMI(pounds, inches);
            System.out.println("BMI is " + bmi.getBmi());
            System.out.println(bmi.getIntepretation());
        }
    }
}
