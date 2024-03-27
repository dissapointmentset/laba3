package laba3;

import java.util.Scanner;

import java.util.ArrayList;

import laba3.resource;

class lot extends resource{
	private double cost;
	public void setlot(String name, double kolvo, double price) {
		super.setresource(name, kolvo);
		this.cost = price;
	}
    public String getname() {
		return name;
	}
	public double getkol() {
		return kolvo;
	}	
	public double getcost() {
		return cost;
	}
	@Override
	public String toString() {
		return this.name + ": " + this.kolvo+"\n"+this.cost+"p\n";
	}
	public void reducekol(double a) {
		this.kolvo -= a;
	}
	public void upkol(double a) {
		this.kolvo += a;
	}
	public void consresinit() {
        super.consresinit();
		System.out.print("Input price: ");
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
		this.cost = in.nextDouble();
	}
}