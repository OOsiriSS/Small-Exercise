package nju.edu.software.Exercise062_DifferentCharCount;



public class DifferentCharCount {

	public int count(String str){

		String strs[]=str.split("");

		int count=1;

		if(str.length()==0){

			return 0;

		}

		for(int i=1;i<strs.length;i++){

			int count2=0;

			for(int j=0;j<=i;j++){

				if(strs[i].equals(strs[j])){

					count2++;

				}

				if(count2>1){

					count--;

					break;

				}

			}

			count++;

			

		}

		

		return count;

	}

}
