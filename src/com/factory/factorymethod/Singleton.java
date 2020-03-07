package com.factory.factorymethod;

public class Singleton {
	//饿汉模式
//	private static Singleton singleton = new Singleton();
//	private Singleton() {}
//	public Singleton getInstance() {
//		return singleton;
//	}
	//懒汉模式
//	private static Singleton singleton = null;
//	private Singleton() {}
//	public Singleton getInstance() {
//		if (singleton==null) {
//			//多线程有问题
////			singleton = new Singleton();
//			synchronized (Singleton.class) {
//				if (singleton == null) {
//					singleton = new Singleton();
//				}
//			}
//		}
//		return singleton;
//	}
	
	
	//静态内部类型
	private static class LazyHolder{
		private static final Singleton INSTANCE = new Singleton();
	}
	private Singleton() {}
	public static final Singleton getInstance() {
		return LazyHolder.INSTANCE;
	}
}
