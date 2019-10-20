package nju.edu.software.Exercise057_GetLeastNumbers;



public class GetLeastNumbers {

	public int[] getNumbers(int[] array, int k){

		int result[]=new int[k];

		for(int i=1;i<array.length;i++){

			for(int j=0;j<array.length-i;j++){

				if(array[j]>array[j+1]){

					int temp=array[j];

					array[j]=array[j+1];

					array[j+1]=temp;

				}

			}

		}

		if(k<array.length){

		for(int i=0;i<k;i++){

			result[i]=array[i];

		}

		return result;

		}

		else{

			return array;

		}

	}

}
