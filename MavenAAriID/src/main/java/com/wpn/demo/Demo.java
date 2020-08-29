package com.wpn.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	
	 private static final Logger logger = LogManager.getLogger(Demo.class);
	public void say() {
		System.out.println("MavenAAriID项目   package com.wpn.demo;  say()执行");
		
	}
	
	public static void main(String[] args) {
		
		//创建使用单个线程的线程池
        ExecutorService es1 = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
        	System.out.println("i="+i+"  "+Thread.currentThread().getName());
            es1.submit(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "正在执行任务  i=");
                    try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
            });
        }
        
		
//		PropertyConfigurator.configure("src/main/resources/config/log4j.properties");
		
		logger.info("再前");
		System.out.println("package com.wpn.demo;  say()执行 999  "+Thread.currentThread().getName());
		logger.info("后");
	}
}
