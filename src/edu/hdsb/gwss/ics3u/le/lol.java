/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.le;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jefftruong
 */
public class lol {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)
   {
       Scanner keyboard = new Scanner(System.in);
       Random random = new Random();
       String cont = "n";
       char answer;
       int coin = 0;
       int totalEntered = 0;
       int a;
       int b;
       int c;
       int n;
       int amountWon = 0;
       int dubs = coin * 2;
       int trips = coin * 4;

       while (cont.equals("n"))
       {
           a = random.nextInt(6);
           b = random.nextInt(6);
           c = random.nextInt(6);
           n = random.nextInt(991) +10;
           totalEntered += coin;
           System.out.println("How much would you like to bet? ");
           coin = keyboard.nextInt();

           switch (a) 
           {
               case 0:
                   System.out.println("Cherry");
                   break;
               case 1:
                   System.out.println("Orange");
                   break;
               case 2:
                   System.out.println("Plum");
                   break;
               case 3:
                   System.out.println("Bell");
                   break;
               case 4:
                   System.out.println("Melon");
                   break;
               default:
                   System.out.println("Bar");
           }

           switch (b) 
           {
               case 0:
                   System.out.println("Cherry");
                   break;
               case 1:
                   System.out.println("Orange");
                   break;
               case 2:
                   System.out.println("Plum");
                   break;
               case 3:
                   System.out.println("Bell");
                   break;
               case 4:
                   System.out.println("Melon");
                   break;
               default:
                   System.out.println("Bar");
           }

           switch (c) 
           {
               case 0:
                   System.out.println("Cherry");
                   break;
               case 1:
                   System.out.println("Orange");
                   break;
               case 2:
                   System.out.println("Plum");
                   break;
               case 3:
                   System.out.println("Bell");
                   break;
               case 4:
                   System.out.println("Melon");
                   break;
               default:
                   System.out.println("Bar");
           }

           if (a != b && a != c && b != c)
           {
               System.out.println("You have won $0");
           }
           else if (a == b || a == c || b == c)
           {
               System.out.println("Congratulations, you have won $" + dubs);
                  amountWon += dubs;
           }
           else if (a == b && a == c && a != 0)
           {
               System.out.println("Congratulations, you have won $" + trips);
                  amountWon += trips;
           }
           else if (a == 0 && b == 0 && c == 0)
           {
               System.out.println("Congratulations! You have won the jackpot of $" 
                   + (coin * n));

           }

           System.out.println("Continue? y/n ");
           cont = keyboard.nextLine();
       }
   }
}
