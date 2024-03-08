package t8_polymorphism;

public class Cc extends Aa{
	public int su =30;
	
	public Cc() {
		System.out.println("이곳은 Cc 기본 생성자 입니다. ");
	}
	
	public void modCc() {
		System.out.println("이곳은 Cc 클래스의 modCc메소드 입니다. ");
	}
	
	@Override
	public void modAa() {
		System.out.println("이곳은 Cc클래스의 modAa메소드입니다.");
	}

	@Override
	public void modHh(int a, int b) {
		System.out.println("두수의 합은? " +  (a+b));
	}
	
}
