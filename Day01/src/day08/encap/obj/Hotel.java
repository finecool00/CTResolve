package day08.encap.obj;

public class Hotel {
	
	private Chef chef = new Chef(); 
	
	public Hotel(){
//		this.chef = new Chef();
		
	}
	
	//chef의 게터 세터
	//객체를 매개변수로 받는 모형
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	//객체를 반환하는 모형
	public Chef getChef() {
		return chef;
	}
	
}
