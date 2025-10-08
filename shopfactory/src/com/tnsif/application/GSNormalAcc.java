
	package com.tnsif.application;

	import com.tnsif.framework.NormalAcc;

	public class GSNormalAcc extends NormalAcc{

		public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
			super(accNo, accNm, charges, deliveryCharge);
			// TODO Auto-generated constructor stub
		}

		public void bookProduct(float charges)
		{
		System.out.println("Hy user your charges are : "+charges +"and the deliverycharges are : "+deliveryCharge );	
		
		}

		@Override
		public String toString() {
			return "GSNormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + accNo + ", accNm=" + accNm + ", charges="
					+ charges + "]";
		}
		
		
	}


