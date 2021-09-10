package Oppgave3;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("put your number");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		long x = 1;
		while (n != 1) {
			x = x * n;
			n--;
		}
        	
        System.out.print(x);    
	}

}
