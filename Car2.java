package pre_oop;

public class Car2 {//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car2(){//생성자
		
	}
	
	Car2(String model){//생성자
		this(model,"은색",250);
		
	}
	
	Car2(String model,String color){//생성자
		this(model,color,250);
	}
	
	Car2(String model,String color,int maxSpeed){//생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
