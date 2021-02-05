package org.rose.multi_threading;

public class IsItMethodOverriding {
	public static void main(String[] args) {
		new Test2() {
			public void m1() {
				System.out.println("m1() Executed in Test1");
			}
		}.m1();
		
//		new Test2().m1();
	}
}

class Test2{
	public Test2() {
		System.out.println("Test2 0 param cons");
	}
	public void m1() {
		System.out.println("Test2 m1()");
	}
}