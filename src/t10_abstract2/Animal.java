package t10_abstract2;

/* 추상클래스(팀작업을 위한 작업지시서)
  - 만드는 방법 : 클래스명 앞에 'abstract'를 붙여준다.
  - 의미 : 작업지시서로서의 역활을 한다. 따라서 작업에 필요한 공통적인 사항(필드, 메소드)를 정의만 한다.
    즉, 추상메소드명만 정의할뿐 실체내용은 기술하지 않는다.(실제로 사용할 코드를 적어주는 중괄호가 없다.)
  - 추상클래스는 생성(new)해서 사용할수 없다. 즉, 실제로 사용하려면 추상클래스를 상속(extends)받아서만 사용할 수 있다.(실체(구현)클래스)
  
 */
public abstract class Animal {
	public void sound() {}
	public void sori() {}
	public abstract void cry(); // 모든 동물의 울음소리 메소드를 cry()로 통일
}
