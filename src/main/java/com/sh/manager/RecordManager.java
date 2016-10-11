package com.sh.manager;

import java.util.HashMap;

public class RecordManager {
	
	private HashMap<String, Record> map = new HashMap<>();
	public static RecordManager recordManager = new RecordManager();
	
	private RecordManager(){
		map.put("dailyRecord", new DailyRecord());
		map.put("weeklyRecord", new WeeklyRecord());
	}
	
	public Record getRecord(String key){
		return map.get(key).clone();
	}
	
	public void addRecord(String key, Record record){
		map.put(key, record);
	}
	
	public static RecordManager getRecordManager(){
		if(recordManager==null){
			recordManager = new RecordManager();
		}
		return recordManager;
	}
	
}
