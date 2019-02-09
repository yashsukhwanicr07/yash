package WalletService;

import Repository.WalletRepoImpl;
import bean.Customer;

public class WalletServiceImpl implements IWalletService {
	
	WalletRepoImpl walletrepoimpl=new WalletRepoImpl();

	@Override
	public Customer createAccount(String name, String phone, double amount) {
		// TODO Auto-generated method stub
		Customer customer=new Customer(name,phone,amount);
		walletrepoimpl.save(customer);
		return customer;
	}
	

	@Override
	public Customer showBalance(String phone) {
		// TODO Auto-generated method stub
		Customer customer=walletrepoimpl.findByPhone(phone);
		double bal=customer.getWallet().getBalance();
		System.out.println(bal);
		return null;
	}

}
