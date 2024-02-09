package Assignmnets;

public class TV1 extends TV {

	@Override
	void changeChannel(int channel) {
		
		System.out.println("Change the Channel"+channel);	
		
	}

	@Override
	void increaseVolume(int incvolume) {
		
		System.out.println("Increas the volume"+incvolume);
	}

	@Override
	void decreaseVolume(int decvolume) {
		
		System.out.println("Decrease the volume"+decvolume);
				
	}

}
