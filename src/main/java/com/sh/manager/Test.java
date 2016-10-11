package com.sh.manager;

public class Test {

	public static void main(String[] args) {
		RecordManager recordManager = RecordManager.getRecordManager();
		Record dailyRecord = recordManager.getRecord("dailyRecord");
		Record dailyRecord2 = recordManager.getRecord("dailyRecord");
		System.out.println(dailyRecord==dailyRecord2);
		
		Record weeklyRecord = recordManager.getRecord("weeklyRecord");
		Record weeklyRecord2 = recordManager.getRecord("weeklyRecord");
		System.out.println(weeklyRecord==weeklyRecord2);
	}

}
