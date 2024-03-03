package com.tnsif.multithreadingDemo;
// extending thread class
public class ExtendingThread extends Thread{
@Override
public void run() {
	System.out.println("welcome");
}

	public static void main(String []args) {

ExtendingThread e=new ExtendingThread();

	e.start();
	}

}
