package com.recursion;

public class recursionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		System.out.println("In main start");
		recursionMain obj = new recursionMain();
		obj.demo(i);
		System.out.println("In main end");
	}
	
	public void demo(int i) {
		System.out.println("Start");
		if(i<=5) {
			i++;
			demo(i);
		}
		System.out.println("End");
		System.out.println(i);
	}
	
	public void demo1() {
		System.out.println("Demo1 start");
		demo2();
		System.out.println("Demo1 end");
	}
	
	public void demo2() {
		System.out.println("Demo2 start");
		demo3();
		System.out.println("Demo2 end");
	}
	
	public void demo3() {
		System.out.println("Demo3 start");
		System.out.println("Demo3 end");
	}

}
