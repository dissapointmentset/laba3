package dzhava;

import item

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

	public String soldinfo(List <sold> soldhist) {
		int summ=0;
		String outp = "";
		for (int i = 0; i < soldhist.size(); i++) {
			outp += soldhist[i].item.getname() + ": " + Double.toString(soldhist[i].kolvo) + " = " + Double.toString(soldhist[i].profit) + "\n";
			summ += soldhist[i].profit;
		}outp += "profit:" + to_string(summ)+"\n"; return outp;
	}

}