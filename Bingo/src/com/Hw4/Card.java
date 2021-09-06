package com.Hw4;

import java.security.SecureRandom;

public class Card {
    int[][] numbers = new int[3][5];
    SecureRandom random = new SecureRandom();


    // find entered number and replace with zero instead of mark
    public void markCellCard(int number) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == number) {
                    numbers[i][j] = 0;// if find
                }
            }
        }
    }

    // check rows and count matched numbers
    public boolean checkRow() {
        boolean win = false;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == 0) {
                    count++;
                } else if (j == 2 && count == 0)
                    break;
            }
            if (count == 5)
                win = true;
        }
        return win;
    }

    // create random numbers for cards
    public void setNumbersOnCard() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = 1 + random.nextInt(91);
            }
        }
    }
    // show numbers on card
    public void printNumberOnCard() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
