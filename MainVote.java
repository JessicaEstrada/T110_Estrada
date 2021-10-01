package Package1;

import java.util.Scanner;
import Package2.VoteClass;
public class MainVote {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			
			System.out.print("Enter your full name: ");
		    String name = scan.nextLine();
			System.out.print("Enter your age      : ");
		    int age = scan.nextInt();
			System.out.print("Enter your voter ID : ");
			int id = scan.nextInt();
			VoteClass Obj = new VoteClass(age);

			MainVote myObj = new MainVote();
			System.out.print("\n[INFO]");
			System.out.print("\nName: "+ name);
			System.out.print("\nAge : "+ age);
			System.out.print("\nID  : "+ id);
	}
}
