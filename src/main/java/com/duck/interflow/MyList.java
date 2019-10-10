package com.duck.interflow;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	
	private List<Integer> list = new ArrayList<>();
	
	public void add(int i) {
		list.add(i);
	}
	
	public int size() {
		return list.size();
	}
}
