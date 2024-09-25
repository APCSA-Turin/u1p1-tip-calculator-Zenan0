package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        double tipAmount = Math.round((cost * (percent * 0.01)) * 100) / 100.0; // calculates the tip amount
        // I learned how to round to 2 decimal places from here: https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        double totalCost = cost + tipAmount; // calculates the total bill including tip
        double costPerPersonBeforeTip = Math.round((cost / people) * 100) / 100.0; // calculates how much each person pays before tip
        double tipPerPerson = Math.round((tipAmount / people) * 100) / 100.0; // calculates how much each person has to tip
        double totalCostPerPerson = totalCost / people; // calculates how much each person has to pay for the total bill including tips
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%");
        result.append("Total tip: " + "$" + tipAmount);
        result.append("Total Bill with tip: " + "$" + totalCost);
        result.append("Per person cost before tip: " + "$" + costPerPersonBeforeTip);
        result.append("Tip per person: " + "$" + tipPerPerson);
        result.append("Total cost per person: " + "$" + totalCostPerPerson);
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
