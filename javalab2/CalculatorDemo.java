import java.util.*;
class MyCalculator{
	double number1;
	double number2;
	MyCalculator(double n1,double n2){
		number1=n1;
		number2=n2;
	}
	double add() {
		return number1+number2;
	}
	double subtract() {
		return number1-number2;
	}
	double multiply() {
		return number1*number2;
	}
	double divide() {
		if (number2!=0) {
		return number1/number2;
	}else {
		System.out.println("Not defined!");
		return Double.NaN;
	}
}
}
public class CalculatorDemo {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		double num1, num2;
		int op;
		char dec;
		do{
			System.out.println("--- Calculator Menu ---");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("Enter your choice (1-4): ");
			op= sc.nextInt();
			System.out.println("Enter the first number: ");
			num1= sc.nextDouble();
			System.out.println("Enter the second number: ");
			num2= sc.nextDouble();
			MyCalculator try1 =new MyCalculator(num1,num2);
			switch(op) {
			    case 1 : 
					System.out.println("Result: " + try1.add());
					break;
				case 2 :
					System.out.println("Result: " + try1.subtract());
					break;
				case 3 :
					System.out.println("Result: " + try1.multiply());
					break;
				case 4 :
					System.out.println("Result: " + try1.divide());
					break;
				default :
					System.out.println("Invalid choice!");
			}
			System.out.println("Do you want to continue (Y/N)?");
			dec= sc.next().charAt(0);
		}while (dec== 'Y' || dec=='y');
	}
}