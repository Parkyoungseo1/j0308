package t2_inheritance;

public class Bb extends Aa {
	int su = item1;
	
	public Bb() {
		System.out.println("이곳은 Bb클래스의 기본생성자");
	}
	
	public Bb(int su) {
		super(10);
		System.out.println("이곳은 Bb클래스의 사용자 정의 생성자1, su = " + su);
		// 생성자의 첫번째에 와야함 ->super(10);
	}
	
	public Bb(int item1, int x , int y) {
		super(item1, x, y);
	}
	
	// 사다리꼴의 면적
	public void areaPoly(int x, int y, int z) {
		int area = (x + y) * z / 2;
		System.out.println("사다리꼴의 면적(윗변: "+x+", 아래변: "+y+", 높이: "+z+") : " + area);
	}	
}
