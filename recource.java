package dzhava;

import java.util.Scanner;

public class resource{
	
	private String name;

	private double kolvo;

	public String getname(){
		return name;
	}
	public unsigned int getkol(){
		return kolvo;
	}
	public string showres() {
		System.out.println(name + " : " + kolvo);
	}
	public void setresource(String imya, double kolich) {

		this.name = imya;
		this.kolvo = kolich;
				
	}
	public void consresinit() {
		Scanner scanner = new Scanner(System.in);
        	Scanner in = new Scanner(System.in);
        	System.out.print("Input resource name:");
        	this.name = in.nextLine();
        	System.out.print("Input resource quantity:");
        	this.kolvo = in.nextDouble();
        }

	public void reducekol(double a) {
		this.kolvo-=a;
	}

	public void upkol(double a) {
		this.kolvo+=a;
	}
}