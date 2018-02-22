package _TestPackage;

import java.io.IOException;

public class AuoITScript {

	public static void main(String[] args) throws IOException, InterruptedException {
		 Runtime rt = Runtime.getRuntime(); //Example for SingleTon
		 rt.exec("calc");
		 Thread.sleep(1000);
		 rt.exec(".\\AutoITScripts\\TestAutoIT");
	}

}
