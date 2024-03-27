package laba3;

import java.util.ArrayList;
import java.util.List;
import laba3.item; 
import laba3.resource;
import laba3.lot;
import laba3.compose;
import laba3.sold;
import laba3.action;
import laba3.soldlot;
import laba3.actionlot;

public class main{
	public static void main(String[] args) throws CloneNotSupportedException {
		
		ArrayList<resource> sklad = new ArrayList<resource>();
        	ArrayList<item> menu = new ArrayList<item>();	
		//ArrayList<action> actions = new ArrayList<action>();
		action[][] actions = new action[3][1];
		ArrayList<sold> solds = new ArrayList<sold>();

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

		lot chockobar = new lot();
		lot cookie = new lot();

		chockobar.setlot("chockobar", 20, 100);
		cookie.consresinit();

		System.out.println(chockobar);
		System.out.println(cookie);

		List <resource> cof = new ArrayList<>(List.of(coffee, milk, sugar));
		List<Double> cs = new ArrayList<>(List.of(0.060,0.090,0.060));
		List<Double> cb = new ArrayList<>(List.of(0.10, 0.150, 0.10));
		List<Double> am = new ArrayList<>(List.of(0.15, 0.0, 0.060));

		compose capuch_small = new compose();
 		compose capuch_big = new compose();
		compose amer = new compose();

		capuch_small.setcompose(cof, cs);
		capuch_big.setcompose(cof, cb);
		amer.setcompose(cof, am);

		item cappuchino_small = new item();
		item cappuchino_big = new item(); 
		item americano = new item();

		cappuchino_big.setitem("cappuchino_big", 180, capuch_big);
		cappuchino_small.setitem("cappuchino_small", 100, capuch_small);
		americano.setitem("americano", 120, amer);
		menu.add(cappuchino_small);menu.add(cappuchino_big);menu.add(americano);

		System.out.println(milk);
		System.out.println(cappuchino_big);
		cappuchino_big.costchange(220);
		cappuchino_big.sostdel();
		cappuchino_big.sostadd(sirop, 0.03);
		System.out.println(cappuchino_big);
		
		sold one = new sold();
		sold two = new sold();

		soldlot a = new soldlot();
		soldlot b = new soldlot();
		a.set(chockobar, 10);
		b.set(cookie, 20);

		one.set(cappuchino_big, 5);
		solds.add(one);
		two.set(cappuchino_small,10);
		solds.add(two);
		one.set(cappuchino_big, 7);

		System.out.println(one);
		one.soldshist(solds);
		System.out.println(chockobar);
		System.out.println(cookie);
		System.out.println(milk);

		action first = new action();
		action second = new action();
		first.count = 0;
		first.reverscount = 0;

		first.set(milk, 2, 0);
		actions[(first.count-1)/actions[0].length][first.count%actions[0].length] = first;
		second.set(chokolate, 10, 1);
		actions[(first.count-1)/actions[0].length][first.count%actions[0].length] = second;
		action third = (action) second.clone();
		first.count+=1;
		first.reverscount+=1;
		actions[(first.count-1)/actions[0].length][first.count%actions[0].length] = third;
		actions[1][0].acthist();
		actions[2][0].acthist();
		first.acthist();

		first.postavki();

		actionlot x = new actionlot();
		actionlot y = new actionlot();

		x.set(chockobar, 10, 1);
		y.set(cookie, 5, 0);

		actions[1][0].acthist();
		actions[2][0].acthist();
		first.acthist();
		System.out.println(milk);

		System.out.println(chockobar);
		System.out.println(cookie);

		System.out.println(Integer.toString(first.numberof()));

}
}