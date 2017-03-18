package com.atfuif;

public class TicketDemo {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		
	    Thread t1 = new Thread(t);
	    Thread t2 = new Thread(t);
	    Thread t3 = new Thread(t);
	     t1.setName("t1窗口");
	     t2.setName("t2窗口");
	     t3.setName("t3窗口");
	     t1.start();
	     t2.start();
	     t3.start();
	}
}
