package cn.dwong.java.first;

public class Person {
  String firstname = "Jim";
  String lastname = "wo";
  int age = 12;
  
  void writename() {
	  // writes the firstname 
	  System.out.println(firstname);
	  
	  
	  // alternatively, you can combine strings with +
	  System.out.println(firstname + " " + lastname + " " + age);
  }
}
