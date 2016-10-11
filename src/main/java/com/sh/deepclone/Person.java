package com.sh.deepclone;

public class Person implements Cloneable{
	
	private String name;
	
	private int age;
	
	private DangAn dangAn;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public DangAn getDangAn() {
		return dangAn;
	}

	public void setDangAn(DangAn dangAn) {
		this.dangAn = dangAn;
	}
	
	protected Person clone(){
		Object object = null;
		try {
			object = super.clone();
			return (Person)object;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
