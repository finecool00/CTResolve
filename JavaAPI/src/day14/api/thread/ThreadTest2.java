package day14.api.thread;

public class ThreadTest2 extends Thread{

	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("스레드를 상속받은 클래스 실행:" + i);
			System.out.println("스레드의 이름:"+getName());
			try {
				sleep(1000); //상속받은 슬립
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
