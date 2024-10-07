package encapulation17_03;
import java.util.*;

public class displayy  {
	void show() {
		while(true) {
			
			bank b = new bank();
			
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("WELCOME shubham");
			System.out.println();
			System.out.println();
			System.out.println("PLEASE SELECT MENUE");
			System.out.println();
			System.out.println();
			System.out.println("1.Check abailable balance");
			System.out.println();
			System.out.println();
			System.out.println("2.credit money");
			System.out.println();
			System.out.println();
			System.out.println("3.widraw money");
			System.out.println();
			System.out.println();;
			System.out.print("Enter no : ");
			int a = sc.nextInt();
			System.out.println();
			System.out.println();
			if(a==1) {
				System.out.print("enter your pin : ");
				int aa = sc .nextInt();
				b.getBalance(aa);
			}
			else if(a==2) {
				System.out.print("enter your pin : ");
				int bb = sc.nextInt();
				b.setBalance(bb);
			}
			else if(a==3) {
				System.out.print("enter your pin : ");
				int cc = sc.nextInt();
				b.widraw(cc);
			}
		}
		
	}

}
