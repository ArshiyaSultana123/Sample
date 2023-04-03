package org.sample;
// REVERSE STRING
public class Task2 {
	
	public static void main(String[] args) {
		String S = "Reverse String";
		String reverse ="";
		for (int i = S.length()-1; i >=0; i--) {
			char c = S.charAt(i);
			reverse = reverse + c;
			
		}
		
		System.out.println("reversed String " +reverse);
	}

}
