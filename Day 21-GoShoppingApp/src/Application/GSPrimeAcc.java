package Application;

import Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + "]";
	}

	
}