package day1;
import java.util.Scanner;

public class customerdemo {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the name");
	String name=sc.nextLine();
	System.out.println("enter the address");
	String address=sc.nextLine();
	System.out.println("enter the id");
	int id=sc.nextInt();
	customer c=new customer();
	c.setcname(name);
	c.setcaddress(address);
	c.setcid(id);
	
	System.out.println("c");
	boolean output = c instanceof customer;
	System.out.println(output);

}
}
