public class PowerOfFour {



	public static boolean isPowerOfFour(int num) {

		int a = num>>2;

		if(num == 1)

			return true;

		if(num == a*4 && num > 0){

			if(a == 1)

				return true;

			else

				return isPowerOfFour(num/4);

		}			

		else 

			return false;

    }

	   

}