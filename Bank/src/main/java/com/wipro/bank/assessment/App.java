package com.wipro.bank.assessment;

import java.util.ArrayList;
import java.util.List;

import com.wipro.bank.entity.Account;


public class App {
	static final List<Account> accounts = new ArrayList<Account>();

	App() {

	}

	public Account getAccountDetailsByID(int id) {

		Account account = null;
		return account;
	}

	public List<Account> getAccountDetailsByBalance(double amount) {
	    {
            int i;
            List<Account> result=new ArrayList<Account>();
    for(i=0;i<accounts.size();i++)
    {
            if(accounts.get(i).getBalance()>=amount) result.add(accounts.get(i));
    }
    if(result.size()==0)
    {
            return null;
    }
    else
    {
                            return result;
    }
}

}

}

