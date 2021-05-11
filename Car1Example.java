package pre_oop;

public class Car1Example {
	public static void main(String[] args) {
		Car1 car2 = new Car1();
		System.out.println("car2.company : " + car2.company);
		System.out.println();
		
		Car1 car3 = new Car1("자가용");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println();
		
		Car1 car4=new Car1("자가용","빨강"); 
		System.out.println("car4.company : "+car4.company);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println();
		
		Car1 car5=new Car1("택시","검정",200); 
		System.out.println("car5.company : "+car5.company);
		System.out.println("car5.model : "+car5.model);
		System.out.println("car5.color : "+car5.color);
		System.out.println("car5.color : "+car5.maxSpeed);
		System.out.println();
	}
}
