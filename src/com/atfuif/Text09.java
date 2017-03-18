package com.atfuif;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Text09 {

	public static void main(String[] args) {
		final mytext mytext = new mytext();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						mytext.custom();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}, "AA").start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						mytext.shopping();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}, "BB").start();

	}

}

class mytext {

	private int num = 0;
	 private Lock lock = new ReentrantLock();

	 Condition cindition = lock.newCondition();
	/*
	 * public synchronized void custom() throws Exception{ while (num!=0) {
	 * wait(); } System.out.println(Thread.currentThread().getName()+"生产者"+
	 * num); num=1; notifyAll(); } public synchronized void shopping() throws
	 * Exception{ while (num!=1) { wait(); }
	 * System.out.println(Thread.currentThread().getName()+"消费者"+ num); num=0;
	 * notifyAll(); }
	 */

	public  void custom() throws Exception {
		lock.lock();
		try {
			while (num != 0) {
				cindition.await();
			}
			++num;
			System.out.println(Thread.currentThread().getName() + "生产者" + num);
			cindition.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public  void shopping() throws Exception {
		lock.lock();
		try {
			while (num != 1) {
				cindition.await();
			}
			--num;
			System.out.println(Thread.currentThread().getName() + "消费者" + num);
			cindition.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}

}
