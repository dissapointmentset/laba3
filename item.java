package laba3;
import java.util.Arrays;
import java.util.ArrayList;
import laba3.compose;
import laba3.resource;

public class item<T> extends absitem{ 
	private String name;

	private T cost;

	private compose sost;

	public void setitem(String imya, T price, compose n) {
		this.name = imya;
		this.cost = price;
		this.sost = n; 
	}

	@Override
	public String toString(){
		String outp="";
		for (int i = 0; i < this.sost.n.size(); i++) {
			outp += (this.sost.sost.get(i).getname() + ": " + Double.toString(this.sost.n.get(i)) + "\n");
		}
		return outp;
	}
	@Override
	public T getcost() {
		return cost;
	}

	public String getname() {
		return name;
	}

	public compose getsost() {
		return sost;
	}

	public void costchange(T b) {
		this.cost = b;
	}

	public void sostadd(resource res, double k) {
		this.sost.sost.add(res);
		this.sost.n.add(k);
		this.sost.uplen();
	}
	@Override
	public void sostdel() {
		this.sost.sost.remove(this.sost.sost.size()-1);
		this.sost.n.remove(this.sost.n.size()-1);
		this.sost.reduselen();
	}
	
}