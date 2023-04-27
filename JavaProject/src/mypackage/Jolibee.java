package mypackage;

import java.util.Scanner;

public class Jolibee {
	
	public static void main(String[] args) {

	}
			
		static void Jolibee() {
			Getterandsetter s = new Getterandsetter();
			Scanner a = new Scanner(System.in);
			System.out.println("\n\t\tWelcome to Jolibee!\n");
			System.out.println("\t\t______________________________");
			System.out.println("\t\t\t     Menu");
			System.out.println("\t\t[1] "+ s.getFc() + " "+"Price: " + s.getFcp());
			System.out.println("\t\t[2] "+ s.getSpag() + " "+"Price: " + s.getSpagp());
			System.out.println("\t\t[3] "+ s.getYb() + " "+"Price: " + s.getYbp() );
			System.out.println("\t\t[4] "+ s.getCf() + " "+"Price: " + s.getCfp());
			System.out.println("\t\t[5] "+ s.getSd() + " "+"Price: " + s.getSdp());
			System.out.println("\t\t______________________________");
			System.out.print("\n\t\tHow many Fried Chicken: ");
			int friedchicken = a.nextInt();
			System.out.print("\t\tHow many Spaghetti: ");
			int spag = a.nextInt();
			System.out.print("\t\tHow many Yum Burger: ");
			int yumburger = a.nextInt();
			System.out.print("\t\tHow many Coke Float: ");
			int coke = a.nextInt();
			System.out.print("\t\tHow many Sundae: ");
			int sundae = a.nextInt();
		    double fc = s.getFcp();
			double sp = s.getSpagp();
			double yb = s.getYbp();
			double cf = s.getCfp();
			double sd = s.getSdp();
			double totalfc = fc * friedchicken;
			double totalspag = sp * spag;
			double totalyum = yb * yumburger;
			double totalcf = cf * coke;
			double totalsundae = sd * sundae;
			
			double alltotal = totalfc + totalspag + totalyum + totalcf + totalsundae;
			s.setTotaljolibee(alltotal);
			System.out.println("\t\tTotal: " + s.getTotaljolibee());
 	 a.close();
	}



}
