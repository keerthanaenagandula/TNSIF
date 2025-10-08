
package com.tnsif.application;

import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.ShopFactory;

public class GSShopFactory implements ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAcc(int accNo,String accNm,float charges,boolean isPrime) {
		PrimeAcc pri = new PrimeAcc(accNo,accNm,charges,isPrime);
		return pri;
	}


	public NormalAcc getNewNormalAcc(int accNo,String accNm,float charges,float deliveryCharge) {
		NormalAcc normal = new NormalAcc(accNo,accNm,charges,deliveryCharge);
		return normal;
	}

	

	

	
	
}

