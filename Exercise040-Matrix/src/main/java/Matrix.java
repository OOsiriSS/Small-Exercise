
public class Matrix {
	   
	   /**
	    * 判断m1和m2是否维度相同
	    * @param m1
	    * @param m2
	    * @return 判断结果
	    */
	   public static boolean haveSameDimension(int[][] m1, int[][] m2){
		   if(m1.length==m2.length&&m1[0].length==m2[0].length){
			   return true;
		   }
		   else
		   return false;
	   }
	   
	   /**
	    * 判断m1和m2是否维度相同
	    * @param m1
	    * @param m2
	    * @return 判断结果
	    */
	   public static boolean haveSameDimension(double[][] m1, double[][] m2){
		   if(m1.length==m2.length&&m1[0].length==m2[0].length){
			   return true;
		   }
		   else
		   return false;
	   }
	   
	   /**
	    * 将二维数组相加
	    * @param m1
	    * @param m2
	    * @return 二维数组
	    */
	   public static int[][] add(int[][] m1, int[][] m2){
		   int a[][]=new int[m1.length][m1[0].length];
		   for(int p=0;p<m1.length;p++){
			   for(int q=0;q<m1[p].length;q++){
				 a[p][q]=m1[p][q]+m2[p][q];
			   }
		   }
		   return a;
	   }
	   
	   /**
	    * 将二维数组相加
	    * @param m1
	    * @param m2
	    * @return 二维数组
	    */
	   public static double[][] add(double[][] m1, double[][] m2){
		   double a[][]=new double[m1.length][m1[0].length];
		   for(int p=0;p<m1.length;p++){
			   for(int q=0;q<m1[p].length;q++){
				 a[p][q]=m1[p][q]+m2[p][q];
			   }
		   }
		   return a;
	   }
	   
	}