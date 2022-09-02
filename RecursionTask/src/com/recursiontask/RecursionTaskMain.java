package com.recursiontask;

public class RecursionTaskMain {
	static int n1 = 0;
	static int n2 = 1;
	static int n3 = 0;
	static int n4 = 0;

	
	public static void fibonacci(int count) {
		if(count>0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(" " + n3);
			fibonacci(count-1);
		}
	}
	
	public static void multipleFive(int num, int i) {
		if(i <= 10) {
			System.out.println(num+" x "+i+" = "+num*i);
			multipleFive(num, ++i);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 11;
		int num = 5;
	
		System.out.println(n1 + " " + n2);
		RecursionTaskMain.fibonacci(count-2);
		System.out.println("----------------------------------");
		RecursionTaskMain.multipleFive(num, 1);

	}

}
