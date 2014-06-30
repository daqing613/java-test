package cn.dwong.java.collection;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
	public static void main(String[] args) {
		
		// create a list, use is ArrayList as concrete type 
		// ArrayList<> refers the String type from the left side 
		List<String> var = new ArrayList<>();
		
		// add a few Strings to it 
		var.add("Tom");
		var.add("Lors");
		
		// Loop over it  and print the result to the console
		for (String s : var) {
			System.out.println(s);
		}
	}

}
