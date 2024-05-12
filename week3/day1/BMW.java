package week3.day1;

public class BMW extends Car{
	public void applyGear() {
		System.out.println("Reverse Gear applied -> From BMW class");
	}
	
	
	public void soundProof() {
		System.out.println("Sound Proof  -> From BMW class");
	}
	
	public static void main(String[] args) {
		
		BMW bm = new BMW();
		bm.applyBrake();
		bm.applySoundHorn();
		bm.applyGear();
		bm.turnOnAccelerator();
		bm.soundProof();
		
		Car cr = new Car();
		cr.applyGear();
		
	}

}
