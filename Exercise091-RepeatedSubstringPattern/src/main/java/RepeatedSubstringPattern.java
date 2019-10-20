public class RepeatedSubstringPattern {



	public static boolean repeatedSubstringPattern(String str) {

		int len = str.length();

		boolean res = false;


			for(int i = 2; i < len; i++){

				if(len%i == 0){

					String a = str.substring(0,i);

					res = true;

					for(int j = 0; j < i; j++)

						if(!a.equals(str.substring(j*i, (j+1)*i)))

							res = false;

					if(res)

						break;

				}

			}

			return res;


    	

    }

}