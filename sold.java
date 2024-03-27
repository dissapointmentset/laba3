package laba3;

import laba3.lot;
import laba3.item; 
import laba3.resource;
import laba3.compose;
import laba3.manager;
import java.util.ArrayList;


public class sold{
	private item item;
	
	protected int kolvo;

	protected int profit;

	public void set(item coffee, int kolich) {
		this.item = coffee;	
		this.kolvo = kolich;
		this.profit = (kolich * (int)coffee.getcost());
		for (int i = 0; i < item.getsost().getlen();i++) {
			item.getsost().sost.get(i).reducekol(item.getsost().n.get(i) * kolich);
		}
	}
	@Override
	public String toString(){
		return this.item.getname() + " : " + Integer.toString(this.kolvo) + "=" + Integer.toString(this.profit)+"\n";
	}
	public String soldshist(ArrayList<sold> soldhist){
		int summ=0;
		String outp = "";
		for (int i = 0; i < soldhist.size(); i++) {
			outp += soldhist.get(i).item.getname() + ": " + Double.toString(soldhist.get(i).kolvo) + " = " + Double.toString(soldhist.get(i).profit) + "\n";
			summ += soldhist.get(i).profit;
		}outp += "profit:" + Integer.toString(summ)+"\n";return outp;
	}
}
