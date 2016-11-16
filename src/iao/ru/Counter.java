package iao.ru;

public class Counter {

	private final int MAX_COUNT=50;
	public int step=1;
	public int count=1;
	
	public void displayCount(){
	
		while (count<=MAX_COUNT){
			System.out.println(count);	
			count+=step;;
		
		}
}

}
