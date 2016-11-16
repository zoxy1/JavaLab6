package iao.ru;

public class Sequence2 {
	
	private int firstNumber=0;
	private int secondNumber=1;
	private int nextNumber;
	private final int SEQUENCE_COUNT=10;
	
	public void displaySequence(){
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		nextNumber=firstNumber+secondNumber;
		
		for(int i=2;i<SEQUENCE_COUNT;i++){
			System.out.println(nextNumber);	
			firstNumber=secondNumber;
			secondNumber=nextNumber;
			nextNumber=firstNumber+secondNumber;
		}
	}
}
