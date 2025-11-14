package org.aitycp.wrapper;

public class DemoWrapper {

	public static void main(String[] args) {
		
		
		//primitive
		int i = 10;
		
		//primitive to wrapper
		Integer iObj = new Integer(i);
		
		//wrapper to primitive 
		int j = iObj.intValue();
		
		
		//String to Wrapper
		Integer o = Integer.valueOf("77");
		
		
		//Wrapper to String
		String str = o.toString();
		
		//String to Primitive
		int p = Integer.parseInt("78");
		
		//primitive to String
		String data = Integer.toString(p);

	}

}
