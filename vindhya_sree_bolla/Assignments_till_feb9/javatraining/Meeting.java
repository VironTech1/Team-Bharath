package javatraining;
import java.sql.Time;
import java.util.Arrays;

class Participant{
	String name;
	String phone;
	String address;
	@Override
	public String toString() {
		return "Participant [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
}

public class Meeting {
	String url;
	String meetingTime;
	String host;
	Participant participant;
	
	@Override
	public String toString() {
		return "Meeting [url=" + url + ", meetingTime=" + meetingTime + ", host=" + host + ", participant="
				+ participant + "]";
	}

	public static void main(String[] args) {
		Meeting meeting = new Meeting();
		meeting.participant = new Participant();
		meeting.participant.name = "Vindhya";
		meeting.participant.phone = "9843779999";
		meeting.participant.address = "654 Brkpne Trl, Apex, 27523";	
		meeting.url = "http://somemeeting.zoom.com";
		meeting.meetingTime = "13:00";
		meeting.host = "John";
		System.out.println(meeting);
	}

}
