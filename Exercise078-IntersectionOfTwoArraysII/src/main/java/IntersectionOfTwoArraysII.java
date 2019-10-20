import java.util.ArrayList;

public class IntersectionOfTwoArraysII {

	 public static int[] intersect(int[] nums1, int[] nums2) {
		 String longest="";
		 String[] s1=new String[nums1.length];
		 String[] s2=new String[nums2.length];
		 String now;
		 ArrayList<String> as=new ArrayList<String>();
		 String is;
		 for(int i=0;i<s1.length;i++){
			 s1[i]=String.valueOf(nums1[i]);
		 }
		 for(int i=0;i<s2.length;i++){
			 s2[i]=String.valueOf(nums2[i]);
		 }  
		 for(int i=0;i<s1.length;i++){
			 now=s1[i];
			 for(int j=0;j<s2.length;j++){
				 is="";
				 if(now.equals(s2[j])){
					 for(int k=0;k<=s2.length-j-1;k++){
						 if(s1[i+k].equals(s2[j+k])){
							 is=is+s1[i+k];
						 }else{
							 break;		
						 }
					 }
					 as.add(is);
				 }
			 }
		 }
		 longest=as.get(0);
		 for(String s:as){
			 if(s.length()>longest.length()){
				 longest=s;
			 }
		 }
		 int[] result=new int[longest.length()];
		 for(int i=0;i<longest.length();i++){
			 result[i]=Integer.valueOf(longest.substring(i,i+1));
		 }
	    return result;
	 }
}
