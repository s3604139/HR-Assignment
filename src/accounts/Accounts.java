package accounts;

import java.util.*;

//Class holding all accounts
public class Accounts {
	
	//list of all accounts
	public List<Account> accounts;
	
	//create empty list in constructor
	public Accounts()
	{
		accounts=new ArrayList<Account>();
	}
	
	public void addAccount(Account account)
	{
	//class adds new account to list of existing accounts
		accounts.add(account);
	}
}
