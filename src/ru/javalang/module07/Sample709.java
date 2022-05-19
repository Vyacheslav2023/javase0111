package ru.javalang.module07;

import java.sql.Time;

public class Sample709 extends Time {
    public Sample709(long time) {
        super(time);
    }

    public String current(){
        long hours = getHours();
        if(hours >= 4 && hours < 12) return "утро";
        else if ((hours >12 && hours < 17)) return "день";
        else if (hours >= 17 && hours < 23) return "вечер";
        else return "ночь";
    }
    public static void main(String[] args){
        Sample709 mytime = new Sample709(300000000);
        System.out.println(mytime.current());
    }
}
