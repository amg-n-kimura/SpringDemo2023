package jp.co.amgakuin.javaclass2023.sample20240109;

public class SampleThread extends Thread {

	public static void main(String argv[]) {
		new Thread(new SampleThread()).start();
		
		for(int i=0; i<100; i++) {
			System.out.println("main"+i);
		}
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("i="+i);
		}
	}
}
