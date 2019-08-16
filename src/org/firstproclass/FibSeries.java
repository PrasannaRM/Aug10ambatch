package org.firstproclass;

public class FibSeries {
	public static void main(String[] args) {
		
		int f=0,f1=1,f2;
		
		System.out.println(f +"\n"+ f1);
		
		for (int i = 2; i <=5; i++) {
			
			f2 = f+f1;
			
			System.out.println(f2);
			
			f=f1;
			f1=f2;
			
		}
		
	}

}
