package com.singleton;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingletonTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		SingletonObject obj = SingletonObject.getInstance();
//		SingletonObject obj1 = SingletonObject.getInstance();
		
		Singleton o = Singleton.INSTANCE;
		System.out.println(o.hashCode());
		
		ExecutorService ex = Executors.newFixedThreadPool(4);
		
		Future<SingletonObject> submit = ex.submit(()->SingletonObject.getInstance());
		Future<SingletonObject> submit1 = ex.submit(()->SingletonObject.getInstance());
		SingletonObject obj = submit.get();
		SingletonObject obj1 = submit1.get();
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		
		ex.shutdown();
	}
}
