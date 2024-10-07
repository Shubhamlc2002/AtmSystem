package encapulation17_03;

import java.util.*;

public class bank {
	private static int bankBalance;
	private static int accno;
	private String name;

	bank(int b, int a, String n) {
		bankBalance = b;
		accno = a;
		name = n;

	}
	bank(){
	
	
	}

	public static void getBalance(int pin) {
		while (true) {
			
		
			if (pin == 9370) {
				System.out.println("Availavle balance is : " + bankBalance);
			} else {
				System.out.println("INVALID PIN");
				Scanner sc =new Scanner(System.in);
				int a = sc.nextInt();
				getBalance(a);
				
				
				continue;
				
			}
			System.out.println("if you want to continue (presss 1)");
			System.out.println("if you want to return in main menue(press 2)");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if (a == 1) {
				continue;
			} else if (a == 2) {
				break;
			}

		}
	}

	public static void setBalance(int pin) {
		while (true) {
			if (pin == 9370) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter amount");
				int a = sc.nextInt();
				if (a >= 0) {

					bankBalance = bankBalance + a;
					System.out.println("now your available balance is : " + bankBalance);
					

				} else {
					System.out.println("yeda bida zala ka");
					continue;
				}
			}
			System.out.println("if you want to continue (presss 1)");
			System.out.println("if you want to return in main menue(press 2)");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if (a == 1) {
				continue;
			} else if (a == 2) {
				break;
			}

		}
	}

	public void getAccno(int pin) {
		while (true) {
			if (pin == 9370) {
				System.out.println(accno);
			} else {
				System.out.println("INVALID PIN");
				continue;
			}
			System.out.println("if you want to continue (presss 1)");
			System.out.println("if you want to return in main menue(press 2)");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if (a == 1) {
				continue;
			} else if (a == 2) {
				break;
			}

		}
	}

	public void setAccno(int pin) {
		while (true) {
			if (pin == 9370) {
				Scanner sc = new Scanner(System.in);
				System.out.println("please enter new account no");
				int a = sc.nextInt();
				accno = a;
			} else {
				System.out.println("INVALID PIN");
				continue;
			}
			System.out.println("if you want to continue (presss 1)");
			System.out.println("if you want to return in main menue(press 2)");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if (a == 1) {
				continue;
			} else if (a == 2) {
				break;
			}

		}
	}

	public void getName(int pin) {
		while (true) {
			if (pin == 9370) {
				System.out.println(name);
			}
			System.out.println("if you want to continue (presss 1)");
			System.out.println("if you want to return in main menue(press 2)");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if (a == 1) {
				continue;
			} else if (a == 2) {
				break;
			}

		}
	}

	public void widraw(int pin) {
		while (true) {
			int counter = 0;
			if (pin == 9370) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter amount");
				int amount = sc.nextInt();
				if (amount >= 0) {
					bankBalance = (bankBalance - amount);
					System.out.println("now your account balance is : " + bankBalance);

				} else {
					System.out.println("yeda bida zala ka");
					continue;
				}

			} else {
				System.out.println("enter valid pin");
				counter++;
				
				continue;
			}
			System.out.println("if you want to continue (presss 1)");
			System.out.println("if you want to return in main menue(press 2)");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if (a == 1) {
				continue;
			} else if (a == 2) {
				break;
			}

		}

	}

}
