package jp.co.amgakuin.javaclass2023.sample20240109;

public class SampleRunnable implements Runnable {

	public static void main(String argv[]) {
		new Thread(new SampleRunnable()).start();
		
		for(int i=0; i<100; i++) {
			System.out.println("main="+i);
		}

	}
	
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0; i<100; i++) {
			System.out.println("i="+i);
		}
	}

}
