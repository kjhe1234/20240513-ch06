
public class MainClass_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		double c;
		Calculator_s cal1 = new Calculator_s();
		// Calculator 클래스로 new연산자를 사용하여 cal1 객체를 생성
		a = cal1.add(100, 200);	
		System.out.println(a);	
		b = cal1.pow(10); //100	
		System.out.println(b);
		c = cal1.divid(10, 3);
		System.out.println(c);
		

		Car_s car = new Car_s(4);  // Car 클래스로 car라는 객체를 선언	
		System.out.println(car.company);	
		car.speed = 150;	
		System.out.println(car.speed);
		System.out.println(car.price[0]);
		System.out.println(car.tire);
		
		Car_s car1 = new Car_s(2); 
		
		Car2_s car2 = new Car2_s("기아","K5","파랑",200);
		
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxspeed);
		
		Car2_s car3 = new Car2_s("기아","K5","파랑");
		
		Test_s test = new Test_s();
		int[] arrTest = {1,2,3,4,5};
		test.sum1(arrTest);
		test.sum2(car1);
		
		Worker_s work = new Worker_s();
		
	   
		
	}
		
}