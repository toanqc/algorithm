package com.algorithm.mum.entry.three;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {

	@SuppressWarnings("rawtypes")
	public List/* implement */objects = new ArrayList/* implement */();

	@SuppressWarnings("rawtypes")
	public DataMiner(List objList) {
		this.objects = objList;
	}

	/* implement */
	private double computeAverageArea() {
		return 0.0;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void putData() {
		Circle c1 = new Circle(4.0);
		Circle c2 = new Circle(3.5);
		Circle c3 = new Circle(5.5);
		Rectangle r1 = new Rectangle(11.0, 4.0);
		Rectangle r2 = new Rectangle(3.0, 9.0);

		List objList = new ArrayList();
		objList.add(r1);
		objList.add(c1);
		objList.add(c2);
		objList.add(r2);
		objList.add(c3);

		DataMiner dataMiner = new DataMiner(objList);
		double computeAverageArea = dataMiner.computeAverageArea();
		System.out.println(computeAverageArea);
	}

	public static void main(String[] args) {
		DataMiner.putData();
	}
}
