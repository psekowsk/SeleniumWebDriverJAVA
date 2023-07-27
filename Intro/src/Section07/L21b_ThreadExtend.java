package Section07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class L21b_ThreadExtend extends Thread {
	public static void main(String[] args) {
		L21b_ThreadExtend thread = new L21b_ThreadExtend();
		Thread threadObject = new Thread(thread);
		threadObject.start();
		
		System.out.println("Outside of a thread");
	}
	
	public void run() {
		System.out.println("Inside of a thread");
	}
}