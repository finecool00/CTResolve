package Quiz02;

public class Tv {
	String company = "LG"; //회사
	int channel; // 채널
	boolean power; // 전원
	
	Tv() {
		System.out.println("tv의 정보와 상태");
		System.out.println("제조업체:" + company);
		System.out.println("채널:" + channel);
		System.out.println("전원:" + power);
	}
	Tv(String a, int b,boolean c) {
		company = a;
		channel = b;
		power = c;
	}
	
	/*
	 * 메서드
	 * changeChannel : int - 매개변수 채널번을 받아서 채널을 변경,변경된 채널을 리턴
	 * power : void - 켜져있으면 꺼지고, 꺼져있으면 켜기
	 */
	int changeChannel(int a) {
		channel = a;
		return channel;
	}
	void power() {
		if(power) {
			power = false;
			System.out.println("전원을 꺼주세요");
		}else {
			power =true;
			System.out.println("전원을 켜주세요");
		}
	}
}
