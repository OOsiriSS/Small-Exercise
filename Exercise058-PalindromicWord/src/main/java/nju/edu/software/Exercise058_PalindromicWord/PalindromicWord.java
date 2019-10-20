package nju.edu.software.Exercise058_PalindromicWord;



public class PalindromicWord {

	public boolean checkPalindromicWord(String str){

		boolean ifSymmetrical=true;

		int length=str.length();

		int i,j;

		char[] s=new char[length];

		s=str.toCharArray();

		for(i=0;i<length/2;i++){

			if(!((s[i]==s[length-1-i])||(s[i]==s[length-1-i]+32)||(s[i]==s[length-1-i]-32))){

				ifSymmetrical=false;

			}

		}

		return ifSymmetrical;

	}

}
