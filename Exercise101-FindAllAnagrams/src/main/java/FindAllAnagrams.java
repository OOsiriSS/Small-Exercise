import java.util.ArrayList;
import java.util.List;



public class FindAllAnagrams {



	public static List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> a = new ArrayList<Integer>();

        int len = p.length();

        for(int i = 0; i < s.length()-len+1; i++){

        	if(isAnagram(s.substring(i, i+len), p))

        		a.add(i);

        }

        return a;

    }

	

	public static boolean isAnagram(String a, String b){

		if(a.length() != b.length())

			return false;

		else if(a.equals(b))

			return true;

		else{

			int i = 0;

			while(i < a.length() && a.charAt(i) != b.charAt(0)){					

					i++;										

				}

			if(i == a.length())

				return false;

			else{

				String x = a.substring(0, i);

				if(i < a.length()-1)

					x += a.substring(i+1);					

						return isAnagram(x, b.substring(1));

			}				

		}

	}

	

}