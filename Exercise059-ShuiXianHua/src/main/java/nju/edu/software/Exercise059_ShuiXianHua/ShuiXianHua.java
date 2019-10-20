package nju.edu.software.Exercise059_ShuiXianHua;



public class ShuiXianHua {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		for(int i=100;i<=999;i++){

			String temp=Integer.toString(i);

			String temps[]=temp.split("");

			double result=0;

			for(int j=0;j<temps.length;j++){

				result+=Math.pow(Integer.parseInt(temps[j]), 3);

			}

			

			if(result==i){

				System.out.println(i);

			}

		}

	}



}

