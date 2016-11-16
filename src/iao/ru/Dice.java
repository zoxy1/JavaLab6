package iao.ru;

public class Dice {
	
	private int diceNumber1;
	private int diceNumber2;
	
	public void throwDice(){
		do{
			diceNumber1 = (int)(Math.random()*6) +1;	
			diceNumber2 = (int)(Math.random()*6) +1;
			System.out.println("Выпали кости: "+diceNumber1+" и "+diceNumber2);
			
		}while(diceNumber1!=diceNumber2);
		//количество выпадающих исходов двух костей равно 21
	}	
}
