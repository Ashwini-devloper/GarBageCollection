package com.jbk.GC;

public class Hello {
void m1()
{
	System.out.println("M1 begin");
	
	Hi h1=new Hi();
	Hi h2=new Hi();
	Hi h3=new Hi();
	
	
	System.out.println("M2 begin");
	System.runFinalization();
	System.gc();
	Hi h4=new Hi();
	System.out.println("M2 End");
}
	public void finalize() {
		System.out.println("Hello Finalization()");
	}
}


