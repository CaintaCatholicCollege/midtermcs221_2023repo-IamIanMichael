package deliver;

public class Getterandsetter {
    private double totaljolibee;
    private double totalmcdo;
    private double totalinasal;
	private String firstname = "Cainta Catholic";
	private String lastname = "College";
    private String address = " Parola, Cainta Rizal" ;
	public String getName() {
		return firstname;
	}
	public void setName(String _name) {
		this.firstname = _name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public double getTotaljolibee() {
		return totaljolibee;
	}
	public void setTotaljolibee(double totaljolibee) {
		this.totaljolibee = totaljolibee;
	}
	public double getTotalmcdo() {
		return totalmcdo;
	}
	public void setTotalmcdo(double totalmcdo) {
		this.totalmcdo = totalmcdo;
	}
	public double getTotalinasal() {
		return totalinasal;
	}
	public void setTotalinasal(double totalinasal) {
		this.totalinasal = totalinasal;
	}
	public void setAddress(String _address) {
		this.address = _address;
	}

	// Pincode
	private int pincode = 1234;
	

    public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;	
	}
	
	// Jolibee menu
	private String fc = "Fried Chicken";
	private String spag = "Jolly Spaghetti";
	private String yb = "Yum Burger";
	private String cf = "Coke Float";
	private String sd = "Sundae Ice Cream";
	// Jolibee Price 
	
	private double fcp = 82.00;
	private double spagp = 50.00;
	private double Ybp = 35.00;
	private double cfp = 37.00;
	private double sdp = 55.00;
	
	// Mcdo menu
	private String chickenmcdo = "Chicken Mcdo";
	private String mcf = "MC Crispy Chicken Fillet Solo";
	private String cb = "Chicken Burger";
	private String mf = "McFloat";
	private String msd = "Hot Fudge Sundae";
	
	// Mcdo Price
	private double cd = 90.00;
	private double mcfp = 76.00;
	private double cbp = 45.00;
	private double mfp = 43.00;
	private double msdp = 43.00;
	
	// Inasal Menu
	private String paa = "Paa Solo";
	private String pansit = "Pansit Bihon Solo";
	private String halo = "Halo Halo ";
	private String ps = "Pork Sisig";
	private String sg = "Sago't Gulaman";
	
	// Inasal Price
	private double psp = 99.00;
	private double pansitp = 49.00;
	private double haloprice = 39.00;
	private double porksisigprice = 99.00;
	private double sgprice = 29.00;
	
	
	public String getFc() {
		return fc;
	}
	public void setFc(String fc) {
		this.fc = fc;
	}
	public String getSpag() {
		return spag;
	}
	public void setSpag(String spag) {
		this.spag = spag;
	}
	public String getYb() {
		return yb;
	}
	public void setYb(String yb) {
		this.yb = yb;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public String getSd() {
		return sd;
	}
	public void setSd(String sd) {
		this.sd = sd;
		
	}
	//getter
	public double getFcp() {
		return fcp;
	}
	public void setFcp(double fcp) {
		this.fcp = fcp;
	}
	public double getSpagp() {
		return spagp;
	}
	public void setSpagp(double spagp) {
		this.spagp = spagp;
	}
	public double getYbp() {
		return Ybp;
	}
	public void setYbp(double ybp) {
		Ybp = ybp;
	}
	public double getCfp() {
		return cfp;
	}
	public void setCfp(double cfp) {
		this.cfp = cfp;
	}
	public double getSdp() {
		return sdp;
	}
	public void setSdp(double sdp) {
		this.sdp = sdp;
	}
	public String getChickenmcdo() {
		return chickenmcdo;
	}
	public void setChickenmcdo(String chickenmcdo) {
		this.chickenmcdo = chickenmcdo;
	}
	public String getMcf() {
		return mcf;
	}
	public void setMcf(String mcf) {
		this.mcf = mcf;
	}
	public String getCb() {
		return cb;
	}
	public void setCb(String cb) {
		this.cb = cb;
	}
	public String getMf() {
		return mf;
	}
	public void setMf(String mf) {
		this.mf = mf;
	}
	public String getMsd() {
		return msd;
	}
	public void setMsd(String msd) {
		this.msd = msd;
	}
	//getter mcdo
	public double getCd() {
		return cd;
	}
	public void setCd(double cd) {
		this.cd = cd;
	}
	public double getMcfp() {
		return mcfp;
	}
	public void setMcfp(double mcfp) {
		this.mcfp = mcfp;
	}
	public double getCbp() {
		return cbp;
	}
	public void setCbp(double cbp) {
		this.cbp = cbp;
	}
	public double getMfp() {
		return mfp;
	}
	public void setMfp(double mfp) {
		this.mfp = mfp;
	}
	public double getMsdp() {
		return msdp;
	}
	public void setMsdp(double msdp) {
		this.msdp = msdp;
	}
	public String getPaa() {
		return paa;
	}
	public void setPaa(String paa) {
		this.paa = paa;
	}
	public String getPansit() {
		return pansit;
	}
	public void setPansit(String pansit) {
		this.pansit = pansit;
	}
	public String getHalo() {
		return halo;
	}
	public void setHalo(String halo) {
		this.halo = halo;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public String getSg() {
		return sg;
	}
	public void setSg(String sg) {
		this.sg = sg;
	}
	//getter inasal
	public double getPsp() {
		return psp;
	}
	public void setPsp(double psp) {
		this.psp = psp;
	}
	public double getPansitp() {
		return pansitp;
	}
	public void setPansitp(double pansitp) {
		this.pansitp = pansitp;
	}
	public double getHaloprice() {
		return haloprice;
	}
	public void setHaloprice(double haloprice) {
		this.haloprice = haloprice;
	}
	public double getPorksisigprice() {
		return porksisigprice;
	}
	public void setPorksisigprice(double porksisigprice) {
		this.porksisigprice = porksisigprice;
	}
	public double getSgprice() {
		return sgprice;
	}
	public void setSgprice(double sgprice) {
		this.sgprice = sgprice;
	}

	

	
			}