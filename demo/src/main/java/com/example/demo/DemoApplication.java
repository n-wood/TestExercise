package com.example.demo;



public class DemoApplication {

	public static String sizeOfNumber(int num){
		String result;

		if (num > 10){
			result = "big";
		}
		else
		{
			result = "small";
		}
		return result;
	}

}
