package bean;

public class Customer 
{
	private String name;
	private String phone;
	private Wallet wallet;
	public Customer(String name,String phone,double amount){
		this.name=name;
		this.phone=phone;
		this.wallet=new Wallet();
		wallet.setBalance(amount);
		wallet.setId(phone);
	}
	public Customer()
	{}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "" + phone + ""+wallet.getBalance(); 
	}
	

}
