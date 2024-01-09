package jp.co.amgakuin.javaclass2023.sample20240109;

public class SampleMainClass extends Thread {

	public static void main(String argv[]) {
		SampleParentClass spc = new SampleParentClass();
		SampleChildClass scc = new SampleChildClass();
		
		//spc.var1 = 100;
		//spc.method1();
		
		scc.var1 = 200;
		scc.method1();
		
		SampleParentClass spc2 = scc;
		spc2.method1();
		
		SampleChildClass scc2;
		//scc2 = spc;
		
		
		new Thread(new SampleThread()).start();
		new Thread(new SampleMainClass()).start();
	}
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("(run2)i="+i);
		}
	}
}
