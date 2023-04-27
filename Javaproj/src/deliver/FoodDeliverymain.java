package deliver;
import java.util.*;
public class FoodDeliverymain {
	
	public static void main(String[] args) {
		// MAIN 
		
		Scanner a = new Scanner(System.in);
		Getterandsetter s = new Getterandsetter();
		int attempt=3;
		for (int i=0;i<attempt;i++) {
			System.out.print("\t\tEnter passcode:");
			int input = a.nextInt();
			if (input != s.getPincode()) {
				System.out.println("\t\tincorrect passcode!");
			}
			else {
				System.out.println("\t\t______________________________");
				System.out.println("\t\tLog successfuly");
				maindesign();
				break;
			}
			
		}
		
	}
		static void maindesign() {
		
		Scanner a = new Scanner(System.in);
		Getterandsetter s = new Getterandsetter();
        System.out.println("\t\t______________________________");
		System.out.println("\n\t\tWelcome to GrabPanda!\n");
		System.out.println("\t\t______________________________");
		System.out.println("\t\tWant to eat something?\n ");
		System.out.println("\t\t______________________________");
		System.out.println("\t\tSelect what FastFood do you want to eat\n");
		System.out.println("\t\t______________________________");
		System.out.println("\t\tType [1] for 'Jolibee' ");
		System.out.println("\t\t______________________________");
		System.out.println("\t\tType [2] for 'Mcdo' ");
		System.out.println("\t\t______________________________");
		System.out.println("\t\tType [3] for 'Mang Inasal' ");
		System.out.println("\t\tType [4] for 'Exit' ");
		System.out.println("\t\t______________________________");
		System.out.print("\t\tEnter what you choice: ");
		int choice = a.nextInt();
		System.out.println("\t\t______________________________");
		switch(choice) {
		case 1:
			Jolibee.Jolibee();
			break;
		case 2:
			Mcdo.Mcdo();
			break;
		case 3:
			MangInasal.Inasal();
			break;
		default:
		System.out.println("\t\tExiting...");
		}
		System.out.println("\t\t______________________________");
		System.out.println("\t\tRECEIVER: " + s.getFirstname() +" "+ s.getLastname());
		System.out.println("\t\tADDRESS:" + s.getAddress());
        System.out.println("\t\tPlease wait for your order");
        System.out.println("\t\tThank you!");
       
		
		
		}
}
