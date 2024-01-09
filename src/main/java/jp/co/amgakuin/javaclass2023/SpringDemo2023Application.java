package jp.co.amgakuin.javaclass2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemo2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo2023Application.class, args);
		
		kotae = tashizan(10,20);
		System.out.print(kotae);
	}
	
	public static int kotae;
	
	public static final int tashizan(final int x, final int y) {
		final int result = x + y;
		return result;
	}
}
