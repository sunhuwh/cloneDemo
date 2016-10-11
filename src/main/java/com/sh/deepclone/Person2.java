package com.sh.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person2 implements Serializable{
	
	private String name;
	
	private int age;
	
	private DangAn2 dangAn;
	
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

	public DangAn2 getDangAn2() {
		return dangAn;
	}

	public void setDangAn2(DangAn2 dangAn) {
		this.dangAn = dangAn;
	}
	
	public Person2 deepClone() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (Person2)ois.readObject();
		
	}
	
}
