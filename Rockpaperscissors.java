/*
  Rock Paper Scissor Game
*/

import java.util.Scanner;
import java.util.Random;

public class Rockpaperscissors {
    public static void main(String[] args) {

        String Player_turn; //User's input
        String Computer_turn=""; //Computer's input
        int Computer_no;
        String response;

        Scanner res = new Scanner(System.in);
        Random num = new Random();

        System.out.println("Hey, Human let's play Rock Paper Scissor");
        System.out.println("Enter your choice\n" + "Rock='R' , Paper='P' , Scissor='S' ");

        Computer_no = num.nextInt(3)+1; //Generate computer input

        /*
          Translating computer input using condition statements
        */
        if(Computer_no==1){
            Computer_turn="R";
        }
        else if(Computer_no==2){
            Computer_turn="P";
        }
        else if(Computer_no==3){
            Computer_turn="S";
        }

        /*
        Getting player input which is stored in string
        */
        System.out.println("Enter your turn: ");
        Player_turn = res.next();

        Player_turn = Player_turn.toUpperCase(); //Converting players turn to uppercase

        System.out.println("Computer turn: "+Computer_turn);

        //Use nested loops to see who wins
        //If both choose same
        if (Player_turn.equals(Computer_turn))
            System.out.println("It is a tie!");
        //If player choose rocks
        else if (Player_turn.equals("R"))
            if (Computer_turn.equals("S"))
                System.out.println("Rock crushes Scissors! Human win!!");
            else if (Computer_turn.equals("P"))
                System.out.println("Paper catches Rock! Computer win!!");
        //If player choose papers
            else if (Player_turn.equals("P"))
                if (Computer_turn.equals("S"))
                    System.out.println("Scissor cuts Paper in two halves! Computer win!!");
                else if (Computer_turn.equals("R"))
                    System.out.println("Paper catches Rock. Human win!!");
            //If player choose scissors
                else if (Player_turn.equals("S"))
                    if (Computer_turn.equals("P"))
                        System.out.println("Scissor cuts Paper in two halves. Human win!!");
                    else if (Computer_turn.equals("R"))
                        System.out.println("Rock crushes Scissor! Computer win!!");
                    else
                        System.out.println("Invalid user input.");
    }
}