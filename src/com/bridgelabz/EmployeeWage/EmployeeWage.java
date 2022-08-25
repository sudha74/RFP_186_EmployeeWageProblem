package com.bridgelabz.EmployeeWage;

public class EmployeeWage {
    static final int IS_PRESENT = 1;
    static final int IS_PART_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 16;
    static final int PART_TIME_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        int attendance = (int) (Math.floor(Math.random() * 10)) % 2;
        if (attendance == IS_PRESENT) {
            System.out.println("Employee is Working Full Time");
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee dailyWage is : " + dailyWage);
        } else if (attendance == IS_PART_TIME) {
            System.out.println("Employee is Working Part Time");
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee dailyWage is : " + dailyWage);
        } else {
            System.out.println("Employee is absent");
        }
    }
}
