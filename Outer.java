package com.core.inner.prog;
//Case:Accessing inner class code ffrom instance area of outer class
public class Outer {
	public void methodOne() {
		System.out.println("Outer method body start to call inner method");
		Inner inner=new Inner();
		inner.methodTwo();
	}
	class Inner{
		public void methodTwo() {
			System.out.println("Inner method body");
		}
	}
	public static void main(String[] args) {
		System.out.println("outer methid going to call");
		Outer outer=new Outer();
		outer.methodOne();
	}
}
