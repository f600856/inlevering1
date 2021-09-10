package oppgave1;
import java.util.Scanner;

public class Trinntask {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("put your bruttoinntekt: ");
		int bruttoinntekt = sc.nextInt();
		
			
			if (bruttoinntekt >= 0 && bruttoinntekt <=164100) {
				System.out.println("no tax");
			}else if (bruttoinntekt>=164101 && bruttoinntekt <=230951 ) {
					System.out.println("Trinn 1 " + " and " + " pay able tax 0.93% ");
			}else if (bruttoinntekt>=230950 && bruttoinntekt <=580650 ) {
				System.out.println(" Trinn 2 " + " and " + " pay able tax 2.41% ");
			}else if (bruttoinntekt>=580650&& bruttoinntekt <=934050 ) {
				System.out.println(" Trinn 3 " + " and " + " pay able tax 11.52% ");
			}else
					System.out.println(" Trinn 4 " + " and " + " pay able tax 14.52% ");
		

	}
}
