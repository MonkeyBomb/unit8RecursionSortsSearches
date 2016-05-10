 

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        int numSticks = 21;
        int numToTake = 0;

        Scanner reply = new Scanner (System.in);
        Scanner input = new Scanner (System.in);
        Scanner take = new Scanner (System.in);

        System.out.println("The game is \"21 Sticks\", are you ready to play? (Y/n)");
        String ready = reply.nextLine();

        if (ready.equals("y") || ready.equals("Y")) {
            System.out.println("Let's play!");}

      

        System.out.println("Would you like to go first? (Y/n)");
        String goFirst = input.nextLine();

    }}