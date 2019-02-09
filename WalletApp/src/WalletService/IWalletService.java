package WalletService;

import bean.Customer;

public interface IWalletService 
{
	public Customer createAccount(String name,String phone,double amount);
	public Customer showBalance(String phone);
}
