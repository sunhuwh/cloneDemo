package com.sh.manager;

public class DailyRecord implements Record{

	@Override
	public Record clone() {
		Record record = null;
		try {
			record = (Record) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("不能复制");
		}
		return record;
	}

	@Override
	public void display() {
		System.out.println("日志");
	}

}
