package laba3;

import laba3.sold;
import laba3.lot;
import laba3.item; 
import laba3.resource;
import laba3.compose;
import laba3.manager;
import java.util.ArrayList;



class soldlot extends sold{
	private lot item;
    public void set(lot coffee, int kolich){
        this.item = coffee;
		this.kolvo = kolich;
		this.profit = kolich * (int)coffee.getcost();
		item.reducekol(kolich);
    }
    @Override
	public String toString(){
		return this.item.getname() + " : " + Integer.toString(this.kolvo) + "=" + Integer.toString(this.profit)+"\n";
	}
}