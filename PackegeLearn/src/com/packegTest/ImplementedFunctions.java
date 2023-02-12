package com.packegTest;

import com.LearnPackegeTesting.CommonFunctions;

import java.util.Calendar;

public class ImplementedFunctions extends CommonFunctions {

    private String userName;
    private Integer userAge;

    public ImplementedFunctions(String userName, Integer userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }


    @Override
    public void printMyName(String s) {
        System.out.println("My name is " + s);
    }

    @Override
    public void howOldAmI(Integer year) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (year < currentYear) System.out.println("Your age is : " + (currentYear - year));
        else {
            System.out.println("Wrong input.");
        }

    }
}
