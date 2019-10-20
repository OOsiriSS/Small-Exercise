
public class GreatestCommonDivisor {
	public static int gcd(int a, int b) {
		int t=1,result=1;
		while(t<=a&&t<=b){
			if(a%t==0&&b%t==0){
				result=t;
			}
			t++;
		}
		return result;
	}
	
	public static int gcdRecursive(int a,int b){
		int result=0;
		if(b==0){
			result=a;
		}
		else result=gcdRecursive(b,a%b);
		return result;
		
		
	}
}
