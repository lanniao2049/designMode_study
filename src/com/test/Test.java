package com.test;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer, String> names = new HashMap<>();
		names.put(12, "12");
		for (int i = 0; i < args.length; i++) {
			System.out.println("---------------");
		}
		
		ExecutorService pool1 = Executors.newFixedThreadPool(10);
		ExecutorService pool2 = Executors.newSingleThreadExecutor();
		ExecutorService pool3 = Executors.newCachedThreadPool();
		ExecutorService pool4 = Executors.newScheduledThreadPool(10);
		
		int a = Integer.highestOneBit(12<<1);
		int b = Integer.highestOneBit(16<<1);
		System.out.println("a:"+a+",b:"+b);
		byte a1 = 1;
		short b1 = 2;
		char c1 = 'a';
		int a2 = a1+c1;
		char t = ' ';
		String a_1 = "";
		
		// Á·Ï°* *
		System.out.println('*'+'\t'+'*');
		System.out.println('*'+"\t"+'*');
		System.out.println('*'+'\t'+"*");
		System.out.println('*'+('\t'+"*"));
	}
}
