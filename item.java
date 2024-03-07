package laba3;
import java.util.Arrays;
import java.util.ArrayList;
import laba3.compose;
import laba3.resource;

public class item{
	private String name;

	private int cost;

	private compose sost;

	public void setitem(String imya, int price, compose n) {
		this.name = imya;
		this.cost = price;
		this.sost = n; 
	}

	public void showsost() {
		String outp="";
		for (int i = 0; i < this.sost.n.size(); i++) {
			outp += (this.sost.sost.get(i).getname() + ": " + Double.toString(this.sost.n.get(i)) + "\n");
		}System.out.println(outp);
	}

	public int getcost() {
		return cost;
	}

	public String getname() {
		return name;
	}

	public compose getsost() {
		return sost;
	}

	public void costchange(int b) {
		this.cost = b;
	}

	public void sostadd(resource res, double k) {
		this.sost.sost.add(res);
		this.sost.n.add(k);
		this.sost.uplen();
	}

	public void sostdel() {
		this.sost.sost.remove(this.sost.sost.size()-1);
		this.sost.n.remove(this.sost.n.size()-1);
		this.sost.reduselen();
	}

	
}