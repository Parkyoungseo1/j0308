package t10_abstractEx;

//@SuppressWarnings("unused") 경고를 없앨수 있으나 프로그램 다짜고 하기
public abstract class Bonsa {
	private String shopName;
	public int kimchi;
	public int  budae;
	public int  bibim;
	public int  sudae;
	public int  konggi;
	
	public Bonsa(String string, int i, int j, int k, int l, int m) {
		// TODO Auto-generated constructor stub
	}
	public abstract void kimchi();
	public abstract void budae();
	public abstract void bibim();
	public abstract void sudae();
	public abstract void konggi();
	
	public void getShopName() {
		System.out.println("점포명 : " + shopName);
	}
}
