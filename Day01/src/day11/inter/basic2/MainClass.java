package day11.inter.basic2;

public class MainClass {
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal tiger = new Tiger();
		Animal cat = new Cat();
		
		Animal[] animals = {dog, tiger, cat};
		for(Animal ani : animals) {
			ani.eat();
		}
		
		//dog, cat은 인터페이스 타입으로 형변환이 됩니다.
		//dog, cat, goldfish를 저장하고, ipet기능을 사용
		Pet dog1 = new Dog();
		Pet cat1 = new Cat();
		Pet goldfish1 = new GoldFish();
		Pet[] pets = new Pet[3];
		pets[0] = dog1;
		pets[1] = cat1;
		pets[2] = goldfish1;
		for(Pet p:pets) {
			p.play();
		}
		
		System.out.println("===========================");
		
		PetHouse.carePet(goldfish1);
		PetHouse.carePet(cat1);
		PetHouse.carePet(dog1);
		
		
		
		
		
	}

}
