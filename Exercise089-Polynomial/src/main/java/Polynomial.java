import java.util.Arrays;



public class Polynomial {



	public static double calculatePolynomial(double x, int[] coefficients) {

      

		int temp[]=new int [coefficients.length];

		for(int i=0;i<coefficients.length;i++){

			temp[i]=coefficients[coefficients.length-1-i];

		}

		return function(x, temp, coefficients.length-1);

    }   

	

	public static double function(double x,int[] coefficients,int n){

		if(n==0){

			System.out.println(coefficients[n]*Math.pow(x, n));

			System.out.println(coefficients[n]+"  "+Math.pow(x, n));

			return coefficients[n]*Math.pow(x, n);

		}

		else{

			int temp[]=new int [n];

			temp=Arrays.copyOfRange(coefficients,0,n);

			System.out.println(coefficients[n]*Math.pow(x, n));

			return coefficients[n]*Math.pow(x, n)+function(x, temp, n-1);

		}

	}

}