package Test;
import java.util.*;
class DynamicArrayListDemo{
	public static void main(String[]args) {
	ArrayList<String> l = new ArrayList<String>();
	
	l.add("a");
	l.add("b");
	l.add("null");
	l.add("10");
	l.add("e");
	System.out.println(l);
	l.remove(2);
	l.add(2, "z");
    l.add("M");
	System.out.println(l);
}
}