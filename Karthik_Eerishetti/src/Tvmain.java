package Assignment;

public class Tvmain {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.volume = 5;
        tv.channel= String.valueOf(72);
        System.out.println("volume of Tv:"+ tv.volume);
        System.out.println("change of channel:"+ tv.channel);

        Increase increase = new Increase();
        increase.increaseVolume();
        Decrease decrease = new Decrease();
        decrease.decreaseVolume();





    }
}
