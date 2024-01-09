package jp.co.amgakuin.javaclass2023.sample20240109;

public class SampleRunnable implements Runnable {

	public void main(String argv[]) {
		new Thread(new SampleRunnable()).start();
	}
	
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0; i<10000; i++) {
			System.out.println("i="+i);
		}
	}

}
