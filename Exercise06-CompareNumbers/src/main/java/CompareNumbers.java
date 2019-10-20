import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
		Scanner input1=new Scanner(System.in);
		System.out.println("Enter the first number");
		int number1=input1.nextInt();
		System.out.println("Enter the second number");
		int number2=input1.nextInt();
		System.out.println("Enter the third number");
		int number3=input1.nextInt();
		if(number1==number2||number1==number3||number2==number3){
			System.out.print("There are same numbers.");
		}
		else{
			if(number1>number2&&number1>number3)
				System.out.print("The largest number is "+number1+".");
			if(number2>number1&&number2>number3)
				System.out.print("The largest number is "+number2+".");
			if(number3>number2&&number3>number1)
				System.out.print("The largest number is "+number3+".");}
	}

}
