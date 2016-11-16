package iao.ru;

public class DateTwo {

	private int dayNumber=7; 
	public void displayDay(){
	if(dayNumber==1)
		System.out.println("\"Сегодня - понедельник\"");
	else if(dayNumber==2)
		System.out.println("\"Сегодня - вторник\"");
	else if(dayNumber==3)
		System.out.println("\"Сегодня - среда\"");
	else if(dayNumber==4)
		System.out.println("\"Сегодня - четверг\"");
	else if(dayNumber==5)
		System.out.println("\"Сегодня - пятница. Ура!!!\"");
	else if(dayNumber==6)
		System.out.println("\"Сегодня - суббота\"");
	else if(dayNumber==7)
		System.out.println("\"Сегодня - воскресенье\"");
	else if(dayNumber<1||dayNumber>7)
		System.out.println("\"Ошибка: такого дня недели нет\"");
	
	}

}
