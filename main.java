package laba3;
import java.util.ArrayList;
import java.util.List;
import laba3.item; 
import laba3.resource;
import laba3.compose;
import laba3.sold;
import laba3.action;
public class main{
	public static void main(String[] args) {
		
		ArrayList<resource> sklad = new ArrayList<resource>();
        	ArrayList<item> menu = new ArrayList<item>();	
		ArrayList<action> actions = new ArrayList<action>();
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

		milk.showres();
		cappuchino_big.showsost();
		cappuchino_big.costchange(220);
		cappuchino_big.sostdel();
		cappuchino_big.sostadd(sirop, 0.03);
		cappuchino_big.showsost();
		
		sold one = new sold();
		sold two = new sold();

		one.setsold(cappuchino_big, 5);
		solds.add(one);
		two.setsold(cappuchino_small,10);
		solds.add(two);

		one.soldinfo();
		one.soldshist(solds);
		milk.showres();

		action first = new action();
		action second = new action();

		first.setaction(milk, 2, 0);
		actions.add(first);
		second.setaction(chokolate, 10, 1);
		actions.add(second);

		second.acthist();
		first.acthist();
		milk.showres();

}
}