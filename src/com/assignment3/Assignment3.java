package com.assignment3;
import java.util.*;
import java.io.IOException;

class Guesser
{
    int guessNum;

    int guessNum()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser kindly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}
class Player
{
    int guessNum;

    int guessNum() throws IOException
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player kindly guess the number");
        long start=System.currentTimeMillis();
        while(System.currentTimeMillis()-start < 5000) {
            if(System.in.available() > 0)
            {
                guessNum=scan.nextInt();
                break;
            }
        }
        return guessNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessNum();
    }
    void collectNumFromPlayers() throws IOException
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessNum();
        numFromPlayer2=p2.guessNum();
        numFromPlayer3=p3.guessNum();
    }
    void compare()
    {

        System.out.println("================================");
        if(numFromPlayer1 == 0) {
            System.out.println("Player1 input timeout...");
        }else {
            System.out.println("Player1 input:" + numFromPlayer1);
        }
        if(numFromPlayer2 == 0) {
            System.out.println("Player2 input timeout...");
        }else {
            System.out.println("Player2 input:" + numFromPlayer2);
        }
        if(numFromPlayer3 == 0) {
            System.out.println("Player3 input timeout...");
        }else {
            System.out.println("Player3 input:" + numFromPlayer3);
        }

        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println("All players won the game");
            }
            else if(numFromGuesser==numFromPlayer2 )
            {
                System.out.println("Player 1 & Player2 won");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 1 & Player3 won");
            }
            else
            {
                System.out.println("Player 1 won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer2)
        {
            if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 2 & Player3 won");
            }
            else
            {
                System.out.println("Player 2 won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player 3 won the game");
        }
        else
        {
            System.out.println("Game lost Try Again!");
        }

    }

}
public class Assignment3
{
    public static void main(String[] args) throws IOException {
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();


    }

}