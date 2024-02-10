public class Meeting {
    String url;
    String time;
    String host;
    Participant participant;

    Meeting(String ur, String tim, String hst, Participant participant) {
        this.url = ur;
        this.time = tim;
        this.host = hst;
        this.participant = participant;
    }

    void getDetails() {
        System.out.println("**************************************************");
        System.out.println("Meeting URL: " + url);
        System.out.println("Time: " + time);
        System.out.println("Host: " + host);
        System.out.println("Participant ID: " + participant.stdId);
        System.out.println("Participant Name: " + participant.name);
        System.out.println("Participant Phone: " + participant.phone);
    }
}

class Participant {
    int stdId;
    String name;
    long phone;

    Participant(int Id, String Name, long Phone) {
        stdId = Id;
        name = Name;
        phone = Phone;
    }
}

class MeetingMain {
    public static void main(String[] args) {
        Participant p1 = new Participant(1001, "Lakshmi", 905902107);
        Meeting m1 = new Meeting("zoom.com", "10:20", "Sam", p1);
        m1.getDetails();
        
        Participant p2 = new Participant(1002, "Ram", 905902828);
        Meeting m2 = new Meeting("googlemeet.com", "11:00", "Saran", p2);
        m2.getDetails();
    }
}
