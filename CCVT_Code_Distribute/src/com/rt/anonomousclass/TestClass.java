package com.rt.anonomousclass;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		
		Greeting obj=new Greeting(){
			
			@Override
			public void prin() {
				// TODO Auto-generated method stub
				System.out.println("Hello World");
				
			}
		};
		
		obj.prin();
		
	}

}
