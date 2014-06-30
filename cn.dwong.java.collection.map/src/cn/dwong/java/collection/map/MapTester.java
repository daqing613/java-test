package cn.dwong.java.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTester {
	public static void main(String[] args) {
		
		//keys are Strings
		//objects are also Strings
		Map<String, String> map = new HashMap<>();
		fillData(map);
		
		// write to command line 
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
		
		map.put("iphone", "Created by Apple");
		map.remove("Andriod");
		
		// write again to command line 
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
		
	}
	
	private static void fillData(Map<String, String> map) {
		map.put("Andriod", "Mobile");
		map.put("Eclipse Ide", "Java");
		map.put("Eclipse RCP", "Java");
		map.put("Git", "Version control system");
	}

}
