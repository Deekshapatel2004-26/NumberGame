package package1;
import java.util.Scanner;

public class NumberGame 
{
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		int chances=8;
		int finals=0;
		boolean playAgain =true;
		System.out.println("welcome Buddy");
		System.out.println("Hey Buddy you have about " + chances + " chances to win the game");
	while ( playAgain)
	{
		int rand=getrandN(1,100);
		boolean guess=false;
		for(int i=0;i<chances;i++){
		System.out.println("chances "+(i+1)+" Enter your guess:");
		int user=scanner . nextInt();
		if( user==rand)
		{
			guess= true;
			finals+=1;
			System.out.println("you won it.");
		break;}
	else if (user>rand)
	{
		System.out.println("Too High");}			
	else
	{
		System.out.println("Too Low");
				}}
	if (guess==false) 
	{
		System.out.println("Sorry buddy you are lost chances . The Number is "+ rand );
		}
		System.out.println("Do you want to play again (y/n)");
		String pA=scanner.next();
		playAgain=pA.equalsIgnoreCase("y");
		}
		System.out.println("That,s it Buddy , Hope you enjoyed it  ");
		System.out.println("Here is you Score "+finals);
		}
		
		public static int getrandN(int min,int max)
		{
			return (int)(Math.random()*(max-min-1)+min);
		}
	}