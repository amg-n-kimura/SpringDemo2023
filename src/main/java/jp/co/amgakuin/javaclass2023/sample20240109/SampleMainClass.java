package jp.co.amgakuin.javaclass2023.sample20240109;

public class SampleMainClass {

	public static void main(String argv[]) {
		
		SampleParentClass spc = new SampleParentClass();
		SampleChildClass scc = new SampleChildClass();

		SampleThread thread = new SampleThread();
		SampleRunnable run = new SampleRunnable();
		
		//spc.var1 = 100;
		//spc.method1();
		
		scc.var1 = 200;
		scc.method1();
		
		SampleParentClass spc2 = scc;
		spc2.method1();
		
		SampleChildClass scc2;
		//scc2 = spc;
		
		thread.run();
		run.run();
	}
}
