package laba3;
import java.util.Arrays;
import java.util.ArrayList;
import laba3.compose;
import laba3.resource;

public abstract class absitem<T> {

    private String name;

	private T cost;

	private compose sost;

    public abstract void sostdel();

    public T getcost() {
		return cost;
	}

	public String getname() {
		return name;
	}

	public compose getsost() {
		return sost;
	}
}