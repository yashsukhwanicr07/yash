package com.capgemini.service;

import java.math.BigDecimal;
import java.util.regex.Pattern;

import com.capgemini.beans.Customer;
import com.capgemini.beans.Wallet;
import com.capgemini.exception.DuplicatePhoneNo;
import com.capgemini.exception.PhoneNoDoesNotExist;

import com.capgemini.repository.WalletRepo;
import com.capgemini.repository.WalletRepoImpl;

public class WalletServiceImpl implements WalletService {
	
	WalletRepo walletRepo = new WalletRepoImpl();
	

	@Override
	public Customer createAccount(String name, String mobileNumber, BigDecimal amount) throws DuplicatePhoneNo {
		// TODO Auto-generated method stub
		Wallet wallet= new Wallet(amount);
		Customer customer=new Customer(name,mobileNumber,wallet);
		
		if(mobileNumber.length()!=10)
		{
			System.out.println("Not a valid No");
		}
		
		if(Pattern.compile( "[0-9]" ).matcher( name ).find())
		{
			System.out.println("Not a valid Name");
		}
		
		if(walletRepo.findOne(mobileNumber)!=null)
		{
			throw new DuplicatePhoneNo();
		}
		
		walletRepo.save(customer);
		return customer;
	}

	@Override
	public Customer showBalance(String mobileNumber) {
		// TODO Auto-generated method stub
		return walletRepo.findOne(mobileNumber);
	}

	@Override
	public Customer fundTransfer(String sourceMobileNumber, String targetMobileNumber, BigDecimal amount) throws PhoneNoDoesNotExist {
		if(walletRepo.findOne(sourceMobileNumber)==null)
		{
			throw new PhoneNoDoesNotExist();
		}
		if(walletRepo.findOne(targetMobileNumber)==null)
		{
			throw new PhoneNoDoesNotExist();
		}
		
		this.depositAmount(targetMobileNumber, amount);
		this.withdrawAmount(sourceMobileNumber, amount);
		return walletRepo.findOne(sourceMobileNumber);
	}

	@Override
	public Customer depositAmount(String mobileNumber, BigDecimal amount) throws PhoneNoDoesNotExist {
		// TODO Auto-generated method stub
		Customer customer=walletRepo.findOne(mobileNumber);
		Wallet wallet=customer.getWallet();
		wallet.setBalance(wallet.getBalance().add(amount));
		customer.setWallet(wallet);
		if(walletRepo.findOne(mobileNumber)==null)
		{
			throw new PhoneNoDoesNotExist();
		}
		return customer;
	}

	@Override
	public Customer withdrawAmount(String mobileNumber, BigDecimal amount) throws PhoneNoDoesNotExist {
		// TODO Auto-generated method stub
		
		if(walletRepo.findOne(mobileNumber)==null)
		{
			throw new PhoneNoDoesNotExist();
		}
		Customer customer=walletRepo.findOne(mobileNumber);
		Wallet wallet=customer.getWallet();
		wallet.setBalance(wallet.getBalance().subtract(amount));
		customer.setWallet(wallet);
		return customer;
	}

}
