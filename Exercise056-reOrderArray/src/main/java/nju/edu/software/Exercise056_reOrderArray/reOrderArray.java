package nju.edu.software.Exercise056_reOrderArray;



public class reOrderArray {

	public int[] reOrder(int[] array){

		int result[]=new int [array.length];

		int odd_count=0;

		for(int i=0;i<array.length;i++){

			if((array[i]%2)==1){

				result[odd_count]=array[i];

				odd_count++;

			}

		}

		for(int j=0;j<array.length;j++){

			if((array[j]%2)==0){

				result[odd_count]=array[j];

				odd_count++;

			}

		}

		return result;

	}

}
