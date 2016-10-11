package com.sh.clone;

public class CloneCase {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(11);
		p.setName("sk");
		Person p2 = p.clone();
		System.out.println(p==p2);
		System.out.println(p.equals(p2));
		System.out.println(p.getClass()==p2.getClass());
	}
	
	
}
