package com.prince.java;

public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method

    public static int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public static int remainingMinutesInOven(int remainMinutes){
        return 40 - remainMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public static int preparationTimeInMinutes(int preparationTime){
        return 2 * preparationTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public static int totalTimeInMinutes(int preparationTime, int timeInMinute){
        return preparationTimeInMinutes(preparationTime) + timeInMinute;
    }


    public static void main(String[] args) {

        System.out.println(expectedMinutesInOven());
        System.out.println(remainingMinutesInOven(30));
        System.out.println(preparationTimeInMinutes(2));
        System.out.println(totalTimeInMinutes(3, 20));
    }
}
