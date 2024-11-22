package Rock_paper_Scissor;

import java.util.Random;
import java.util.Scanner;

public class Rock {
    public static void main(String[] args) {
        int user, computer;
       int rock=0;
       int paper=1;
       int scissor=2;
        Scanner sc = new Scanner(System.in);
        user=sc.nextInt();
        Random r = new Random();
        System.out.println("ROCK PAPER SCISSOR GAME");
        System.out.println("Enter your choice (0=rock,1=paper,2=scissor)");
        while (user > 2) {
            System.out.println("enter num btwn o  to 2");
            user = sc.nextInt();
        }if(user == rock){
            System.out.println("user Rock");
        } else if (user==paper) {
            System.out.println("user paper");
        }else{
            System.out.println("user  Scissor");
        }
        computer = r.nextInt(3);
        if (computer==rock){
            System.out.println("computer rock");
        }else if (computer==paper){
            System.out.println("computer paper");
        }else{
            System.out.println("computer  Scissor");
        }
        while (user==computer){
            System.out.println("try again");
        }
        user= sc.nextInt();
        while(user>2){
            System.out.println("give number between 0 and 2");
            user = sc.nextInt();

        }
        computer = r.nextInt(3);
        if (user ==rock){
            System.out.println("User chose ROCK");
        } else if (user==paper) {
            System.out.println("User chose PAPER");
        }else {
            System.out.println("User chose SCISSORS");
        }
        if (computer==rock){

            System.out.println("Computer chose ROCK");
        } else if (computer==paper) {
            System.out.println("Computer chose PAPER");

        }else{
            System.out.println("Computer chose SCISSORS");
        }
        if (computer==rock){
            if (user==paper){
                System.out.println("User wins!");
            }else {
                System.out.println("Computer wins!");
            }
        } else if (computer==paper) {
            if (user ==paper){
                System.out.println("User wins!");
            }else{
                System.out.println("Computer wins!");
            }
        } else if (user==rock) {
            System.out.println("User wins!");
        }else {
            System.out.println("Computer Wins");
        }
    }
    }