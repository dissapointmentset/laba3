package dzhava;



public class action{

	private	resource res;
	private int kolvo;
	private int f;

	public int getacttype() {
		return f;
	}

	public void setaction(resource a, unsigned int b, bool flag) {
		this.res = a;
		this.kolvo = b;
		this.f = flag;
		if (f) {res.upkol(b);
		}else { res.reducekol(b); }
	}

	public String acthist() {
		string outp = "";
		if (this.getacttype() == 1) {
				outp += res.getname() + ": " + Double.toString(kolvo) + "\n";
			}
			else { outp += res.getname() + ": " + Double.toString(kolvo * (-1)) + "\n"; }
		return outp;
	}
	
}