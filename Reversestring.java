package org.test;

public class Reversestring {
public static void main(String[] args) {
	
	StringBuffer s = new StringBuffer("karthik");
	StringBuffer rev=new StringBuffer("");
	System.out.println(s.hashCode());
	System.out.println(rev.hashCode());
	
	String s1 = "karthik";
	String s2 = "karthik";
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	
	int x=s.length();

	for (int i = x-1; i>=0; i--) {
		char c =s.charAt(i);
		s2.concat(s1);
		
		//rev.append(c);
		System.out.println(s2.hashCode());
	}
System.out.println(rev);
}
}
