package com.jbk.GC;

public class TestGC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj=new A();
obj.show();
System.out.println(obj);
System.runFinalization();
System.gc();
	}

}
