package com.ranjan.comp;

public class Customer extends Person
{
	private int txid;
	private double billamount;
	
	public Customer(String name, String adds, AadharDetails aadhar, int txid, double billamount) {
		super(name, adds, aadhar);
		this.txid = txid;
		this.billamount = billamount;
	}

	@Override
	public String toString() {
		return "Customer [txid=" + txid + ", billamount=" + billamount + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
