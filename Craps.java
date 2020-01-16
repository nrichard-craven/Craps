
/**
 * Write a description of class Craps here.
 *
 * @author Nicholas Richard-Craven
 * @version 1-16-2020
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String response = "Y";
        System.out.println("Would you like instructions for how to play?(Y or N)");
        String response2 = in.nextLine();
        if (response2.equals("Y")) // ignore case 
        {
            System.out.println("You start by rolling two die.");
            System.out.println("If you roll a 7 or 11 you win. A 2,3,12 is a loss."); 
            System.out.println("If you get any other number,");
            System.out.println("you keep rolling and record the first number"); 
            System.out.println("you rolled."); 
            System.out.println("You keep rolling until you either roll a 7,");
            System.out.println("in which scenario, you lose,"); 
            System.out.println("or the same number you rolled originally,"); 
            System.out.println("in which scenario you win.");
        }
        else
        {
            System.out.println("Glad you already know!");                
        }
        while (response.equalsIgnoreCase("Y"))
        {
            System.out.println("Now press enter to roll the dice!");
            in.nextLine();
            Die a = new Die();
            int roll = a.doubleRoll();
            System.out.println("Your first roll is a " + roll + ".");
            if (roll == 7 || roll == 11)
            {
                System.out.println("You Win!");

            }
            else if (roll == 2 || roll == 3 || roll == 12)
            {
                System.out.println("You lost :(");

            }
            else
            {
                System.out.println("That number is your point!");
                System.out.println("Let's see if you can roll it again before you roll a 7!");
                System.out.println("Now press enter to roll the dice!");
                String response4 = in.nextLine();
                while (response4.equals(""))
                {                                
                    int roll2 = a.doubleRoll();
                    System.out.println("You rolled a " + roll2 + ".");
                    if (roll2 == roll)
                    {
                        System.out.println("You rolled your point! You won!");
                        break;
                    }
                    else if (roll2 == 7)
                    {
                        System.out.println("Oh shucks, you lost :(");
                        break;
                    }
                    System.out.println("Thats not your point. Press enter roll again!");
                    response4 = in.nextLine();
                }

            }
            System.out.println("Want to play again? (Y/n)");                
            response = in.nextLine();
            if (response.equals(""))
            {
                response = "Y";
            }
        }
        //goodbye message
    }
}
