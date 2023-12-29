/* Menu selection using do while and switch-case*/
import java.io.*;
class Demonstration_57{
	public static void main(String args[])throws IOException{
		char choice;
		do{
			System.out.println("Help On:");
			System.out.println("1. if");
			System.out.println("2. switch");
			System.out.println("3. while");
			System.out.println("4. do-while");
			System.out.println("5. for\n");
			System.out.println("Choose One:");
			choice=(char)System.in.read();
		}while(choice<'1' ||choice>='5');
		
		System.out.println("\n");
		switch(choice){
			case '1':
				System.out.println("if-else");
				break;
			case '2':
				System.out.println("switch-case");
				break;
			case '3':
				System.out.println("while");
				break;
			case '4':
				System.out.println("do-while");
				break;
			case '5':
				System.out.println("for");
				break;
		}
	}
}
			
			
		