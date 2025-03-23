package Manager;

import Account.Account;

public class Manager extends Account {
	@Override
	public double calsal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return sal+bonus-tax;
	}

}
