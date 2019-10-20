
//Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to an upperbound (e.g., 100). 
//Also compute and display the average. The output shall look like:
//The sum is 5050
//The average is 50.5
public class SumAndAverage {
	int sum = 0;          // store the accumulated sum, init to 0
    double average;       // average in double
    int lowerbound = 1;   // the lower bound to sum
    int upperbound = 100; // the upper bound to sum
    
    public int calculateSum(int lowerbound,int upperbound){
    	//for loop
    	do{
    		sum=sum+lowerbound;
    		lowerbound=lowerbound+1;
    	}while(lowerbound<=upperbound);
    	return sum;
    }

    public double calculateAverage(int lowerbound,int upperbound){
		//for loop
    	average=(upperbound+lowerbound)/2+0.5;
    	return average;
    }
//Modify the program to use a "while-do" loop instead of "for" loop.
//Modify the program to use a "do-while" loop.
//What is the difference between "for" and "while-do" loops?
//What is the difference between "while-do" and "do-while" loops?
}
