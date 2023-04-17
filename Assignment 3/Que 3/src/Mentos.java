package org.sales.domain;

import org.sales.domain.Sales;

public class Mentos {

	public static void main(String[] args) {
		Sales warehouse = new Sales();
		warehouse.start();
		warehouse.scanClose();
	}

}