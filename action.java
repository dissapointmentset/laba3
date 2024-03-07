package laba3;
import laba3.item; 
import laba3.resource;
import laba3.compose;
import java.util.ArrayList;


public class action{

	private	resource res;
	private int kolvo;
	private int f;

	public int getacttype() {
		return f;
	}

	public void setaction(resource a, int b, int flag) {
		this.res = a;
		this.kolvo = b;
		this.f = flag;
		if (f>0) {res.upkol(b);
		}else { res.reducekol(b); }
	}

	public void acthist() {
		String outp = "";
		if (this.getacttype() >0) {
				outp += res.getname() + ": " + Double.toString(kolvo) + "\n";
			}
			else { outp += res.getname() + ": " + Double.toString(kolvo * (-1)) + "\n"; }
		System.out.println(outp);
	}
	
}