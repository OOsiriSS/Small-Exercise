public class ThirdMaximumNumber {

	 public static int thirdMax(int[] nums) {
		 int length=nums.length;
		 int thirdmax,max,min,secondmax;
		 max=nums[0];
		 int[] maxnum=new int[3];
		 
		 min=nums[0];
		 for(int num:nums){
			 if(num<min){
				 min=num;
			 }
		 }
		 
		 for(int i=0;i<length;i++){
			 if(nums[i]>max){
				 max=nums[i];
				 maxnum[0]=i;
			 }
			 nums[maxnum[0]]=min;
		 }
		 
		 if(length<3){
			thirdmax=max; 
		 }else{
			secondmax=nums[0];
			for(int i=0;i<length;i++){
				 if(nums[i]>secondmax){
					 secondmax=nums[i];
					 maxnum[1]=i;
				 }
			}
			nums[maxnum[1]]=min;
			thirdmax=nums[0];
			for(int i=0;i<length;i++){
				 if(nums[i]>thirdmax){
					 thirdmax=nums[i];
				 }
			}
		 }
	        
		 return thirdmax;
	 }
}