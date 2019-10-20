package nju.edu.software.Exercise061_MoreThanHalfNum;



public class MoreThanHalfNum {

	public int getMoreThanHalfNum(int[] array){

		for(int i=0;i<array.length;i++){

			int count=0;

			for(int j=0;j<array.length;j++){

				if (array[j]==array[i]){

					count++;

				}

				if(count>=function(array.length)){

					return array[i];

				}

			}

		}

		return -1;

	}

	

	public int function(int i){

		if(i%2==0){

			return i/2;

		}

		else{

			return (i/2)+1;

		}

	}

}
