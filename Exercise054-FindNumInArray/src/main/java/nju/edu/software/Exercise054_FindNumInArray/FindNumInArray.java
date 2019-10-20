package nju.edu.software.Exercise054_FindNumInArray;

public class FindNumInArray {
	public boolean Find(int[][] array, int num){
		boolean c=false;
		for(int a=0;a<array.length;a++)
		{for(int b=0;b<array[0].length;b++){
			if (array[a][b]==num){
				 c=true;
			}
		}
			
		
	}return c;
	}
}