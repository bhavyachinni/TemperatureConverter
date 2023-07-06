import java.util.Scanner;


public class CalculatorScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Fahrenheit to Celsius (1) or Celsius to Fahrenheit (2)");
		int result = scan.nextInt();
		
		if (result ==1) {
			//calculate fahrenheit to celsius
			
			System.out.println("You have chosen FAHRENHEIT to CELSIUS!");
			System.out.println("Enter Fahrenheit value: ");
			double value = scan.nextDouble();
			double valueFinal=(value - 32)* 5/9;
			System.out.print("celsius is: ");
			System.out.println(Math.round(valueFinal*10.0)/10.0);
			
		} else if (result ==2) {
			//calculate celsius to fahrenheit
			
			System.out.println("You have chosen CELSIUS to FAHRENHEIT!");
			System.out.println("Enter CELSIUS value: ");
			double value2 = scan.nextDouble();
			double finalResult = value2 *1.8 +32;
			System.out.print("Fahrenheit is: ");
			System.out.println(Math.round(finalResult*10.0)/10.0);
			
			
			
			
		} else {
			
			//Any number that is not 1 or 2
			System.out.println("Not a valid choice!");
		}
		
		

	}

}
