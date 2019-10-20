
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class CurrencyCalculation {

	public static void main(String[] args) {
		Scanner input1=new Scanner(System.in);
		System.out.println("How many eruos are you exchanging?");
		double Euro=input1.nextDouble();
		System.out.println("What is the exchange rate?");
		double rate=input1.nextDouble();
		double rate1=rate/100;
		double answer=Euro*rate1;
	
		Formatter formatter = new Formatter();
		formatter.format("%.2f euros at an exchange rate of %.2f is %.2f U.S. dollars.", Euro,rate ,answer);
		String expected = formatter.toString();
		formatter.close();
		
		System.out.println(expected);
	}


}
