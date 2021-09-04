package com.company;

public class Main {

    public static void main(String[] args) {

        //Variables of first time
        int hour = 13;
        int minute = 44;
        int second = 59;

        //Variables of second time
        int hour2 = 13;
        int minute2 = 59;
        int second2 = 46;

        //Doubles and a single integer calculating specific variables
        double totalsec = (hour * 3600) + (minute * 60 + second );
        double totalday = 24 * 3600;
        double remainday = totalday - totalsec;
        double percentageday = (totalsec / totalday) * 100;
        int deltatime = ((hour2 - hour) * 3600) + ((minute2 - minute) * 60) + (second2 - second);

        //System output
        System.out.println(totalsec + " seconds has passed since midnight.");
        System.out.println(remainday + " seconds left of today.");
        System.out.println(percentageday + "% of the day have passed");
        System.out.println("Elapsed time since start of coding: " + deltatime + " seconds.");

        //if and else statements to calculate time in hours, minutes and seconds.
        if (minute > minute2) {
            hour2 = hour2 - 1;
            minute2 = minute2 + 60;
            if (second > second2) {
                minute2 = minute2 - 1;
                second2 = second2 + 60;
            }
        }
        else{
            if (second > second2) {
                minute2 = minute2 - 1;
                second2 = second2 + 60;
            }
        }

        //Print time passed in hours, minutes and seconds
        System.out.println((hour2 - hour) + " hours, " + (minute2 - minute) + " minutes and " + (second2 - second) + " seconds has passed.");
    }
}
