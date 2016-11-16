package iao.ru;

public class Clock {
	
private int currentTime=905;
private void outTime(int hours,int minutes){
	
	if(hours<=9)
		System.out.print("0"+hours+":");
	else
		System.out.print(hours+":");	
	
	if(minutes<=9)
		System.out.print("0"+minutes);
	else
		System.out.print(minutes);

}

public void displayPartOfDay(){

	int hours=currentTime/100;
	int minutes=currentTime%100;
	
	if(currentTime<1||currentTime>2400||minutes>=60){
		System.out.println("�� ���������� ���� �������");
	}
	else{
		
		if(currentTime>=801 && currentTime<=1200){	
			outTime(hours,minutes);
			System.out.println(" ����");
		}
		else if(currentTime>=1201 && currentTime<=1700){
			outTime(hours,minutes);
			System.out.println(" ����");
		}
		else if(currentTime>=1701 && currentTime<=2400){
			outTime(hours,minutes);
			System.out.println(" �����");
		}
		else if(currentTime>=1 && currentTime<=800){
			outTime(hours,minutes);
			System.out.println(" ����");
		}
	}
	
	
	}
}
