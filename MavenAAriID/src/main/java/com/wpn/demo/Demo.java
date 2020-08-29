package com.wpn.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	
	 private static final Logger logger = LogManager.getLogger(Demo.class);
	public void say() {
		System.out.println("MavenAAriID��Ŀ   package com.wpn.demo;  say()ִ��");
		
	}
	
	public static void main(String[] args) {
		
		//����ʹ�õ����̵߳��̳߳�
        ExecutorService es1 = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
        	System.out.println("i="+i+"  "+Thread.currentThread().getName());
            es1.submit(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "����ִ������  i=");
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
		
		logger.info("��ǰ");
		System.out.println("package com.wpn.demo;  say()ִ�� 999  "+Thread.currentThread().getName());
		logger.info("��");
	}
}
