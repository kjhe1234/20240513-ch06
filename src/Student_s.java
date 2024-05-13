
public class Student_s {
	
	// 오른쪽 클릭 -> source ->generate constructor using filed
	
	public Student_s() {
		super();  // 부모클래스의 생성자 호출
	
	}
	
	public Student_s(String name, String hakbun, int age, String grade, String address) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
		this.grade = grade;
		this.address = address;
	}
		
	public Student_s(String name, String hakbun, int age, String grade) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
		this.grade = grade;
	}


	String name;
	String hakbun;
	int age;
	String grade;
	String address;
	
	public void printName() {  // 리턴값이 없는 메소드 -> void
		System.out.println("학생이름:"+ this.name);
		
	}
	
	

}
