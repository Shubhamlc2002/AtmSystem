package encapulation17_03;

import java.util.Scanner;

public class shubham {
	  int count = 0;
	void youraj() {
		Scanner sc =new Scanner (System.in);
		System.out.println("WELCOME");
		System.out.println();
		System.out.println();
	
		
		
		
		
		
			
		while(true) {
			System.out.print("Enter your name : ");
			String s =sc.nextLine();
			int sum = 0;
			
			s.toLowerCase();
			for(int i = 0;i<s.length()-1;i++) {
				sum=+(int)s.charAt(i);
			}
			
			
			
			
			
			if(sum==97) {
			
			
			System.out.print("Enter your account num : ");
			int c = sc.nextInt();
			
			if(c==56247690) {
				System.out.println();
				System.out.println();
				while(true) {
					
					if(count==3) {
						System.out.println("limit is expire please try some time");
						
					}
					
				System.out.print("enter your password : ");
				int d = sc.nextInt();
				if(d==9370) {
				displayy dd  = new displayy();
				dd.show();
				
				
			}
				else {
					System.out.println("invalid password");
					count++;
					continue;
				
					
				}
			
				}
			}
			
			
			
			else {
				System.out.println("invalid account num");
				continue;
			}
		
			}
			else {
				System.out.println("your name is invalid");
				continue;
				
				}
			}
			
	
		
			
			
			
		
		

		
	}

}

