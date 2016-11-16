package iao.ru;

public class Sequence1 {

	private int firstNumber=0;
	private int secondNumber=1;
	private int nextNumber;
	
	public void displaySequence(){
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		nextNumber=firstNumber+secondNumber;
		while(nextNumber<=100){
			System.out.println(nextNumber);	
			firstNumber=secondNumber;
			secondNumber=nextNumber;
			nextNumber=firstNumber+secondNumber;
		}
	}
}
