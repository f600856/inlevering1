package oppgave2;

import java.util.Scanner;

public class Ulikekarakterene {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);{
		int i;
		for (i=1;i<=10;i=i+1){
		System.out.print("put your poeng: ");
		int poeng  = sc.nextInt();
		if (poeng >= 90 && poeng <=100 ) {
			System.out.println("A");
		}else if (poeng>=80 && poeng <=89 ) {
				System.out.println("B");
		}else if (poeng>=60 && poeng <=79 ) {
			System.out.println("C");
		}else if (poeng>=50 && poeng <=59 ) {
			System.out.println("D");
		}else if (poeng>=40 && poeng <=49 ) {
			System.out.println("E");
		}else if (poeng>=0 && poeng <=39 ) {
			System.out.println("F");
		}else {
		System.out.println(" invalid");
		}
		
			
				
		}

				
			}
		}
	}


