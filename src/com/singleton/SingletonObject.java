package com.singleton;

public class SingletonObject {
	private static SingletonObject INSTANCE = null;

	private SingletonObject() {
	}

	public static SingletonObject getInstance() throws InterruptedException {
		System.out.println("getInstance() Called ->" + Thread.currentThread().getName());
		Thread.sleep(1000);
		if (INSTANCE == null) {
			INSTANCE = new SingletonObject();
		}
		Thread.sleep(1000);
		return INSTANCE;
	}

}
