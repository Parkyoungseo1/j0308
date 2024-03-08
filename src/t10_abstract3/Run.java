package t10_abstract3;

public class Run {
	public static void main(String[] args) {
		Phone samsungPhone = new Samsung("홍길동");
		samsungPhone.powerOn();
		samsungPhone.sound();
		samsungPhone.funtion();
		samsungPhone.funtionSamsung();
		samsungPhone.powerOff();
		System.out.println();
		
		Phone lgPhone = new Lg("김말숙");
		lgPhone.powerOn();
		lgPhone.sound();
		lgPhone.funtion();
		lgPhone.funtionLg();
		lgPhone.powerOff();
		System.out.println();
	}
}
