package chapter3;



public class ClockDriver {
    public static void main(String[] args) {
        Clock clock = new Clock(23,59,59);
        System.out.println(clock.displayTime());
    }
}

