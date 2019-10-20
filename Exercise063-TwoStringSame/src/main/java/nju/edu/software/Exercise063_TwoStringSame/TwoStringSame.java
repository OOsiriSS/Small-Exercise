package nju.edu.software.Exercise063_TwoStringSame;



public class TwoStringSame {

	public boolean same(String strA, String strB){

		String B=newSequence(strB);

		String A=newSequence(strA);

		

		

		if(A.equals(B)){

			return true;

		}

		else{

			return false;

		}

	}

	

	public String newSequence(String str){

		if(str.equals("")){

			return "";

		}

		String[] strs=str.split(" ");

		String newstr="";

		for(int i=0;i<strs.length;i++){

			newstr+=strs[i];

		}

		

		String[] chars=newstr.split("");

		char[] chars_1=new char[chars.length];

		for(int i=0;i<chars.length;i++){

			chars_1[i]=chars[i].charAt(0);

		}

		for(int i=1;i<chars_1.length;i++){

			for(int j=0;j<chars_1.length-i;j++){

				if(chars_1[j]<chars_1[j+1]){

					

					char temp=chars_1[j];

					chars_1[j]=chars_1[j+1];

					chars_1[j+1]=temp;

				}

			}

		}

		String result="";

		for(int i=0;i<chars_1.length;i++){

			result+=chars_1[i];

		}

		

		return result;

	}

}
