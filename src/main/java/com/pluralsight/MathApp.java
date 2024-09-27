package com.pluralsight;

public class MathApp {
    public static void main(String[] args){
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        int bobSalary = 100000;
        int garySalary = 50000;

        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        int carPrice = 47338;
        int truckPrice = 65713;

        int lowestVehiclePrice = Math.min(carPrice, truckPrice);
        System.out.println("Lowest vehicle price is " + lowestVehiclePrice);

        //Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("The area of a circle whose radius is 7.25 is " + area);


        //Find and display the square root a variable after it is set to 5.0
        double number = 5.0;
        double sqrt = Math.sqrt(number);
        System.out.println("square root of 5.0 is " + sqrt);


        //Find and display the distance between the points (5, 10) and (85, 50)
        int x = 5;
        int y = 10;
        int x2 = 85;
        int y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
        System.out.println("The distance between (5, 10) and (85, 50) is " + distance);


        //Find and display the absolute (positive) value of a variable after it is set to -3.8
        double val = -3.8;
        double absoluteValue = Math.abs(val);
        System.out.println("The absolute value of " + val + " is " + absoluteValue);


        //Find and display a random number between 0 and 1
        double randomNumber = Math.random();
        System.out.println("A random number between 0 and 1 is " + randomNumber);
    }
}
