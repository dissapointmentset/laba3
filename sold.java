package dzhava;

import item;
import resource;
import compose;
import java.util.java.util.ArrayList;

public class sold{
	private item item;
	
	private unsigned int kolvo;

	private int profit;

	public void setsold(item coffee, unsigned int kolich) {
		this.item = coffee;
		this.kolvo = kolich;
		this.profit = kolich * coffee.getcost();
		for (int i = 0; i < item.getsost().getlen();i++) {
			item.getsost().sost[i].reducekol(item.getsost().n[i] * kolich);
		}
	}

	public void soldinfo() {
		int summ=0;
		String outp = this.item.getname() + " : " + Integer.toString(this.kolvo) + "=" + Integer.toString(this.profit)+"\n";
		System.out.println(outp);
	}
	public void soldshist(List<sold> soldhist){
		for (int i = 0; i < soldhist.size(); i++) {
			outp += soldhist[i].item.getname() + ": " + Double.toString(soldhist[i].kolvo) + " = " + Double.toString(soldhist[i].profit) + "\n";
			summ += soldhist[i].profit;
		}outp += "profit:" + to_string(summ)+"\n"; System.out.println(outp);
	}

}