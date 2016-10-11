package com.sh.deepclone;

import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Person person = new Person();
		DangAn da = new DangAn();
		da.setAttachment("123");
		person.setDangAn(da);
		Person p2 = person.clone();
		System.out.println(person==p2);
		System.out.println(p2.getDangAn()==person.getDangAn());
		System.out.println(p2.getDangAn().getAttachment()==person.getDangAn().getAttachment());
		
		
		Person2 pe = new Person2();
		DangAn2 da2 = new DangAn2();
		da2.setAttachment("123");
		pe.setDangAn2(da2);
		Person2 pe2 = pe.deepClone();
		System.out.println(pe==pe2);
		System.out.println(pe.getDangAn2()==pe2.getDangAn2());
		System.out.println(pe.getDangAn2().getAttachment()==pe2.getDangAn2().getAttachment());
		
		System.out.println(pe.getDangAn2().getAttachment());
		System.out.println(pe2.getDangAn2().getAttachment());
	}
	
}
