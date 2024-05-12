package week3.day1;

public class Car extends Vehicle{
	public void applyGear() {
		System.out.println("Gear applied -> From Car class");
	}
	public void turnOnAccelerator() {
		System.out.println("Accelerate -> From Car class");
	}

	public static void main(String[] args) {

		Car cr = new Car();
		cr.applyBrake();
		cr.applySoundHorn();
		cr.applyGear();
		cr.turnOnAccelerator();
		

	}

}
