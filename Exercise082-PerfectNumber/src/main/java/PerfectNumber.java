import java.util.ArrayList;

public class PerfectNumber {

	 public static boolean checkPerfectNumber(int num) {
	        
		 ArrayList<Integer> list=new ArrayList<>();
		 for(int i=1;i<num;i++){
			 for(int j=1;j<=num;j++){
				 if((i*j)==num){
					 list.add(i);
				 }
			 }
		 }
		 int result=0;
		 for(int i=0;i<list.size();i++){
			 result+=list.get(i);
		 }
		 if(result==num){
			 return true;
		 }
		 return false;
	 }
}