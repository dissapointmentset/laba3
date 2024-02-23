package dzhava;

import resource
public class compose{
	public List <resource> sost;
	public unsigned int k;
	public List <double> n;
	public void setcompose(List <resource> cons, List <double> m) {
		int i = 0;
		for (i; i < cons.size(); i++) {
			sost.add(cons[i]);
			n.add(m[i]);
		}this.k = cons.size();
	}

	public unsigned int getlen() {
		return k;
	}
	public void reduselen() {
		this.k-=1;
	}

	public void uplen() {
		this.k+=1;
	}
}