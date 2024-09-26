package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        double tipAmount = Math.round((cost * (percent * 0.01)) * 100) / 100.0; // tip amount; multiplies the initial cost by tip percentage and rounds it to the nearest hundredths place
        // I learned how to round to 2 decimal places from here: https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        double totalCost = cost + tipAmount; // total bill including tip; adds the tip amount + initial cost to get total cost
        double costPerPersonBeforeTip = Math.round((cost / people) * 100) / 100.0; // how much each person pays before tip; divides initial cost by number of people and rounds to the nearest hundredths place
        double tipPerPerson = Math.round((tipAmount / people) * 100) / 100.0; // how much each person has to tip; divides tip amount by number of people and rounds to the nearest hundredths
        double totalCostPerPerson = Math.round(((cost + (cost * (percent * 0.01))) / people) * 100) / 100.0; // how much each person has to pay for the total bill including tips; adds initial cost + tip amount and rounds to the nearest hundredths
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: " + "$" + tipAmount + "\n");
        result.append("Total Bill with tip: " + "$" + totalCost + "\n");
        result.append("Per person cost before tip: " + "$" + costPerPersonBeforeTip + "\n");
        result.append("Tip per person: " + "$" + tipPerPerson + "\n");
        result.append("Total cost per person: " + "$" + totalCostPerPerson + "\n");
        result.append("-------------------------------\n");

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
