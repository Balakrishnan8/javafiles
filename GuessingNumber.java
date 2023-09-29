import java.util.Random;
import java.util.Scanner;

class GuessingNumber
{
public static void main(String [] args)
{

Scanner sc = new Scanner(System.in);
String play = "yes";
while(play.equals("yes"))
{
int guess = -1;
int tries = 0;
Random r = new Random();
int number = r.nextInt(100);
while(guess!=number)
{
System.out.print("Guess any number from 1 to 100 : ");
guess = sc.nextInt();
tries++;
if(guess==number)
{
System.out.println("Your guess is matched");
System.out.println("Total number of attempt: "+tries);
System.out.print("Do you want to continue? (yes/no)");
play = sc.next().toLower();
}
else if(guess>number)
{
System.out.println("You guess is greater than the number");
System.out.println("try less than "+guess);
}
else
{
System.out.println("You guess is less than the number");
System.out.println("try greater than "+guess);
}
}
}

sc.close();

}
}