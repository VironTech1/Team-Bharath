package TrainingSet4;

public class TV {
	int volume;
	String channel;
	
	public TV(int volume, String channel) {
		this.volume = volume;
		this.channel = channel;
	}
	
	public int increaseVolume(int volume, int increasedVolume) {
		System.out.println("New Volume after increase: "+ (volume+increasedVolume));
		return volume+increasedVolume;
	}
	public int decreaseVolume(int volume, int decreasedVolume) {
		System.out.println("New Volume after increase: "+ Math.max(0, (volume-decreasedVolume)));
		return Math.max(0, (volume-decreasedVolume));
	}
	public void changeChannel(String newChannel) {
		System.out.println("New channel: "+newChannel);
	}
	
	public static void main(String[] args) {
		int volume = 40;
		String channel = "Maa";
		TV tv = new TV(volume, channel);
		volume = tv.increaseVolume(volume, 20);
		volume = tv.decreaseVolume(volume, 30);
		volume = tv.decreaseVolume(volume, 80);
		tv.changeChannel("Zee");
	}

}
