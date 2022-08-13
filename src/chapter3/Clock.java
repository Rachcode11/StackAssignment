package chapter3;


public class Clock {

    private int hour;
    private int minute;
    private int second;
    private String time;
    //    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
//    private final Date date = new Date();
    public Clock(int hour, int minute, int second){

        if(hour > 23){
            this.hour = 0;
        }else{
            this.hour = hour;}

        if(minute > 59){
            this.minute = 0;
        }
        else{this.minute = minute;}

        if(second > 59){
            this.second = 0;
        }else{this.second = second;}



    }
    public void setHour(int hour){
        if(hour > 23){
            this.hour = 0;
        }else{
            this.hour = hour;}


    }
    public int getHour(){
        return hour;
    }
    public void setMinute(int minute){
        if(minute > 59){
            this.minute = 0;
        }
        else{this.minute = minute;}
    }
    public int getMinute(){
        return minute;
    }
    public void setSecond(int second){
        if(second > 59){
            this.second = 0;
        }else{this.second = second;}
    }
    public int getSecond(){
        return second;
    }

    public String displayTime() {
        return getHour()+":"+getMinute()+":"+getSecond();
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getTime(){
        return time;
    }
}

