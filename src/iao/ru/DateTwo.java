package iao.ru;

public class DateTwo {

	private int dayNumber=7; 
	public void displayDay(){
	if(dayNumber==1)
		System.out.println("\"������� - �����������\"");
	else if(dayNumber==2)
		System.out.println("\"������� - �������\"");
	else if(dayNumber==3)
		System.out.println("\"������� - �����\"");
	else if(dayNumber==4)
		System.out.println("\"������� - �������\"");
	else if(dayNumber==5)
		System.out.println("\"������� - �������. ���!!!\"");
	else if(dayNumber==6)
		System.out.println("\"������� - �������\"");
	else if(dayNumber==7)
		System.out.println("\"������� - �����������\"");
	else if(dayNumber<1||dayNumber>7)
		System.out.println("\"������: ������ ��� ������ ���\"");
	
	}

}
