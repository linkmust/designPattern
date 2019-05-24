package com.lin.designPattern.creation.singleton;

public class SyncSingleton {

	private static SyncSingleton instance = null;
	private SyncSingleton(){}
	public static  SyncSingleton  getInstance(){
		if(instance == null){
			synchronized(instance){
				instance = new SyncSingleton();
			}
		}
		return instance;
	}
}
