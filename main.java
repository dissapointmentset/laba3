package dzhava

import java.util.Vector;

import item; 

import resource;

import compose;

import sold;

import action;

public static void main(String[] args) {
		
		ArrayList<resource> sklad = new ArrayList<resource>();
        	ArrayList<item> menu = new ArrayList<item>();	
		ArrayList<sold> soldhist = new ArrayList<sold>();
		ArrayList<action> acthist = new ArrayList<action>();

		resource milk = new resource();
		resource coffee = new resource();
		resource sugar = new resource();
		resource chokolate = new resource();
		resource sirop = new resource();

		milk.setresource("milk", 30);
		sklad.add(milk);
		chokolate.setresource("chokolate", 200);
		sklad.add(chokolate);
		coffee.setresource("coffee", 50);
		sklad.add(coffee);
		sirop.setresource("sirop", 20);
		sklad.add(sirop);
		sugar.consresinit();
		sklad.add(sugar);

		ArrayList <resource> cof = new ArrayList<>();
		cof.add(coffe); cof.add(milk); cof.add(sugar);
		ArrayList<double> cs = new ArrayList<double>(){ 0.060, 0.090, 0.060 };
		ArrayList<double> cb = new ArrayList<double>(){ 0.10, 0.150, 0.10 };
		ArrayList<double> am = new ArrayList<double>(){ 0.15, 0.0, 0.060 };

		compose capuch_small = new compose();
 		compos capuch_big = new compose();
		compose amer = new compose();

		capuch_small.setcompose(cof, cs);
		capuch_big.setcompose(cof, cb);
		amer.setcompose(cof, am);

		item cappuchino_small = new item();
		item cappuchino_big = new item(); 
		item americano = new item();

		appuchino_big.setitem("cappuchino_big", 180, capuch_big, menu);
		cappuchino_small.setitem("cappuchino_small", 100, capuch_small, menu);
		americano.setitem("americano", 120, amer, menu);

		milk.showres();
		cappuchino_big.showsost();
		cappuchino_big.costchange(220);
		cappuchino_big.sostdel(1);
		cappuchino_big.sostadd(sirop, 0.03);

		cappuchino_big.showsost();
		//cout << to_string(cappuchino_big.getcost())+"\n";

		sold one = new sold();
		sold two = new sold();

		one.soldinfo(soldhist);
		milk.showres();

		action first = new action();
		action second = new action();

		first.setaction(milk, 2, 0, actions);
		second.setaction(chokolate, 10, 1, actions);

		second.acthist();
		first.acthist();
		milk.showres();


}