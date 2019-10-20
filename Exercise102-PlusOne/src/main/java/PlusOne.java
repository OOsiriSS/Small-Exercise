public class PlusOne {



	public static int[] plusOne(int[] digits) {

		int len = digits.length;

		int[] temp = new int[len];

		int carry = 1;

		for(int i = len-1;i >= 0; i--){

			if(digits[i]+carry > 9){

				carry = 1;

				temp[i] = 0;

			}

			else{

				temp[i] = digits[i]+carry;

				carry = 0;

			}			

		}

		if(carry == 0)

			return temp;

		else{

			int[] res = new int[len+1];

			res[0] = 1;

			return res;

		}

    }

}