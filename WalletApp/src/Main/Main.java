package Main;

import java.util.Scanner;

import Repository.IWalletRepo;
import Repository.WalletRepoImpl;
import WalletService.WalletServiceImpl;
import bean.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		WalletServiceImpl walletserviceimpl=new WalletServiceImpl();
		WalletRepoImpl walletrepoimpl=new WalletRepoImpl();
		System.out.println("Enter customer name,phone,amount");
		System.out.println(walletserviceimpl.createAccount(scanner.next(), scanner.next(), scanner.nextDouble()));
		System.out.println("Enter customer phone no");
		Customer c=walletserviceimpl.showBalance(scanner.next());
}
}
