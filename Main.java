import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in); 
	static DataClass obj = new DataClass(); 


	public static void main(String[] args) {
		printInstruc(); 
		askInputs(); 
		obj.printAnswer(); 

		while(obj.getChoiceValue() != 0) {
			printInstruc(); 
			askInputs(); 
			printAnswer2(); 
		}

		scan.close();
	}

	static void printAnswer2() {
		if(obj.getChoiceValue() == 0) {
			System.out.println("Program Terminated");
		} else if(obj.getChoiceValue() == 1) {
			System.out.println("The Area of Triangle is : " + obj.getTriangleArea());
		} else if(obj.getChoiceValue() == 2) {
			System.out.println("The Area of Triangle is : " + obj.getRectangleArea());
		} else if(obj.getChoiceValue() == 3) {
			System.out.println("The Area of Triangle is : " + obj.getParrallelogramArea());
		} else if(obj.getChoiceValue() == 4) {
			System.out.println("The Area of Triangle is : " + obj.getCircleArea());
		} else {
			System.out.println("Error!");
		}
		System.out.println("------------------------------------------------------------------\n");
	}

	static void askInputs() {
		obj.choice(scan.nextInt());

		if(obj.getChoiceValue() == 1) {
			System.out.println("[Solving The Area Of Triangle]");
			System.out.print("Input Base : ");
			obj.setValue1(scan.nextDouble());
			System.out.print("Input Height : ");
			obj.setValue2(scan.nextDouble());
		} else if(obj.getChoiceValue() == 2) {
			System.out.println("[Solving The Area Of Rectangle]");
			System.out.print("Input Legnth : ");
			obj.setValue1(scan.nextDouble());
			System.out.print("Input Height : ");
			obj.setValue2(scan.nextDouble());
		} else if(obj.getChoiceValue() == 3) {
			System.out.println("[Solving The Area Of Parrallelogram]");
			System.out.print("Input Base : ");
			obj.setValue1(scan.nextDouble());
			System.out.print("Input Height : ");
			obj.setValue2(scan.nextDouble());
		}  else if(obj.getChoiceValue() == 4) {
			System.out.println("[Solving The Area Of Circle]");
			System.out.print("Input Radius : ");
			obj.setValue1(scan.nextDouble());;
		}
	}

	static void printInstruc() {
		System.out.println("--Area of Geometry shapes--");
		System.out.println("[0] To exit");
		System.out.println("[1] Triangle");
		System.out.println("[2] Rectangle");
		System.out.println("[3] Parrallelogram");
		System.out.println("[4] Circle");
		System.out.print("\nChoice : ");
	}
}