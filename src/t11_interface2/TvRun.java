package t11_interface2;

public class TvRun {
	public static void main(String[] args) {
		Tv tv = new Tv(); 
		
		System.out.println("Tv 최대 볼륨 : " + tv.MAX_VOLUME);
		System.out.println("Tv 최소 볼륨 : " + tv.MIN_VOLUME);
		System.out.println();
		
		tv.switchOn();
		tv.remoteNmae("Tv");
		tv.switchOff();
	}
}
