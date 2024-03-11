package t11_interface2;

public class RemoteRun2 {
	public static void main(String[] args) {
//		Remote audio = new Audio();
//		Remote tv =  new tv();
//		
		Remote[] remotes = { new Audio(),  new Tv()};
		String[] titles = {"Audio", "Tv"};
		
		for(int i=0; i<remotes.length; i++) {
			remotes[i].switchOn();
			remotes[i].remoteNmae(titles[i]);
			remotes[i].switchOff();
			System.out.println();
		}
		
//		audio.switchOn();
//		audio.remoteNmae("audio");
//		audio.switchOff();
//		System.out.println();
//		
//		tv.switchOn();
//		tv.remoteNmae("tv");
//		tv.switchOff();
	}
}
