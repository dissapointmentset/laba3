package dzhava;

import compose
import resource

public class item{
	private String name;

	private unsigned int cost;

	private compose sost;

	public void setitem(String imya, unsigned int price, compose n) {
		this.name = imya;
		this.cost = price;
		this.sost = n; 
	}

	public String showsost() {
		String outp="";
		for (int i = 0; i < this.sost.n.size(); i++) {
			outp += (this.sost.sost[i].getname() + ": " + Double.toString(this.sost.n[i]) + "\n");
		}return outp;
	}

	public unsigned int getcost() {
		return cost;
	}

	public String getname() {
		return name;
	}

	public compose getsost() {
		return sost;
	}

	public void costchange(unsigned int b) {
		this.cost = b;
	}

	public void sostadd( resource res, double k) {
		this.sost.sost.add(res);
		this.sost.n.add(k);
		this.sost.uplen();
	}

	public void sostdel() {
		this.sost.sost = Arrays.copyOf(this.sost.sost, this.sost.sost.length-1);
		this.sost.n = Arrays.copyOf(this.sost.n, this.sost.n.length-1);
		this.sost.reduselen();
	}

	
}