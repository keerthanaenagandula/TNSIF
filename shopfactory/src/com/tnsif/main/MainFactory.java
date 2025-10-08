package com.tnsif.main;

import com.tnsif.application.GSNormalAcc;
import com.tnsif.application.GSPrimeAcc;

public class MainFactory {

	public static void main(String[] args) {
		GSPrimeAcc gsprime = new GSPrimeAcc(201,"tkr",2000.3f,true);
		GSNormalAcc gsnormal = new GSNormalAcc(202,"teegala",3000.3f,89.4f);

		gsprime.bookProduct(23.3f);
		gsnormal.bookProduct(92.7f);
	}

}
