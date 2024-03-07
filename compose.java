package laba3;
import java.util.ArrayList;
import java.util.List;
import laba3.resource;
public class compose{
	public ArrayList<resource> sost = new ArrayList<>();
	public int k;
	public ArrayList<Double> n = new ArrayList<>(); 
	public void setcompose(List <resource> cons, List <Double> m) {
		int i;
		for (i = 0; i < cons.size(); i++) {
			sost.add(cons.get(i));
			n.add(m.get(i));
		}this.k = cons.size();
	}

	public int getlen() {
		return k;
	}
	public void reduselen() {
		this.k-=1;
	}

	public void uplen() {
		this.k+=1;
	}
}