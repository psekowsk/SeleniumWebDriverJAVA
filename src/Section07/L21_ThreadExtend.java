package Section07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class L21_ThreadExtend extends Thread {
	public static void main(String[] args) {
		L21_ThreadExtend thread = new L21_ThreadExtend();
		thread.start();
		
		System.out.println("Outside of a thread");
	}
	
	public void run() {
		System.out.println("Inside of a thread");
	}
}