package Quiz19;

public class MainClass {
	public static void main(String[] args) {
		String[] arr = {"홍길동"};
		for(int i = 0; i<arr.length; i++) {
			String name=arr[i];
			if(name.equals("홍길동")) {
				System.out.println("홍길동이 있습니다");
				
			}else {
				System.out.println("홍길동이 없습니다");
			}
		}
	}

}
