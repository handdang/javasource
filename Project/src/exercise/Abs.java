package exercise;

import java.util.Scanner;
public class Abs {
	
	static int abs;
	
	
	
	static int abs(int value) {
		
			if(value<=0) {
			value = -value;
			
	}
		return value;
	}
	
	static double abs(double dValue) {
		{
			if(dValue<=0) {
				dValue = -dValue;
		}	
	}
		return dValue;
	}
	
	public static void main(String[] args)
	{
//	Scanner sc = new Scanner(System.in);
//	int value = sc.nextInt();
//	System.out.println(value+"의 절대값:"+abs(value)); 
	
	Scanner sc1 = new Scanner(System.in);
	double dValue =sc1.nextDouble() ;
	System.out.println(dValue+"의 절대값:"+abs(dValue)); 
	}
	
	  
	  
	  
}
