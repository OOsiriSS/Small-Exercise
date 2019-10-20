import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ResponseTimeCalculation {

	public static void main(String[] args){
		int time[]=new int[1000];
		
		int i=0;
		Boolean sign=true;
		while(sign){
			String temp;
			System.out.println("Enter a Number:");
			try {
				BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
				temp=buf.readLine();
				if(temp.equals("done")){
					sign=false;
					
				}
				else{
					time[i]=Integer.parseInt(temp);
					i++;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.print("Numbers:");
		for(int b=0;b<i-1;b++) 
		{ 
			System.out.print(time[b]+","); 
		} 
		System.out.println(time[i-1]);
		for(int m=0;m<i-1;m++){
			for(int n=0;n<(i-m-1);n++){
				int temp;
				if(time[n]>time[n+1]){
					temp=time[n];
					time[n]=time[n+1];
					time[n+1]=temp;
				}
			}
		}
		double average;
		int sum=0;
		for(int j=0;j<i;j++){
			sum+=time[j];
		}
		average=(double)sum/i;
		double fangcha=0;
		for(int j=0;j<i;j++){
			fangcha+=Math.pow((time[j]-average), 2);
		}
		double standard_deviation=Math.sqrt(fangcha/i);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("The average is "+df.format(average)+".");
		System.out.println("The minimum is "+time[0]+".");
		System.out.println("The maximum is "+time[i-1]+".");
		System.out.println("The standard deviation is "+df.format(standard_deviation)+".");
	}
	 
		 
	 
}
