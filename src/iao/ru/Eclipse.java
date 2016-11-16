package iao.ru;

public class Eclipse {

	 public static void main (String args[]) {
		if(args.length==0){
			System.out.println("Не введен параметр (версия Eclips)");
		}
		else
		 {
		 	float versionFloat=Float.valueOf(args[0])*10;
		 	int versionInt=(int)versionFloat;
		 			 	
		 	switch(versionInt){
		 	case 32:System.out.println("Callisto 	30 June 2006");
		 	break;
		 	case 33:System.out.println("Europa 		29 June 2007");
		 	break;
		 	case 34:System.out.println("Ganymede 	25 June 2008");
		 	break;
		 	case 35:System.out.println("Galileo 	24 June 2009");
		 	break;
		 	case 36:System.out.println("Helios 		23 June 2010");
		 	break;
		 	case 37:System.out.println("Indigo 		22 June 2011");
		 	break;
		 	case 42:System.out.println("Juno 		27 June 2012");
		 	break;
		 	case 43:System.out.println("Kepler 		26 June 2013");
		 	break;
		 	case 44:System.out.println("Luna 		25 June 2014 (planned)");
		 	break;
		 	default: System.out.println("Версия не опознана..");
		 			 	
		 	}
		 	 
		 	 
		 	 
		 	 
		 	 
		 }
	 }
}
