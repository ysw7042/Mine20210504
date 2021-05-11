package pre_oop;

public class Car1 {//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car1(){//생성자
		
	}
	
	Car1(String model){//생성자
		this.model = model;
		
	}
	
	Car1(String model,String color){//생성자
		this.model = model;
		this.color = color;
	}
	
	Car1(String model,String color,int maxSpeed){//생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
