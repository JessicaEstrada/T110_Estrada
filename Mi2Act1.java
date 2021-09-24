package Miac2Act11;

import java.util.Scanner;

public class Mi2Act1 {

	public static void main(String[] args) {
		Scanner EmployeeData = new Scanner (System. in);
		
		System.out.print("Input Employee #1 Name	: ");
		String name1= EmployeeData.nextLine();
		System.out.print("Input Employee #1 ID#		: ");
		int id= EmployeeData.nextInt();
		System.out.print("Input Employee #1 salary	: ");
		int salary= EmployeeData.nextInt();
		
		Scanner data = new Scanner (System.in);
		System.out.print("\nInput Employee #2 Name	: ");
		String name2= data.nextLine();
		System.out.print("Input Empployee #2 ID#	: ");
		int id2= data.nextInt();
		System.out.print("Input Employee #2 salary	: ");
		int salary2= data.nextInt();
		
		int Sal = salary / 10;
		int rem = salary - Sal;
		System.out.print("\nName : " + name1 + ";" + " ID# : "+ id + " Salary : " + rem);
		int Sals = salary2 / 10;
		int rems = salary2 - Sals;
		System.out.print("\nName : " + name2 + ";" + " ID# : "+ id2 + " Salary : " + rems);
		
		

	}

}
