import java.util.Scanner;

public class HeartRateCalculation {

	public static void main(String[] args) {
		Scanner input1=new Scanner(System.in);
		System.out.println("Please enter your restinghr");
		int restinghr=input1.nextInt();
		System.out.println("Please enter your age");
		int age=input1.nextInt();
		System.out.print("intensity | rate"+"\n"+"——————————|————————\n");
		int intensity=55;
		int rate;
		while(intensity<=95){
			rate=((((220-age)-restinghr)*intensity/100)+restinghr);
			System.out.print(intensity+"%  |"+rate+"bpm"+"\n");
			intensity=intensity+5;
		}
	}

}
