package laba3;
import laba3.item; 
import laba3.resource;
import laba3.compose;
import laba3.manager;
import java.util.ArrayList;


public class action implements Cloneable{

	private	resource res;
	protected int kolvo;
	protected int f;
	public int getacttype() {
		return f;
	}

	public static int count;
	public static int reverscount;
	public static int numberof(){
		return numberof.number;
	}
	public static class numberof{
		public static int number = 1;
	}

	public void set(resource a, int b, int flag) {

		this.res = a;
		this.kolvo = b;
		this.f = flag;
		if (f>0) {res.upkol(b);reverscount++;
		}else { res.reducekol(b); }count++;
	}
	
	static void postavki(){
		System.out.println("\nПоставки: " + Integer.toString(reverscount));
	}
	public void acthist() {
		String outp = "";
		if (this.getacttype() >0) {++count;
				outp += res.getname() + ": " + Double.toString(kolvo) + "\n";
			}
			else { outp += res.getname() + ": " + Double.toString(kolvo * (-1)) + "\n"; }
		System.out.println(outp);
	}
	@Override
  	protected Object clone() throws CloneNotSupportedException {
		this.res = (resource) res.clone();
    	return super.clone();
  	}
}