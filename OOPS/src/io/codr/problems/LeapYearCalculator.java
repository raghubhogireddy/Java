package io.codr.problems;

public class LeapYearCalculator {
    public static void main(String[] args){
        boolean isLeapYear = isLeapYear(366);
        System.out.println(isLeapYear);
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year<= 9999){
            if(year/4 == 0)
                if(year/100 == 0)
                    if(year/400 == 0)
                        return true;
                    else return false;
                else return true;
            else return false;
        }else return false;
    }
}
