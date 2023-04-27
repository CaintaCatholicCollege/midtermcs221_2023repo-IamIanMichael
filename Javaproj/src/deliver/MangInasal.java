package deliver;

import java.util.Scanner;

public class MangInasal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static void Inasal(){
		Getterandsetter s = new Getterandsetter();
		Scanner a = new Scanner(System.in);
		System.out.println("\n\t\tWelcome to Mang Inasal!\n");
		System.out.println("\t\t______________________________");
		System.out.println("\t\t\t     Menu");
		System.out.println("\t\t[1] "+ s.getPaa() + " "+"Price: " + s.getPsp());
		System.out.println("\t\t[2] "+ s.getPansit() + " "+"Price: " + s.getPansitp());
		System.out.println("\t\t[3] "+ s.getHalo() + " "+"Price: " + s.getHaloprice() );
		System.out.println("\t\t[4] "+ s.getPs() + " "+"Price: " + s.getPorksisigprice());
		System.out.println("\t\t[5] "+ s.getSg() + " "+"Price: " + s.getSgprice());
		System.out.println("\t\t______________________________");
		System.out.print("\n\t\tHow many chicken: ");
		int friedchicken = a.nextInt();
		System.out.print("\t\tHow many Pansit Bihon: ");
		int spag = a.nextInt();
		System.out.print("\t\tHow many Halo Halo: ");
		int yumburger = a.nextInt();
		System.out.print("\t\tHow many Pork Sisig: ");
		int coke = a.nextInt();
		System.out.print("\t\tHow many Sagu't Gulaman: ");
		int sundae = a.nextInt();
	    double fc = s.getPsp();
		double mp = s.getPansitp();
		double cb = s.getHaloprice();
		double mf = s.getPorksisigprice();
		double sd = s.getSgprice();
		double totalfc = fc * friedchicken;
		double totalspag = mp * spag;
		double totalyum = cb * yumburger;
		double totalcf = mf * coke;
		double totalsundae = sd * sundae;
		
		double alltotal = totalfc + totalspag + totalyum + totalcf + totalsundae;
		s.setTotalinasal(alltotal);
		System.out.println("\t\tTotal: " + s.getTotalinasal());
		
		
	}



	
	
	
}
