package TrainingSet4;

class Remote {
 private boolean isOn;

 public Remote() {
     this.isOn = false;
 }

 public void turnOn() {
     isOn = true;
     System.out.println("Remote is ON");
 }

 public void turnOff() {
     isOn = false;
     System.out.println("Remote is OFF");
 }

 public boolean isOn() {
     return isOn;
 }
}

class TVRemote extends Remote {
 private int channel;
 private int volume;

 public TVRemote() {
     super();
     this.channel = 1;
     this.volume = 50;
 }

 public void increaseChannel() {
     if (isOn()) {
         channel++;
         System.out.println("Increased TV channel to " + channel);
     } else {
         System.out.println("TV is OFF");
     }
 }

 public void decreaseChannel() {
     if (isOn() && channel > 1) {
         channel--;
         System.out.println("Decreased TV channel to " + channel);
     } else {
         System.out.println("TV is OFF or already on the lowest channel");
     }
 }

 public void increaseVolume() {
     if (isOn() && volume < 100) {
         volume++;
         System.out.println("Increased TV volume to " + volume);
     } else {
         System.out.println("TV is OFF or volume is already at the maximum");
     }
 }

 public void decreaseVolume() {
     if (isOn() && volume > 0) {
         volume--;
         System.out.println("Decreased TV volume to " + volume);
     } else {
         System.out.println("TV is OFF or volume is already at the minimum");
     }
 }
}

class ACRemote extends Remote {
 private int temperature;
 private String mode;

 public ACRemote() {
     super();
     this.temperature = 25;
     this.mode = "Cool";
 }

 public void increaseTemperature() {
     if (isOn() && temperature < 30) {
         temperature++;
         System.out.println("Increased AC temperature to " + temperature);
     } else {
         System.out.println("AC is OFF or temperature is already at the maximum");
     }
 }

 public void decreaseTemperature() {
     if (isOn() && temperature > 16) {
         temperature--;
         System.out.println("Decreased AC temperature to " + temperature);
     } else {
         System.out.println("AC is OFF or temperature is already at the minimum");
     }
 }

 public void changeMode(String newMode) {
     if (isOn()) {
         mode = newMode;
         System.out.println("Changed AC mode to " + mode);
     } else {
         System.out.println("AC is OFF");
     }
 }
}

class ProjectorRemote extends Remote {
 private int brightness;

 public ProjectorRemote() {
     super();
     this.brightness = 50;
 }

 public void increaseBrightness() {
     if (isOn() && brightness < 100) {
         brightness++;
         System.out.println("Increased Projector brightness to " + brightness);
     } else {
         System.out.println("Projector is OFF or brightness is already at the maximum");
     }
 }

 public void decreaseBrightness() {
     if (isOn() && brightness > 0) {
         brightness--;
         System.out.println("Decreased Projector brightness to " + brightness);
     } else {
         System.out.println("Projector is OFF or brightness is already at the minimum");
     }
 }
}

class TVRemoteCompanyA extends TVRemote {
 private String specialFeatureA;

 public TVRemoteCompanyA() {
     super();
     this.specialFeatureA = "Company A Special Feature";
 }

 public void displaySpecialFeatureA() {
     System.out.println("TV Remote Company A: " + specialFeatureA);
 }
}

//AC Remote of Company B extends AC Remote
class ACRemoteCompanyB extends ACRemote {
 private String specialFeatureB;

 public ACRemoteCompanyB() {
     super();
     this.specialFeatureB = "Company B Special Feature";
 }

 public void displaySpecialFeatureB() {
     System.out.println("AC Remote Company B: " + specialFeatureB);
 }
}

class ProjectorRemoteCompanyC extends ProjectorRemote {
 private String specialFeatureC;

 public ProjectorRemoteCompanyC() {
     super();
     this.specialFeatureC = "Company C Special Feature";
 }

 public void displaySpecialFeatureC() {
     System.out.println("Projector Remote Company C: " + specialFeatureC);
 }
}

public class RemoteControlProgram {
 public static void main(String[] args) {
     TVRemote myTVRemote = new TVRemote();
     myTVRemote.turnOn();
     myTVRemote.increaseChannel();
     myTVRemote.decreaseVolume();
     myTVRemote.turnOff();
     
     ACRemote myACRemote = new ACRemote();
     myACRemote.turnOn();
     myACRemote.increaseTemperature();
     myACRemote.changeMode("Heat");
     myACRemote.turnOff();
     
     ProjectorRemote myProjectorRemote = new ProjectorRemote();
     myProjectorRemote.turnOn();
     myProjectorRemote.increaseBrightness();
     myProjectorRemote.decreaseBrightness();
     myProjectorRemote.turnOff();
     
     TVRemoteCompanyA tvRemoteCompanyA = new TVRemoteCompanyA();
     tvRemoteCompanyA.turnOn();
     tvRemoteCompanyA.displaySpecialFeatureA();
     tvRemoteCompanyA.turnOff();

     ACRemoteCompanyB acRemoteCompanyB = new ACRemoteCompanyB();
     acRemoteCompanyB.turnOn();
     acRemoteCompanyB.displaySpecialFeatureB();
     acRemoteCompanyB.turnOff();

     ProjectorRemoteCompanyC projectorRemoteCompanyC = new ProjectorRemoteCompanyC();
     projectorRemoteCompanyC.turnOn();
     projectorRemoteCompanyC.displaySpecialFeatureC();
     projectorRemoteCompanyC.turnOff();
 }
}

