package iao.ru;

public class Month {
	
	private int monthNumber=9;
	
	public void displayMonth(){
		
		switch(monthNumber){
			case 1:System.out.println("1 - это Январь");
			break;
			case 2:System.out.println("2 - это Февраль");
			break;
			case 3:System.out.println("3 - это Март");
			break;
			case 4:System.out.println("4 - это Апрель");
			break;
			case 5:System.out.println("5 - это Май");
			break;
			case 6:System.out.println("6 - это Июнь");
			break;
			case 7:System.out.println("7 - это Июль");
			break;
			case 8:System.out.println("8 - это Август");
			break;
			case 9:System.out.println("9 - это Сентябрь");
			break;
			case 10:System.out.println("10 - это Октябрь");
			break;
			case 11:System.out.println("11 - это Ноябрь");
			break;
			case 12:System.out.println("12 - это Декабрь");
			break;
			default: System.out.println("Не правильно введен номер месяца");
	
		}
	}
	
}
