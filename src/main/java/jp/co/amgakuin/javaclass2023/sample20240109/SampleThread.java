package jp.co.amgakuin.javaclass2023.sample20240109;

public class SampleThread extends Thread {

	public void main(String argv[]) {
		new Thread(new SampleThread()).start();
	}
	
	@Override
	public void run() {
		for(int i=0; i<95; i++) {
			System.out.println("i="+i);
		}
	}
}
