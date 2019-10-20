
public class Sum {

	// 求1到n的和
	public static int calcSum(int n) {
	int s= n*(n+1)/2;
	return s;
	}

	// 求1到n的平方和
	public static int calcQuadraticSum(int n) {
		int t= n*(n+1)*(2*n+1)/6;
		return t;
	}
	
}
