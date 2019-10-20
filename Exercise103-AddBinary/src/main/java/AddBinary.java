public class AddBinary {



	public static String addBinary(String a, String b) { 

		int l1 = a.length();

		int l2 = b.length();

		int carry = 0;

		StringBuffer res = new StringBuffer();

		StringBuffer m = new StringBuffer(a);

		StringBuffer n = new StringBuffer(b);

		int len = l1;

		if(l1 > l2){

			for(int i = 0; i < l1-l2; i++)

				n.insert(0, "0");			

		}

		else{

			len = l2;

			for(int i = 0; i < l2-l1; i++)

				m.insert(0, "0");

		}

		

		for(int i = len-1; i >=0; i--){

			if((int)m.charAt(i)+(int)n.charAt(i)+carry == 96){

				carry = 0;

				res.insert(0, "0");

			}

			else if((int)m.charAt(i)+(int)n.charAt(i)+carry == 97){

				carry = 0;

				res.insert(0, "1");

			}

			else if((int)m.charAt(i)+(int)n.charAt(i)+carry == 98){

				carry = 1;

				res.insert(0, "0");

			}

			else{

				carry = 1;

				res.insert(0, "1");

			}

		}

		

		if(carry == 1)

			res.insert(0, "1");

        return res.toString();

    }

}