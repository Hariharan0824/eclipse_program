package com.xworkz.Instance.things;

public class Festival {
	
	protected String festivalName;
	protected String typeOFFestival;
	protected int noOfFestival;
	protected String lunchName;
	protected String typeOFLunch;
	protected String sweetName;
	protected String famousFestival;
	protected int noOfFamousFestival;
	protected String dressType;
	protected int offers;
	protected int discounts;
	protected String partyType;
	protected int noOfDresses;
	protected int timings;
	protected String celebirationType;
	protected int noOfMembers;
	protected String buyerName;
	protected String sellerName;
	protected String sponserName;
	protected int noOfSponsers;
	
	public Festival() {
		super();
		System.out.println("This is No Argument Constructor");
	}

	public Festival(String festivalName, String typeOFFestival, int noOfFestival, String lunchName, String typeOFLunch,
			String sweetName, String famousFestival, int noOfFamousFestival, String dressType, int offers,
			int discounts, String partyType, int noOfDresses, int timings, String celebirationType, int noOfMembers,
			String buyerName, String sellerName, String sponserName, int noOfSponsers) {
		//super();
		//this();
		this.festivalName = festivalName;
		this.typeOFFestival = typeOFFestival;
		this.noOfFestival = noOfFestival;
		this.lunchName = lunchName;
		this.typeOFLunch = typeOFLunch;
		this.sweetName = sweetName;
		this.famousFestival = famousFestival;
		this.noOfFamousFestival = noOfFamousFestival;
		this.dressType = dressType;
		this.offers = offers;
		this.discounts = discounts;
		this.partyType = partyType;
		this.noOfDresses = noOfDresses;
		this.timings = timings;
		this.celebirationType = celebirationType;
		this.noOfMembers = noOfMembers;
		this.buyerName = buyerName;
		this.sellerName = sellerName;
		this.sponserName = sponserName;
		this.noOfSponsers = noOfSponsers;
		System.out.println("festivalName:"+this.festivalName);
		System.out.println("typeOFFestival:"+this.typeOFFestival);
		System.out.println("noOfFestival:"+this.noOfFestival);
		System.out.println("lunchName:"+this.lunchName);
		System.out.println("typeOFLunch:"+this.typeOFLunch);
		System.out.println("sweetName:"+this.sweetName);
		System.out.println("famousFestival:"+this.famousFestival);
		System.out.println("noOfFamousFestival:"+this.noOfFamousFestival);
		System.out.println("dressType:"+this.dressType);
		System.out.println("offers:"+this.offers);
		System.out.println("discounts:"+this.discounts);
		System.out.println("partyType:"+this.partyType);
		System.out.println("noOfDresses:"+this.noOfDresses);
		System.out.println("timings:"+this.timings);
		System.out.println("celebirationType:"+this.celebirationType);
		System.out.println("noOfMembers:"+this.noOfMembers);
		System.out.println("buyerName:"+this.buyerName);
		System.out.println("sellerName:"+this.sellerName);
		System.out.println("sponserName:"+this.sponserName);
		System.out.println("noOfSponsers:"+this.noOfSponsers);
	}
	
	public void display() {
		System.out.println("This is Festival Method");
	}
	
	
	
	

}
