package nju.edu.software.Exercise026_Digits;

public class Digits {
	public String reverseInt(int input){
		String input1=""+input;
		int changdu=input1.length();
		String result="";
		for(int t=changdu-1;t>=0;t--){
			result=result+input1.charAt(t);
		}
				return result;
	}
}
