
public class Car2_s {
	// 생성자 오버로딩 -> 매개변수가 다른 생성자 선언
	
	public Car2_s(String company, String model, String color) { 
		this.company = company;
		this.model = model;
		this.color = color;		
	}
	
	public Car2_s(String company, String model, String color, int maxspeed) { 
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;		
	}
	
	// 생성자  회사, 모델명,색깔,최고속도 모두 생성자를 통하여 초기화 하도록
	// 생성자를 작성하시오. 작성후 MainClass에서 Car2 객체를 선언하시오.
	
	String company;
	String model;
	String color;
	int maxspeed;
	Car_s car; // 다른 클래스로 만든 객체도 필드로 사용 가능

}
