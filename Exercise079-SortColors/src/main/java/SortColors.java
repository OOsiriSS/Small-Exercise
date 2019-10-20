public class SortColors {

	public static void sortColors(int[] nums) {
		int[] kind=new int[]{0,0,0};
        for(int num:nums){
        	if(num==0){
        		kind[0]++;
        	}else if(num==1){
        		kind[1]++;
        	}else{
        		kind[2]++;
        	}
        }
        int i=0;
        for(i=0;i<kind[0];i++){
        	nums[i]=0;
        }
        for(i=kind[0];i<kind[0]+kind[1];i++){
        	nums[i]=1;
        }
        for(i=kind[0]+kind[1];i<kind[0]+kind[1]+kind[2];i++){
        	nums[i]=2;
        }
    }
}