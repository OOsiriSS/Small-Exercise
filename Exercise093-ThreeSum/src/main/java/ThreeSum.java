public class ThreeSum {



	public static int[] threeSum(int[] nums, int target) {

        int result[]=new int[3];

        for(int i=0;i<nums.length;i++){

        	for(int j=0;j<nums.length;j++){

        		for(int m=0;m<nums.length;m++){

        			if(nums[i]+nums[j]+nums[m]==target){

        				result[2]=i;

        				result[1]=j;

        				result[0]=m;

        				

        			}

        		}

        	}

        }

        System.out.println(result[0]+""+result[1]+""+result[2]);

        return result;

    }

}