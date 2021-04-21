package org.sample.christian.code;

public class DayOne {

	public static void main(String args[]) {
		int a =2,b= 7,d =6;

		if (a>b) {
			System.out.println("This is correct");
		}
		else if (a<d) {
			System.out.println("Within else if statement");
		}
		else {
			System.out.println("This is else statemtent");
		}
		
		int j = 0;
		while(j<10) {
			
			System.out.println(j);
			j++;
		}
		int k = 10;
		do {
			System.out.println(k);
			k++;
		}while(k<10);
	}
}
