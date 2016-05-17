package Prg1;

public class WhichDay {



	public void Todayis(Day today){
		
		switch(today){
		
		case Monday: System.out.println("Today is school day");
		             break;
		case Tuesday:  System.out.println("Today is play day");
                       break;
		case Wednesday: System.out.println("Today is homework day");
                        break;
		case Thursday: System.out.println("Today is movie day");
                       break;
		case Friday: System.out.println("Today is movie day");
                      break;
		case Saturday: System.out.println("Today is garden day");
                        break;
		case Sunday: System.out.println("Today is walk day");
        break;
         default : System.out.println("This is not a valid");
        break;
		}
	}
}
