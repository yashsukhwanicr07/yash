package Repository;

import java.util.ArrayList;
import java.util.List;

import bean.Customer;

public class WalletRepoImpl implements IWalletRepo
{ 
List<Customer> list=new ArrayList<Customer>();
@Override
public boolean save(Customer c) {
	list.add(c);
	return true;
}

@Override
public Customer findByPhone(String phone) {
	// TODO Auto-generated method stub
	for(Customer i:list)
	{
		if(i.getPhone().compareTo(phone)==0)
		{
			return i;
		}
	}
	return null;
}
}
