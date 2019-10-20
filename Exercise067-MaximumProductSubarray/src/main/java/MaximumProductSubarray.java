public class MaximumProductSubarray {

	public static int maxProduct(int[] nums) {
			int result=nums[0]*nums[1];
			for(int i=0;i<nums.length;i++){
				int temp_result=nums[i];
				for(int j=i+1;j<nums.length;j++){
					temp_result*=nums[j];
					if(temp_result>result){
						result=temp_result;
					}
				}
			}
				
	        return result;
	}
}