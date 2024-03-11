package t11_interface2;

public class RemoteRun {
	public static void main(String[] args) {
		Audio audio = new Audio();
		Tv tv = new Tv();
		
		audio.switchOn();
		audio.remoteNmae("audio");
		audio.switchOff();
		System.out.println();
		
		audio.switchOn();
		audio.remoteNmae("tv");
		audio.switchOff();
	}
}
