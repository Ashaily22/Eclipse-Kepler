package Prg1;

import java.util.LinkedList;
import java.util.Iterator;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> list= new LinkedList<String>();
list.add("A");
list.add("B");
list.add("C");
list.add("Additional");

Iterator<String> It = list.iterator();
while(It.hasNext()){
	System.out.println("It.hasNext()");
}

	}

}
