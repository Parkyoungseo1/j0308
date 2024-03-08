package t3_override;
// 부모 메소드를 재정의 해서 사용하는게 오버라이드, 그대로 가져와서 사용해도 오버라이드
public class Cc extends Aa {
	// 원넓이
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이? " + area);
//	}
	// 원넓이
//	public void areaCircle(int r) {
//		double area = r * r * 3.14;
//		System.out.println("반지름 "+r+"인 원넓이? " + area);
//	}
	// 오버라이딩의 위반 // 선언부부터 싹다 같아야 오버라이드
	public void areaCircle2(int r) {
		double area = r * r * 3.14;
		System.out.println("반지름 "+r+"인 원넓이? " + area);
	}
}
