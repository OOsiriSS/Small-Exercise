
public class ExcelSheetColumnNumber {



	public static int titleToNumber(String s) {

        int result=0;

        String strs[]=s.split("");

        for(int i=0;i<strs.length;i++){

        	double base=Math.pow(26, strs.length-i-1);

        	switch (strs[i]) {

			case "A":

				result+=(1*base);

				break;

			case "B":

				result+=(2*base);

				break;

			case "C":

				result+=(3*base);

				break;

			case "D":

				result+=(4*base);

				break;

			case "E":

				result+=(5*base);

				break;

			case "F":

				result+=(6*base);

				break;

			case "G":

				result+=(7*base);

				break;

			case "H":

				result+=(8*base);

				break;

			case "I":

				result+=(9*base);

				break;

			case "J":

				result+=(10*base);

				break;

			case "K":

				result+=(11*base);

				break;

			case "L":

				result+=(12*base);

				break;

			case "M":

				result+=(13*base);

				break;

			case "N":

				result+=(14*base);

				break;

			case "O":

				result+=(15*base);

				break;

			case "P":

				result+=(16*base);

				break;

			case "Q":

				result+=(17*base);

				break;

			case "R":

				result+=(18*base);

				break;

			case "S":

				result+=(19*base);

				break;

			case "T":

				result+=(20*base);

				break;

			case "U":

				result+=(21*base);

				break;

			case "V":

				result+=(22*base);

				break;

			case "W":

				result+=(23*base);

				break;

			case "X":

				result+=(24*base);

				break;

			case "Y":

				result+=(25*base);

				break;

			case "Z":

				result+=(26*base);

				break;



			default:

				break;

			}

        	System.out.println(result+","+strs[i]);

        }

		return result;

    }

	   

}