package Interface;

  class Remote {
    void turnOn();
    void turnOff();
}
class TvRemote implements Remote {
    public void turnOn() {
        System.out.println("TV Remote: Turning on TV");
    }
    @Override
    public void turnOff() {
        System.out.println("TV Remote: Turning off TV");
    }
}
class ACRemote implements Remote {
    public void turnOn() {
        System.out.println("AC Remote: Turning on AC");
    }
    public void turnOff() {
        System.out.println("AC Remote: Turning off AC");
    }
}
class ProjectorRemote implements Remote {
    @Override
    public void turnOn() {
        System.out.println("Projector Remote: Turning on Projector");
    }
    public void turnOff() {
        System.out.println("Projector Remote: Turning off Projector");
    }
}
public class Remote {
    public static void main(String[] args) {
        TvRemote tvRemote = new TvRemote();
        tvRemote.turnOn();
        tvRemote.turnOff();
        ACRemote acRemote = new ACRemote();
        acRemote.turnOn();
        acRemote.turnOff();
        ProjectorRemote projectorRemote = new ProjectorRemote();
        projectorRemote.turnOn();
        projectorRemote.turnOff();
    }
}
