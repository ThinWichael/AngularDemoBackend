package com.example.demo.bean;

public class Price {
       String NTD;
       String JPY;
       String USD;
       
       
       
	public Price(String nTD, String jPY, String uSD) {
		super();
		NTD = nTD;
		JPY = jPY;
		USD = uSD;
	}
	
	public String getNTD() {
		return NTD;
	}
	public void setNTD(String nTD) {
		NTD = nTD;
	}
	public String getJPY() {
		return JPY;
	}
	public void setJPY(String jPY) {
		JPY = jPY;
	}
	public String getUSD() {
		return USD;
	}
	public void setUSD(String uSD) {
		USD = uSD;
	}
       

       
}
