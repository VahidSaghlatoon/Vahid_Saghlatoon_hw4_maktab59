package com.Hw4;

import java.util.Scanner;

public class Bingo {
//    private int numberOfPlayers ;
    Scanner input = new Scanner(System.in);
    private Player[] players = new Player[3];
    static int counter = 0;

    public void addPlayer() {
        players[counter++] = new Player();
    }

    public Player[] getPlayers() {
        return players;
    }

    public void readyPlayerAndCard()
    {
        //create new player
        for (int i = 0; i < getPlayers().length; i++) {
            addPlayer(); // add new player
            getPlayers()[i].setName("Player " + (i + 1));//set new player name
            //create card for new player and set number on every card
            getPlayers()[i].addCard();
            getPlayers()[i].getCards()[0].setNumbersOnCard();
            System.out.println(getPlayers()[i].getName());
            getPlayers()[i].getCards()[0].printNumberOnCard();
        }
    }

    public void play()
    {

        int number ;
        while (true){
            System.out.print("Enter random number or (-1)-> Exit : " );
            number = input.nextInt();
            if (number >0)
            {
                for (int i = 0; i < players.length ; i++) {
                    getPlayers()[i].getCards()[0].markCellCard(number);//if number be on card mark
                    System.out.println(getPlayers()[i].getName());
                    getPlayers()[i].getCards()[0].printNumberOnCard();
                    //if find row with 5 entered number player win
                    if(getPlayers()[i].getCards()[0].checkRow())
                        System.out.println(getPlayers()[i].getName() +" WIN");
                }
            }
            else if (number==-1)
                break;
        }
    }
}
