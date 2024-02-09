package TrainingSet4;

public class Calculator {
	public double add(double num1, double num2) {
		return num1+num2;
	}
	public double subtract(double num1, double num2) {
        return num1 - num2;
    }
	public double multiply(double num1, double num2) {
        return num1 * num2;
    }
	public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; 
        }
    }
	 public double convertKgToPounds(double kilograms) {
	        return kilograms * 2.20462;
	 }
	 public double convertMilesToKm(double miles) {
	        return miles * 1.60934;
	 }
	 public static void main(String[] args) {
	        Calculator calculator = new Calculator();
	        System.out.println("Addition: " + calculator.add(10, 5));
	        System.out.println("Subtraction: " + calculator.subtract(10, 5));
	        System.out.println("Multiplication: " + calculator.multiply(10, 5));
	        System.out.println("Division: " + calculator.divide(10, 5));
	        System.out.println("Conversion - Kg to Pounds: " + calculator.convertKgToPounds(5));
	        System.out.println("Conversion - Miles to Kilometers: " + calculator.convertMilesToKm(10));
	    }

}
