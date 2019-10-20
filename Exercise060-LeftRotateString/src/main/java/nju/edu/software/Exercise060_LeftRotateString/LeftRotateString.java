package nju.edu.software.Exercise060_LeftRotateString;



public class LeftRotateString {

	public String leftrotate(String str, int k){

		String strs[]=str.split("");

		for(int i=0;i<k;i++){

			String temp=strs[0];

			for(int j=0;j<strs.length-1;j++){

				strs[j]=strs[j+1];

			}

			strs[strs.length-1]=temp;

		}

		String result="";

		for(int i=0;i<strs.length;i++){

			result+=strs[i];

		}

		return result;

	}

}
