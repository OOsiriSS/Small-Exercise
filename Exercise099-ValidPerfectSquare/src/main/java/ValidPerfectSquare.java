public class ValidPerfectSquare {



	public static boolean isPerfectSquare(int num) {

		double temp=Math.pow(num, 0.5);

		

		int temp2=(int) (temp);

		if(temp2==temp){

			return true;

		}

		return false;

    }

}