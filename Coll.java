package mi2Act3;
import java.util.Scanner;

public class Coll {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num = 0;
		int count = 0;
		
		System.out.print("Enter a positive number: ");
		num = scan.nextInt();
		
		while(num !=1){
		    if(num % 2==0){
		       num = num / 2; 
		       System.out.println("Current Given value is " + num);
		       count++;
		    }else{
		        num = 3 * num + 1;
		        System.out.println("Current Given value is " + num);
		        count++;
		    }
		}
	}
}
