package Package2;

import package1.MainVote;
public class VoteClass {
	
	public VoteClass(int age) {
		if(age >=18) {
			System.out.print("\nYou are Eligible for Voting! Have a great day!\n");
		}else {
			System.out.print("\nYou are not eligible for Voting!");
		}
	}
}