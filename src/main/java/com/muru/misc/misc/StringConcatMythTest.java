package com.muru.misc.misc;

public class StringConcatMythTest {
	
	static public void main(String[] args)
	{
		printStr();
		concat("hi","george");
	}
	
	static void printStr()
	{
		System.out.println("hi" + "george");
	}

	
	static void concat(String s1 , String s2)
	{
		String s3 = s1 + s2;
		System.out.println(s3);
	}
}
