package Section07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class L21c_ThreadExtend extends Thread {
	public static void main(String[] args) {
		for(int i=0; i<6; i++)
		{
			new Thread("" + i) {
				public void run() {
					System.out.println("Thread: " + getName() + " running");
				}
			}.start();
		}
	}
}