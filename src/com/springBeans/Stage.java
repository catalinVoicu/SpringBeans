package com.springBeans;

public class Stage {
	
	private Stage() {
		
	}
	
	private static class StageSingletonHolder {
		static Stage instance = new Stage();
	}
	
	public static Stage getStage() {
		return StageSingletonHolder.instance;
	}

}
