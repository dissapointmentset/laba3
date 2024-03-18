package laba3;

import java.util.Scanner;

import java.util.ArrayList;

public class resource{
	
	private String name;

	private double kolvo;

	public String getname(){
		return name;
	}
	public double getkol(){
		return kolvo;
	}
	public void showres() {
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
		
		boolean exit = true;
		do{	
			System.out.print("Input resource quantity:");
			exit = true;		
			try{				
				this.kolvo = in.nextDouble(); 
				if(this.kolvo<0){
					throw new IllegalArgumentException("Amount of resource can not be lower than 0\n");
					}
				}
			catch(IllegalArgumentException e){
				exit = false;
				System.out.print(e.getMessage());
				}	
			}while(!exit);
		}

	public void reducekol(double a) {
		this.kolvo-=a;
	}

	public void upkol(double a) {
		this.kolvo+=a;
	}
}