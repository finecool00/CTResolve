package day14.api.thread;

public class MainClass {
	public static void main(String[] args) {
		
		//1.작업스레드로 사용할 객체생성
		ThreadTest test = new ThreadTest();
		//2.스레드 클래스를 사용해서 작업스레드를 실행
		Thread thread = new Thread(test, "Thread_A");		
		thread.start();
		
		try {
			thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인스레드 종료");
		
		
	}

}
