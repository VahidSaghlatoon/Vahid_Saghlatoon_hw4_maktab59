package com.Hw4;

public class Main {

    public static void main(String[] args) {
        //Question1
//        sumOfDigitsNumber();
        //Question2
//        IntArray numbers = new IntArray();
        //Question3
//        buyStock();

    }

    //Question1
    public static void sumOfDigitsNumber() {
        int number = 13574532;//int number
//        int number = 1357453297;
        String strNumber = String.valueOf(number);//change int number to string
        int sumOfDigits = 0; // sum of digits
        while (true) {
            for (int i = 0; i < strNumber.length(); i++) {
                sumOfDigits += (strNumber.charAt(i) - '0');
            }
            if (sumOfDigits >= 10) {
                strNumber = String.valueOf(sumOfDigits);
                sumOfDigits = 0;
            } else
                break;
        }
        System.out.println("sum of digits for your number is : " + sumOfDigits);
    }
    //Question3
    public static void buyStock() {
        int[] prices = {7, 1, 5, 3, 6, 4};
//        int[] prices = {7, 1, 5, 1, 6, 4};
//        int[] prices = {7, 2, 5, 3, 6, 1};
        int minStockPrice = prices[0];
        int minStockDay = 0;
        int profit;
        for (int i = 0; i < prices.length; i++) {
            if (minStockPrice > prices[i]) {
                minStockPrice = prices[i];
                minStockDay = i;
            }
        }
        int maxStockPrice = prices[minStockDay];
        int maxStockDay = 0;
        for (int i = minStockDay + 1; i < prices.length; i++) {
            if (prices[i] > maxStockPrice) {
                maxStockPrice = prices[i];
                maxStockDay = i;
            }
        }
        if (maxStockPrice > minStockPrice) {
            profit = maxStockPrice - minStockPrice;
            System.out.println("Buy on day " + (minStockDay + 1) + " and sell on day " + (maxStockDay + 1) + " profit is : " + profit);
        } else
            System.out.println("profit is 0");
    }

}
