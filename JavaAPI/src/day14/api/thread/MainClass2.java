package day14.api.thread;

public class MainClass2 {
	public static void main(String[] args) {
		ThreadTest2 thread = new ThreadTest2();
		thread.setName("Thread_B");
		thread.start();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인스레드 종료");
	}

}
