package com.sh.manager;

public class WeeklyRecord implements Record {

	@Override
	public Record clone() {
		Record record = null;
		try {
			record = (Record) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("���ܸ���");
		}
		return record;
	}

	@Override
	public void display() {
		System.out.println("�ܱ�");
	}

}
