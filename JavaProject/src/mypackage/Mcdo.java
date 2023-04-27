package mypackage;

import java.util.Scanner;

public class Mcdo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static void Mcdo(){
		Getterandsetter s = new Getterandsetter();
		Scanner a = new Scanner(System.in);
		System.out.println("\n\t\tWelcome to Mcdo!\n");
		System.out.println("\t\t______________________________");
		System.out.println("\t\t\t     Menu");
		System.out.println("\t\t[1] "+ s.getChickenmcdo() + " "+"Price: " + s.getCd());
		System.out.println("\t\t[2] "+ s.getMcf() + " "+"\n\t\tPrice: " + s.getMcfp());
		System.out.println("\t\t[3] "+ s.getCb() + " "+"Price: " + s.getCbp() );
		System.out.println("\t\t[4] "+ s.getMf() + " "+"Price: " + s.getMfp());
		System.out.println("\t\t[5] "+ s.getMsd() + " "+"Price: " + s.getMsdp());
		System.out.println("\t\t______________________________");
		System.out.print("\n\t\tHow many chicken mcdo: ");
		int friedchicken = a.nextInt();
		System.out.print("\t\tHow many MC Crispy Chicken Fillet: ");
		int spag = a.nextInt();
		System.out.print("\t\tHow many Chicken Burger: ");
		int yumburger = a.nextInt();
		System.out.print("\t\tHow many MCFloat: ");
		int coke = a.nextInt();
		System.out.print("\t\tHow many Hot Fudge Sundae: ");
		int sundae = a.nextInt();
	    double fc = s.getCd();
		double mp = s.getMcfp();
		double cb = s.getCbp();
		double mf = s.getMfp();
		double sd = s.getMsdp();
		double totalfc = fc * friedchicken;
		double totalspag = mp * spag;
		double totalyum = cb * yumburger;
		double totalcf = mf * coke;
		double totalsundae = sd * sundae;
		
		double alltotal = totalfc + totalspag + totalyum + totalcf + totalsundae;
		s.setTotaljolibee(alltotal);
		System.out.println("\t\tTotal: " + s.getTotaljolibee());
		
		a.close();
	}
	



}
