package com.Hw4;

import java.util.Scanner;

public class IntArray {

    Scanner input = new Scanner(System.in);

    private int[] array = new int[0];
    private int count;

    {
        int choice;
        while (true) {
            System.out.print("1->addElement  2->findElement  3->removeElement  4->printAllElements  5->Exit : ");
            choice = input.nextInt();
            if (choice == 1)
                addElement();
            else if (choice == 2)
                findElement();
            else if (choice == 3)
                removeElement();
            else if (choice == 4)
                printArrayElements();
            else if (choice == 5)
                break;
        }
    }


    public void printArrayElements() {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public void addElement() {
        while (true) {
            System.out.print("Enter new element or (-1 : Exit) : ");
            int element = input.nextInt();

            if (element == -1)
                break;

            else if (array.length == count) {
                int[] newArr = new int[count + 1];
                for (int i = 0; i < count; i++) {
                    newArr[i] = array[i];
                }
                array = newArr;
            }
            array[count++] = element;
        }
    }

    public void findElement() {
        int element;
        int elementIndex = -1;
        System.out.print("Enter element : ");
        element = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                elementIndex = i;
        }
        if (elementIndex >= 0)
            System.out.print("element find at " + elementIndex + " index\n");
        else
            System.out.print("Dont find\n");
    }

    public void removeElement() {
        int element;
        int[] newArray = new int[array.length];
        System.out.print("Enter element : ");
        element = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("Deleted");
                continue;
            } else {
                newArray[i] = array[i];
            }
        }
        for (int j = 0; j < newArray.length - 1; j++) {
            array[j] = newArray[j];
        }
    }

}




