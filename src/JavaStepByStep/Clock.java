package JavaStepByStep;

public class Clock {
    int hour;
    int minute;

    @Override
    public String toString(){
        return String.format("Time is %2d:%2d",hour,minute);
    }
}
