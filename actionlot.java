package laba3;
import laba3.item; 
import laba3.resource;
import laba3.compose;
import java.util.ArrayList;
import laba3.action;
import laba3.manager;
import laba3.lot;

public class actionlot extends action{
    private lot res;
    public int getacttype() {
		return f;
	}
    public void set(lot a, int b, int flag) {
	this.res = a;
	this.kolvo = b;
	this.f = flag;
	if (f>0) {res.upkol(b);count++;
		}else { res.reducekol(b); }
	}
	public void acthist() {
		String outp = "";
		if (this.getacttype() >0) {++count;
				outp += res.getname() + ": " + Double.toString(kolvo) + "\n";
			}
			else { outp += res.getname() + ": " + Double.toString(kolvo * (-1)) + "\n"; }
		System.out.println(outp);
	}

}