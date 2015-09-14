import java.util.Scanner;

public class CMain {

	public static void main(String[] args) {
		// Declaring Variables
		double td;
		double yards;
		double inter;
		double comp;
		double att;
		
		//Scanner to ask for input
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("How many touchdowns does the player have: ");
		td = user_input.nextDouble();
		System.out.print("How many total yards: ");
		yards = user_input.nextDouble();
		System.out.print("How many interceptions: ");
		inter = user_input.nextDouble();
		System.out.print("How many completions: ");
		comp = user_input.nextDouble();
		System.out.print("How many attempted passes: ");
		att = user_input.nextDouble();
		user_input.close();
		
		//Declaring more variables
		double cp;
		double ypa;
		double tpa;
		double ipa;
		double pr;
		
		//Completions per attempt
		cp = (comp/att - .3)*5;
		
		//Yards per attempt
		ypa = (yards/att -3)*.25;
		
		//Touchdowns per attempt
		tpa = (td/att)*20;
				
		//Interceptions per attempt
		ipa = 2.375 - ((inter/att)*25);
		
		//Passer rating
		pr = ((cp+ypa+tpa+ipa)/6)*100;
		
		//Final output
		System.out.print("The player's QB rating is: "+pr);
		

	}

}
