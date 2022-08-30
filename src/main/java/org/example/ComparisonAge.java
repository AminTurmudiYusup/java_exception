package org.example;

public class ComparisonAge {

    public static int compareAge(int age) throws AgeException {
        if (age<18)//error occurs when age <18
            throw new AgeException("You are not old enough to legally driver");//method create exception object
        return age;
    }

    public static int divideBy(int var1, int var2) throws NumberException {
        if (var2==0)
            throw new NumberException("can't divide by 0");
        return var1/var2;
    }
}
