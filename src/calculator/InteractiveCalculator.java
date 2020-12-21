package calculator;

import java.util.Scanner;

import calculator.operations.AddOperation;
import calculator.operations.SubtractOperation;
import calculator.operations.MultiOperation;
import calculator.operations.DivOperation;

public class InteractiveCalculator {
	public static final void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a number A please: ");
		float numberA = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Give me a number B please: ");
		float numberB = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Give me an operation please: ");
		String operation = scanner.nextLine();
		
		float result = 0;
		if(operation.equals("add")) {
			AddOperation add = new AddOperation();
			add.setA(numberA);
			add.setB(numberB);
			result = add.getResult();
			
		}else if(operation.equals("subtract")) {
			SubtractOperation sub = new SubtractOperation();
			sub.setA(numberA);
			sub.setB(numberB);
			result = sub.getResult();
			
		}else if(operation.equals("multiply")) {
			MultiOperation multi = new MultiOperation();
			multi.setA(numberA);
			multi.setB(numberB);
			result = multi.getResult();
			
		}else if(operation.equals("divide")) {
			DivOperation div = new DivOperation();
			div.setA(numberA);
			div.setB(numberB);
			result = div.getResult();
			
		}else {
			System.out.println("Did not understand the operation");
		}
		
		System.out.println("The result is ");
		System.out.println(result);
		
	}

}
