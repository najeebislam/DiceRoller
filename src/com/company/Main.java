package com.company;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        Random diceThrow = new Random();
        System.out.println("How many sides does your dice have?");
        int noOfSides = input.nextInt();

        ArrayList<Integer> DiceTable = new ArrayList<Integer>();


        System.out.println("How many times do you want to roll your dice?");
        int numOfRolls = input.nextInt();

        while (numOfRolls > 0) {
            int randNumber = diceThrow.nextInt(noOfSides) +1;     //action of rolling dice
            DiceTable.add(randNumber);
            System.out.println(DiceTable);
            numOfRolls --;


        }






    }
}
