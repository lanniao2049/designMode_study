package com.factory.factorymethod;

public class Singleton {
	//����ģʽ
//	private static Singleton singleton = new Singleton();
//	private Singleton() {}
//	public Singleton getInstance() {
//		return singleton;
//	}
	//����ģʽ
//	private static Singleton singleton = null;
//	private Singleton() {}
//	public Singleton getInstance() {
//		if (singleton==null) {
//			//���߳�������
////			singleton = new Singleton();
//			synchronized (Singleton.class) {
//				if (singleton == null) {
//					singleton = new Singleton();
//				}
//			}
//		}
//		return singleton;
//	}
	
	
	//��̬�ڲ�����
	private static class LazyHolder{
		private static final Singleton INSTANCE = new Singleton();
	}
	private Singleton() {}
	public static final Singleton getInstance() {
		return LazyHolder.INSTANCE;
	}
}
