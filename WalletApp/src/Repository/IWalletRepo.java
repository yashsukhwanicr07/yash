package Repository;

import bean.Customer;

public interface IWalletRepo 
{
	public boolean save(Customer c);
	Customer findByPhone(String phone);

}
