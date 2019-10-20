public class Search2DMatrix {



	public static boolean searchMatrix(int[][] matrix, int target) {    

        int nums[]=new int[matrix.length*matrix[0].length];

        for(int i=0;i<matrix.length;i++){

        	for(int j=0;j<matrix[0].length;j++){

        		nums[(i*matrix[0].length+j)]=matrix[i][j];

        	}

        }

        if(nums.length<=0){

        	return false;

        }

        int min=0;

		 int max=nums.length-1;

		 int mid=(min+max)/2;

		 

		 while(true){

			 if(nums[mid]>target){

				 max=mid-1;

			 }

			 else if(nums[mid]<target){

				 min=mid+1;

				 

			 }

			 else{

				 return true;

			 }

			 if(max<0||min>nums.length-1){

				 return false;

			 }

			 mid=(min+max)/2;

			 

		 }

		

    }

}